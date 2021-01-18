package com.tlabs.btechpapers.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.tlabs.btechpapers.Adapters.BranchAdapter;
import com.tlabs.btechpapers.HelperClasses.Methods;
import com.tlabs.btechpapers.R;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<String> cardText;
    ArrayList<Integer> drawables;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
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
        if (id==R.id.share){
            Methods.shareApp(this);
        }
        if (id==R.id.rate){
           Methods.rateApp(this,this);
        }
        if (id==R.id.correction){
            Methods.contactDeveloper(this);
        }
        if (id==R.id.policy){
            Methods.openPolicyPage(this);
        }
        if (id==R.id.sendPaper){
            startActivity(new Intent(this, AddPapers.class));
        }
        return true;


    }
}