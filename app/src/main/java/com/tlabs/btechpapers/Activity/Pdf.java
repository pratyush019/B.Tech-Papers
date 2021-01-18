package com.tlabs.btechpapers.Activity;

import android.os.Build;
import android.os.Bundle;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;
import com.tlabs.btechpapers.R;

import java.io.File;

public class Pdf extends AppCompatActivity {
    PDFView pdfView;
    String string;
    File file;
    @Override
   // @SuppressWarnings("DEPRECATION")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE,WindowManager.LayoutParams.FLAG_SECURE);
        setContentView(R.layout.activity_pdf);


      if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            final WindowInsetsController insetsController = getWindow().getInsetsController();
            if (insetsController != null) {
                insetsController.hide(WindowInsets.Type.statusBars());
             }
        } else {
            getWindow().setFlags(
                    WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }


        string=getIntent().getStringExtra("File");
        if(string != null) {
            file = new File(string);
            pdfView= findViewById(R.id.pdf);
            pdfView.fromFile(file).nightMode(false).load();
        }
        else
            Toast.makeText(this, "Error!", Toast.LENGTH_SHORT).show();

    }
}
