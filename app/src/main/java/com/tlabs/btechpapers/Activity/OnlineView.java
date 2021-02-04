/*
 * Copyright 2020 Pratyush Tiwari
 *  Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Created by Pratyush Tiwari on 31/1/21 7:35 PM
 *  Last modified 31/1/21 7:21 PM
 *
 *
 */

package com.tlabs.btechpapers.Activity;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.OpenableColumns;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.AdView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.tlabs.btechpapers.Adapters.PaperAdapter;
import com.tlabs.btechpapers.BuildConfig;
import com.tlabs.btechpapers.HelperClasses.AdHelper;
import com.tlabs.btechpapers.HelperClasses.Methods;
import com.tlabs.btechpapers.R;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

import static com.tlabs.btechpapers.HelperClasses.Methods.isNightModeActive;

public class OnlineView extends AppCompatActivity {
    String sem,branch;
    View view,dialogView;
    EditText editTitle;
    TextView filename;
    Uri uploadUri;
    ArrayList<String> buttonText,downloadUrl;
    ArrayList<File> files;
    ProgressBar progressBar;
    AlertDialog showProgress;
    double bytesTransferred=0;
    int fileBytes=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_papers);
        if(isNightModeActive(this))
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        else AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        sem=getIntent().getStringExtra("sem");
        branch =getIntent().getStringExtra("branch");
        Objects.requireNonNull(getSupportActionBar()).setTitle(sem);

        buttonText=new ArrayList<>();
        downloadUrl=new ArrayList<>();
        files=new ArrayList<>();

        AdView adView=findViewById(R.id.adView);
        AdHelper.implementBanner(this,adView);

        final AlertDialog progressDialog=Methods.progressDialog(this,"Fetching data...");
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setCancelable(true);
        progressDialog.show();
        String destination="."+branch+"/"+sem;
        final File  folder = new File(this.getExternalFilesDir(null),destination);
        if (!folder.exists())
            folder.mkdirs();

        CollectionReference collectionReference= FirebaseFirestore.getInstance().collection("Online Contents")
                .document(branch).collection(sem);
        collectionReference.get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task) {
                if (task.isSuccessful()){

                    for (QueryDocumentSnapshot document : task.getResult()) {
                        String title=document.getString("title");
                        String url=document.getString("url");
                        boolean isVisible;
                        try {
                            isVisible=document.getBoolean("isVisible");
                        } catch (NullPointerException e){
                            isVisible=false;
                        }

                        if (url!=null && isVisible){
                           buttonText.add(title);
                           downloadUrl.add(url);
                           files.add(new File(folder, document.getId()+".pdf"));
                        }
                    }
                    PaperAdapter paperAdapter=new PaperAdapter(OnlineView.this,buttonText,files,downloadUrl);
                    RecyclerView recyclerView=findViewById(R.id.buttonRecyclerView);
                    recyclerView.setLayoutManager(new LinearLayoutManager(OnlineView.this));
                    recyclerView.setAdapter(paperAdapter);
                    Toast.makeText(OnlineView.this, buttonText.size()+" shared contents available", Toast.LENGTH_SHORT).show();


                }
                else {
                    Toast.makeText(OnlineView.this, "Couldn't fetch data", Toast.LENGTH_SHORT).show();
                }
                progressDialog.dismiss();
            }
        });


        view = View.inflate(this, R.layout.upload_dialog, null);
        editTitle = view.findViewById(R.id.editTextDialogUserInput);
        filename=view.findViewById(R.id.filename);



    }
    private void pickFile() {
        /*
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_GET_CONTENT);
        intent.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);
        intent.setType("application/pdf"); */

        String[] mimeTypes = {"application/pdf"};

        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        intent.putExtra(Intent.EXTRA_ALLOW_MULTIPLE,false);
        intent.setType("*/*");
        intent.putExtra(Intent.EXTRA_MIME_TYPES, mimeTypes);
        startActivityForResult(intent, 2);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.online_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if (id==R.id.refresh){
            Intent intent=new Intent(this,OnlineView.class);
            intent.putExtra("sem",sem);
            intent.putExtra("branch", branch);
            startActivity(intent);
            finish();
        }
        else  if(id==R.id.offline){
            Intent intent=new Intent(this,Papers.class);
            intent.putExtra("sem",sem);
            intent.putExtra("branch", branch);
            startActivity(intent);
            finish();
        }
        else if(id==R.id.add){
            filename.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (Methods.isFirstOpen(OnlineView.this,"firstOpen")) {
                        ActivityCompat.requestPermissions(OnlineView.this,new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},3);
                    Methods.saveFirstOpen(OnlineView.this,false,"firstOpen");
                    } else if(Methods.checkPermissions(OnlineView.this,Manifest.permission.READ_EXTERNAL_STORAGE,
                            "To pick files from your storage app needs storage permission. Click CONTINUE to give them",
                            "To pick files from your storage app needs storage permission. You can give them from Settings",
                            3))
                        pickFile();
                }
            });
            final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                   builder .setTitle("Share Content").setMessage(getApplicationContext().getResources().getString(R.string.online_info));
                   if (view.getParent()!=null)
                       ((ViewGroup)view.getParent()).removeView(view);
                    builder.setView(view);
                   builder.setCancelable(false)
                    .setPositiveButton("Add", null)
                    .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    });
                   final AlertDialog alertDialog=builder.create();

           alertDialog.setCanceledOnTouchOutside(false);
           alertDialog.setOnShowListener(new DialogInterface.OnShowListener() {
               @Override
               public void onShow(DialogInterface dialogInterface) {
                   Button positiveButton = alertDialog.getButton(AlertDialog.BUTTON_POSITIVE);
                   positiveButton.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View view) {
                           String title=editTitle.getText().toString();
                           if (title.length()<5) {
                               editTitle.setError("Minimum 5 characters are required");
                               editTitle.requestFocus();
                           }
                           else if(uploadUri ==null){
                               Toast.makeText(OnlineView.this, "No file selected", Toast.LENGTH_SHORT).show();
                           }
                           else{

                               dialogView = LayoutInflater.from(OnlineView.this).inflate(R.layout.dialog_design, null);
                               progressBar=dialogView.findViewById(R.id.progress);
                               progressBar.setMax(fileBytes);
                               progressBar.setProgress(0);
                               progressBar.setVisibility(View.VISIBLE);

                               showProgress = new AlertDialog.Builder(OnlineView.this)
                                       .setTitle("Uploading...")
                                       .setMessage(filename.getText().toString()+" is being uploaded.")
                                       .setView(dialogView)
                                       .create();
                               showProgress.setCanceledOnTouchOutside(false);
                               showProgress.setCancelable(false);
                               showProgress.show();

                               HashMap<String,Object> map=new HashMap<>();
                               map.put("title",title);
                               map.put("url",null);
                               map.put("isVisible",false);

                               CollectionReference collectionReference= FirebaseFirestore.getInstance().collection("Online Contents")
                                       .document(branch).collection(sem);
                               collectionReference.add(map).addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
                                   @Override
                                   public void onComplete(@NonNull Task<DocumentReference> task) {

                                       if (task.isSuccessful()){
                                           final DocumentReference documentReference=task.getResult();

                                           StorageReference storageReference = FirebaseStorage.getInstance().getReference().
                                                   child("Online Contents").child(branch).child(sem).child(documentReference.getId());
                                           storageReference.putFile(uploadUri).addOnCompleteListener(new OnCompleteListener<UploadTask.TaskSnapshot>() {
                                               @Override
                                               public void onComplete(@NonNull Task<UploadTask.TaskSnapshot> task) {
                                                   if (task.isSuccessful()){
                                                       task.getResult().getMetadata().getReference().getDownloadUrl()
                                                               .addOnSuccessListener(new OnSuccessListener<Uri>() {
                                                                   @Override
                                                                   public void onSuccess(Uri uri) {
                                                                       documentReference.update("url",uri.toString(),
                                                                               "isVisible",true);
                                                                       showProgress.dismiss();
                                                                       Toast.makeText(OnlineView.this, "Added, Please refresh to view", Toast.LENGTH_SHORT).show();
                                                                       filename.setText("No file selected");
                                                                       fileBytes=0;
                                                                       bytesTransferred=0;
                                                                       uploadUri=null;
                                                                       editTitle.setText("");
                                                                   }
                                                               });


                                                   } else {
                                                       showProgress.dismiss();
                                                       AlertDialog.Builder failedBuilder=Methods.builder(OnlineView.this,
                                                               "Error",task.getException().getMessage());
                                                       failedBuilder.setCancelable(false);
                                                       failedBuilder.setPositiveButton("CLOSE", new DialogInterface.OnClickListener() {
                                                           @Override
                                                           public void onClick(DialogInterface dialogInterface, int i) {
                                                               dialogInterface.dismiss();
                                                           }
                                                       }).show();
                                                   }
                                               }
                                           })
                                           .addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
                                               @Override
                                               public void onProgress(@NonNull UploadTask.TaskSnapshot snapshot) {
                                                   bytesTransferred=snapshot.getBytesTransferred();
                                                   runOnUiThread(updateDialog);
                                               }
                                           });



                                       } else {
                                           showProgress.dismiss();

                                           AlertDialog.Builder failedBuilder=Methods.builder(OnlineView.this,
                                                   "Error",task.getException().getMessage());
                                           failedBuilder.setCancelable(false);
                                           failedBuilder.setPositiveButton("CLOSE", new DialogInterface.OnClickListener() {
                                               @Override
                                               public void onClick(DialogInterface dialogInterface, int i) {
                                                   dialogInterface.dismiss();
                                               }
                                           }).show();

                                       }
                                   }
                               });
                               alertDialog.dismiss();
                           }
                       }
                   });
               }
           });
           alertDialog.show();

        } else if(id==R.id.irrelevant){
            Methods.contactDeveloper(this,"Regarding irrelevant content in B.Tech Papers application",
                    "Branch-"+branch+"<br>"+"Semester-"+sem+"<br>"+"Version Code-"+BuildConfig.VERSION_CODE+"<br>"+"Version Name-"+BuildConfig.VERSION_NAME
            +"<br><br> Provide some more info about what and why you found content irrelevant");
        }
        return true;
    }
    private final Runnable updateDialog = new Runnable() {
        @Override
        public void run() {
            progressBar.setProgress((int)(bytesTransferred));
        }
    };
    private int getFileBytes(Uri uri){
        try (Cursor returnCursor = getContentResolver().query(uri, null, null, null, null)) {
            int sizeIndex = returnCursor.getColumnIndex(OpenableColumns.SIZE);
            returnCursor.moveToFirst();
            return (int) returnCursor.getLong(sizeIndex);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==2 && resultCode==RESULT_OK && data!=null){
            uploadUri =data.getData();
            File file=new File(uploadUri.getPath());
            filename.setText(file.getName());
            fileBytes=getFileBytes(uploadUri);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode==3 && permissions.length>0 && grantResults[0]== PackageManager.PERMISSION_GRANTED)
            pickFile();
    }
}