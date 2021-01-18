package com.tlabs.btechpapers.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.tlabs.btechpapers.Adapters.PaperAdapter;
import com.tlabs.btechpapers.HelperClasses.Methods;
import com.tlabs.btechpapers.R;

import java.util.Arrays;
import java.util.Objects;

import static com.tlabs.btechpapers.HelperClasses.Methods.shouldShowOnlyDownloadedPapers;
import static com.tlabs.btechpapers.HelperClasses.RouteProvider.getCurrentAdapter;

public class Papers extends AppCompatActivity {
    String sem, branch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_papers);
        sem=getIntent().getStringExtra("sem");
        branch =getIntent().getStringExtra("branch");
        Objects.requireNonNull(getSupportActionBar()).setTitle(sem);
        PaperAdapter paperAdapter=getCurrentAdapter(branch,sem,this);
        RecyclerView recyclerView=findViewById(R.id.buttonRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(paperAdapter);


        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        MobileAds.setRequestConfiguration(
                new RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList("0695B8604F36AF93F85B9BC0066ECC40",
                        "E9E31BF2C454A460DE01EF90938C12A1"))
                        .build());
        final AdView adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

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
         if (id==R.id.toggle){
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
        return true;
    }
}