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
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.AdView;
import com.tlabs.btechpapers.Adapters.PaperAdapter;
import com.tlabs.btechpapers.HelperClasses.AdHelper;
import com.tlabs.btechpapers.HelperClasses.Methods;
import com.tlabs.btechpapers.R;

import java.util.Objects;

import static com.tlabs.btechpapers.HelperClasses.Methods.isNightModeActive;
import static com.tlabs.btechpapers.HelperClasses.RouteProvider.getCurrentAdapter;

public class Papers extends AppCompatActivity {
    String sem, branch;


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
        PaperAdapter paperAdapter=getCurrentAdapter(branch,sem,this);
        RecyclerView recyclerView=findViewById(R.id.buttonRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(paperAdapter);

        AdView adView=findViewById(R.id.adView);
        AdHelper.implementBanner(this,adView);



       /* adView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {

                Toast.makeText(Papers.this, "ad loaded", Toast.LENGTH_SHORT).show();
                // Code to be executed when an ad finishes loading.
            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                Toast.makeText(Papers.this, "Failed-"+adError.toString(), Toast.LENGTH_SHORT).show();
                // Code to be executed when an ad request fails.
                Log.d("failed",adError.toString());
            }

            @Override
            public void onAdOpened() {
                Toast.makeText(Papers.this, "ad opened", Toast.LENGTH_SHORT).show();
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }

            @Override
            public void onAdClicked() {
                Toast.makeText(Papers.this, "ad clicked", Toast.LENGTH_SHORT).show();
                // Code to be executed when the user clicks on an ad.
            }

            @Override
            public void onAdLeftApplication() {
                Toast.makeText(Papers.this, "ad left application", Toast.LENGTH_SHORT).show();
                // Code to be executed when the user has left the app.
            }

            @Override
            public void onAdClosed() {
                Toast.makeText(Papers.this, "ad closed", Toast.LENGTH_SHORT).show();
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }
        }); */

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.papers_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
       /*  if (id==R.id.toggle){
            if (shouldShowOnlyDownloadedPapers(this)){
                Methods.saveTogglePreference(this,false);
                Toast.makeText(this, "Showing all papers", Toast.LENGTH_LONG).show();
            }
            else {
                Methods.saveTogglePreference(this,true);
                Toast.makeText(this, "Showing Only Downloaded papers", Toast.LENGTH_LONG).show();
            }
            Intent intent=new Intent(this,Papers.class);
            intent.putExtra("sem",sem);
            intent.putExtra("branch", branch);
            startActivity(intent);
            finish();
        }
         else */ if(id==R.id.online){

             if (Methods.isFirstOpen(this,"intro")){

                 AlertDialog.Builder builder=Methods.builder(this,"Online Mode",
                         "Welcome to online mode.\nHere you can share your contents with others and can view shared" +
                                 " contents as well.\nYou can share contents in pdf format having size less than 3MB.\n" +
                                 "By clicking CONTINUE you agree not to upload any irrelevant contents and content which are protected" +
                                 " by copyright laws.");
                 builder.setCancelable(false);
                 builder.setPositiveButton("CONTINUE", new DialogInterface.OnClickListener() {
                     @Override
                     public void onClick(DialogInterface dialogInterface, int i) {
                         Methods.saveFirstOpen(Papers.this,false,"intro");
                         Intent intent = new Intent(Papers.this, OnlineView.class);
                         intent.putExtra("sem", sem);
                         intent.putExtra("branch", branch);
                         startActivity(intent);
                         finish();
                     }
                 }).setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                     @Override
                     public void onClick(DialogInterface dialogInterface, int i) {
                         dialogInterface.dismiss();
                     }
                 }).show();


             } else {
                 Intent intent = new Intent(this, OnlineView.class);
                 intent.putExtra("sem", sem);
                 intent.putExtra("branch", branch);
                 startActivity(intent);
                 finish();
             }
         }
        return true;
    }
}