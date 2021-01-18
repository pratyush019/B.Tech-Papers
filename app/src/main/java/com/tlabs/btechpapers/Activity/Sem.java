package com.tlabs.btechpapers.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.tlabs.btechpapers.Adapters.SemAdapter;
import com.tlabs.btechpapers.R;

import java.util.ArrayList;
import java.util.Objects;

public class Sem extends AppCompatActivity {
    String branch;
    RecyclerView recyclerView;
    ArrayList<String> cardText;
    ArrayList<Integer> drawables;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem);
        recyclerView=findViewById(R.id.cardRecyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        branch=getIntent().getStringExtra("branch");
        Objects.requireNonNull(getSupportActionBar()).setTitle(branch);

        cardText=new ArrayList<>();
        cardText.add("MID SEM-3");
        cardText.add("END SEM-3");
        cardText.add("MID SEM-4");
        cardText.add("END SEM-4");
        cardText.add("MID SEM-5");
        cardText.add("END SEM-5");
        cardText.add("MID SEM-6");
        cardText.add("END SEM-6");
        cardText.add("MID SEM-7");
        cardText.add("END SEM-7");
        cardText.add("MID SEM-8");
        cardText.add("END SEM-8");


        drawables=new ArrayList<>();
        drawables.add(R.drawable.m3);
        drawables.add(R.drawable.m3);
        drawables.add(R.drawable.m4);
        drawables.add(R.drawable.m4);
        drawables.add(R.drawable.m5);
        drawables.add(R.drawable.m5);
        drawables.add(R.drawable.m6);
        drawables.add(R.drawable.m6);
        drawables.add(R.drawable.m7);
        drawables.add(R.drawable.m7);
        drawables.add(R.drawable.m8);
        drawables.add(R.drawable.m8);


        SemAdapter semAdapter =new SemAdapter(this,cardText,drawables,branch);
        recyclerView.setAdapter(semAdapter);
    }
} 