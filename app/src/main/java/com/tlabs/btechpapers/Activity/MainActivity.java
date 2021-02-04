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

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.tlabs.btechpapers.Adapters.BranchAdapter;
import com.tlabs.btechpapers.BuildConfig;
import com.tlabs.btechpapers.HelperClasses.Methods;
import com.tlabs.btechpapers.R;

import java.util.ArrayList;

import static com.tlabs.btechpapers.HelperClasses.Methods.isNightModeActive;


public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<String> cardText;
    ArrayList<Integer> drawables;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(isNightModeActive(this))
      AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        else AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        recyclerView=findViewById(R.id.cardRecyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));

        cardText=new ArrayList<>();
        cardText.add("MECHANICAL");
        cardText.add("ECE");
        cardText.add("CIVIL");
        cardText.add("PIE");
        cardText.add("BIOTECH");
        cardText.add("CHEMICAL");
        cardText.add("CSE");
        cardText.add("IT");
        cardText.add("ELECTRICAL");


        drawables=new ArrayList<>();
        drawables.add(R.drawable.mech);
        drawables.add(R.drawable.electronic);
        drawables.add(R.drawable.civil);
        drawables.add(R.drawable.pie);
        drawables.add(R.drawable.biotech);
        drawables.add(R.drawable.chemical);
        drawables.add(R.drawable.cse);
        drawables.add(R.drawable.it);
        drawables.add(R.drawable.electrical);

        BranchAdapter branchAdapter =new BranchAdapter(this,cardText,drawables);
        recyclerView.setAdapter(branchAdapter);


    /*  final String[] file = {""};
        final String[] url = {""};
        final String[] text={""};
        final int[] size = {0};
        final int[] count = {0};

        final StorageReference listRef = FirebaseStorage.getInstance().getReference("chemical").child("m6");

        listRef.listAll()
                .addOnSuccessListener(new OnSuccessListener<ListResult>() {
                    @Override
                    public void onSuccess(ListResult listResult) {
                            size[0] =listResult.getItems().size();
                            getDownloadURL(listResult);
                            for (final StorageReference item : listResult.getItems()) {
                            // All the items under listRef.
                            file[0] = file[0] +"targetFile.add(new File(folder, \""+item.getName()+"\"));\n";
                            text[0]=text[0]+"buttonText.add(\"\");\n";
                        }
                    }

                    private void getDownloadURL(final ListResult listResult) {
                        Log.d("co****",String.valueOf(count[0])+" "+String.valueOf(size[0]));
                        if (count[0]==size[0]) {
                            return;
                        }
                        else
                       listResult.getItems().get(count[0]).getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                            @Override
                            public void onSuccess(Uri uri) {
                                url[0] = url[0] +"downloadURL.add(\""+uri.toString()+"\");\n";
                                Log.d("fniufblwug***",text[0]+"\n\n"+file[0]+"\n\n"+url[0]);
                                count[0]++;
                                getDownloadURL(listResult);
                            }
                        });
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        // Uh-oh, an error occurred!
                    }
                }); */





        // if (BuildConfig.DEBUG) StrictModeManager.enableStrictMode();
       // StrictModeManager.allowDiskReads(App.super::onCreate);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();

        if(id==R.id.theme){
            final int[] checkedItem = {0};
            if(isNightModeActive(this))
                checkedItem[0] =1;
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setTitle("Choose theme");
            builder.setSingleChoiceItems(new String[]{"Light", "Dark"}, checkedItem[0], new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                   checkedItem[0] =i;
                }
            }).setPositiveButton("APPLY", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                if(checkedItem[0]==0){
                    Methods.saveThemePrefs(getApplicationContext(),false);
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                } else {
                    Methods.saveThemePrefs(getApplicationContext(),true);
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                }
                }
            }).setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }).create().show();
        }
      else  if (id==R.id.share){
            Methods.shareApp(this);
        }
        if (id==R.id.rate){
           Methods.rateApp(this,this);
        }
        if (id==R.id.correction){
            Methods.contactDeveloper(this,"Regarding B.Tech Papers application-"+ BuildConfig.VERSION_CODE+"("+BuildConfig.VERSION_NAME+")",
                    "## If your mail is about any error then do send us screenshots/screenvideo of error with your device name and model<br><br>");
        }
        if (id==R.id.policy){
            Methods.openPolicyPage(this);
        }
      /*  if (id==R.id.sendPaper){
            startActivity(new Intent(this, AddPapers.class));
        } */
        return true;


    }
}