package com.tlabs.btechpapers.Activity;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.OpenableColumns;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.UploadTask;
import com.tlabs.btechpapers.Adapters.DialogAdapter;
import com.tlabs.btechpapers.HelperClasses.Methods;
import com.tlabs.btechpapers.R;

import java.io.File;
import java.util.ArrayList;

public class AddPapers extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    EditText name,mail,phone,message;
    AppCompatSpinner branchSpinner,semSpinner;
    Button send;
    String sem,branch,filename="",key;
    DatabaseReference databaseReference;
    TextView textView;
    int branchPosition,semPosition, fileNumbers =0,success=0,failed=0,toUpload=0;
    double bytesTransferred=0;
    int fileBytes=0,successBytes=0;
    boolean isFilePick =false,hasMultiples=false;

    View dialogView;
    ProgressBar progressBar;
    AlertDialog alertDialog;

    ArrayList<Uri> uriArrayList;
    ArrayList<String> filenames;
    ArrayList<Boolean> status;
    ArrayList<Integer> fileSize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        if (Methods.isFirstOpen(this)) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                    1);
            Methods.saveFirstOpen(this,false);
        }
        uriArrayList=new ArrayList<>();
        status=new ArrayList<>();
        filenames=new ArrayList<>();
        fileSize=new ArrayList<>();

        name=findViewById(R.id.name);
        mail=findViewById(R.id.mail);
        phone=findViewById(R.id.phone);
        message=findViewById(R.id.message);
        textView=findViewById(R.id.filename);
        branchSpinner= findViewById(R.id.branch);
        semSpinner= findViewById(R.id.sem);
        send=findViewById(R.id.send);


        ArrayAdapter<CharSequence> branchAdapter = ArrayAdapter.createFromResource(this,
                R.array.branch, android.R.layout.simple_spinner_item);
        branchAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        branchSpinner.setAdapter(branchAdapter);
        branchSpinner.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> semAdapter = ArrayAdapter.createFromResource(this,
                R.array.sem, android.R.layout.simple_spinner_item);
        semAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        semSpinner.setAdapter(semAdapter);
        semSpinner.setOnItemSelectedListener(this);



        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Methods.checkPermissions(AddPapers.this, Manifest.permission.READ_EXTERNAL_STORAGE,
                        "To attach papers we need to read data from your storage. Click continue to grant permission",
                        "To attach papers we need to read data from your storage. You can give storage permission from settings.",
                        3)) {
                    pickFile();
                }
            }
        });

        send.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("InflateParams")
            @Override
            public void onClick(View view) {
                if (Methods.isConnected(AddPapers.this)){
                final String Name = name.getText().toString();
                String Mail = mail.getText().toString();
                String Phone = phone.getText().toString();
                String Message = message.getText().toString();
                Methods.saveUserDetails(AddPapers.this,Name,Mail,Phone,branchPosition,semPosition);

                if (Name.isEmpty()) {
                    name.setError("Name is required");
                    name.requestFocus();
                } else if (!Methods.isValidEmail(Mail)) {
                    mail.setError("Not a valid mail");
                    mail.requestFocus();
                } else if (!Phone.isEmpty() && Phone.length() != 10) {
                    phone.setError("Not a valid phone no.");
                    phone.requestFocus();
                } else if (branch.equals("Select")) {
                    Toast.makeText(AddPapers.this, "Please Select branch", Toast.LENGTH_SHORT).show();
                } else if (sem.equals("2")) {
                    Toast.makeText(AddPapers.this, "Please select semester", Toast.LENGTH_SHORT).show();
                } else if (fileNumbers ==0) {
                    Toast.makeText(AddPapers.this, "Please Attach Your papers", Toast.LENGTH_SHORT).show();
                } else {

                    dialogView = LayoutInflater.from(AddPapers.this).inflate(R.layout.dialog_design, null);
                   // dialogView = View.inflate(AddPapers.this, R.layout.dialog_design, null);
                    progressBar=dialogView.findViewById(R.id.progress);
                    progressBar.setMax(fileBytes);
                    progressBar.setProgress(0);
                    progressBar.setVisibility(View.VISIBLE);
                    alertDialog = new AlertDialog.Builder(AddPapers.this)
                            .setTitle("Uploading " + fileNumbers +" file(s)")
                            .setMessage(success+" file(s) uploaded and "+failed+" file(s) failed to upload")
                            .setView(dialogView)
                            .create();
                    alertDialog.setCanceledOnTouchOutside(false);
                    alertDialog.setCancelable(false);
                    alertDialog.show();

                    databaseReference= FirebaseDatabase.getInstance().getReference().child("users").child(branch).child(sem).push();
                    key=databaseReference.getKey();
                    databaseReference.child("name").setValue(Name);
                    databaseReference.child("mail").setValue(Mail);
                    databaseReference.child("phone").setValue(Phone);
                    databaseReference.child("message").setValue(Message)
                            .addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {


                                    uploadFiles();
                                }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {

                            final AlertDialog.Builder builder=Methods.builder(AddPapers.this,"Error",
                                    "An unknown error occurred while communicating with server. Please retry and if problem continues" +
                                            " then report this issue");
                            builder.setCancelable(false);
                            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    dialogInterface.dismiss();
                                    alertDialog.dismiss();
                                }
                            }).show();
                        }
                    });

                }
            }
                else {
                    Toast.makeText(AddPapers.this, "Please Connect to Internet", Toast.LENGTH_SHORT).show();
                }
        }
                        });

            }

    private void uploadFiles() {
        if (toUpload>= fileNumbers) {
        alertDialog.dismiss();



        AlertDialog.Builder alertDialog = new AlertDialog.Builder(AddPapers.this);
                LayoutInflater inflater = getLayoutInflater();
                View convertView = inflater.inflate(R.layout.summary, null);
                alertDialog.setView(convertView);
                alertDialog.setTitle("Summary");
                alertDialog.setCancelable(false);
                alertDialog.setMessage(success+" file(s) uploaded successfully "+"and "+failed+" file(s) failed to upload");


                RecyclerView list = convertView.findViewById(R.id.statusRecyclerView);
                list.setLayoutManager(new LinearLayoutManager(this));
                DialogAdapter adapter = new DialogAdapter(this,filenames,status);
                list.setAdapter(adapter);
                alertDialog.setPositiveButton("CLOSE", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        setDefaults();
                    }
                }).show();


            }
        else {
            final Uri uri = uriArrayList.get(toUpload);
            FirebaseStorage.getInstance().getReference().child("by users").child(branch).child(sem).
                    child(key).child(uri.getLastPathSegment()).putFile(uri)
                    .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                            success++;
                            successBytes=successBytes+fileSize.get(toUpload);
                            toUpload++;
                            filenames.add(new File(uri.getPath()).getName());
                            status.add(true);
                            uploadFiles();


                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    failed++;
                    successBytes=successBytes+fileSize.get(toUpload);
                    toUpload++;
                    filenames.add(new File(uri.getPath()).getName());
                    status.add(false);
                    uploadFiles();

                }
            }).addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
                @Override
                public void onProgress(@NonNull UploadTask.TaskSnapshot snapshot) {
                    bytesTransferred=snapshot.getBytesTransferred();
                    runOnUiThread(updateDialog);
                }
            });

        }
    }

    private void setDefaults() {
        filenames.clear();
        status.clear();
        uriArrayList.clear();
        fileSize.clear();
        textView.setText(R.string.noFile);
        fileNumbers =0;
        success=0;
        failed=0;
        toUpload=0;
        fileBytes=0;
        successBytes=0;
        bytesTransferred=0;
        filename="";

    }

    private void pickFile() {
        isFilePick =true;
        setDefaults();
        /*
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_GET_CONTENT);
        intent.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);
        intent.setType("application/pdf"); */

        String[] mimeTypes = {"image/*", "application/pdf"};

        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        intent.putExtra(Intent.EXTRA_ALLOW_MULTIPLE,true);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            intent.setType("*/*");
            intent.putExtra(Intent.EXTRA_MIME_TYPES, mimeTypes);
        } else {
            StringBuilder mimeTypesStr = new StringBuilder();

            for (String mimeType : mimeTypes) {
                mimeTypesStr.append(mimeType).append("|");
            }

            intent.setType(mimeTypesStr.substring(0, mimeTypesStr.length() - 1));
        }

        startActivityForResult(intent, 2);


    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==2 && resultCode==RESULT_OK && data!=null){
            StringBuilder output = new StringBuilder();
            output.append("");

                if (data.getClipData() != null){
                    fileNumbers =data.getClipData().getItemCount();
                    hasMultiples=true;
                    for (int index = 0; index < fileNumbers; index++) {
                        Uri uri = data.getClipData().getItemAt(index).getUri();
                        uriArrayList.add(uri);
                        File file=new File(uri.getPath());
                        output.append(file.getName()).append("\n");
                      fileBytes=fileBytes+getFileBytes(uri);
                        fileSize.add(getFileBytes(uri));


                    }
                    filename=output.toString();
                }else{

                    fileNumbers =1;
                 Uri uri = data.getData();
                 uriArrayList.add(uri);
                    File file=new File(uri.getPath());
                    filename=file.getName();
                    fileBytes=getFileBytes(uri);
                    fileSize.add(getFileBytes(uri));
                }
            textView.setText(filename);
            textView.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));


        }
    }
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        if (adapterView.getId() == R.id.sem) {
                sem = String.valueOf(i + 2);
                semPosition=i;
        }
        if (adapterView.getId() == R.id.branch) {
            branch = Methods.returnBranch(i);
            branchPosition=i;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        if (adapterView.getId() == R.id.sem) {
            sem = "Select";
            semPosition = 0;
        }
        if (adapterView.getId()==R.id.branch) {
            branch = "2";
            branchPosition = 0;
        }
    }
    @Override
    protected void onStart() {
        super.onStart();
        if (!isFilePick)
        Methods.retrieveUserDetails(this,name,mail,phone,branchSpinner,semSpinner);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode==3){
            if (grantResults.length > 0
                    && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                pickFile();
            }

        }
    }
    private final Runnable updateDialog = new Runnable() {
        @Override
        public void run() {
          progressBar.setProgress((int)(bytesTransferred+successBytes));
                alertDialog.setMessage(success+" file(s) uploaded and "+failed+" file(s) failed to upload");
        }
    };
    private int getFileBytes(Uri uri){
        try (Cursor returnCursor = getContentResolver().query(uri, null, null, null, null)) {
            int sizeIndex = returnCursor.getColumnIndex(OpenableColumns.SIZE);
            returnCursor.moveToFirst();
            return (int) returnCursor.getLong(sizeIndex);
        }
    }

}