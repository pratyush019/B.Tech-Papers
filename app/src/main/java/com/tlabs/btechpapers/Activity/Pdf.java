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

import android.os.Build;
import android.os.Bundle;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import com.github.barteksc.pdfviewer.PDFView;
import com.tlabs.btechpapers.R;

import java.io.File;

import static com.tlabs.btechpapers.HelperClasses.Methods.isNightModeActive;

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
        if(isNightModeActive(this))
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        else AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

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
            pdfView.fromFile(file).nightMode(isNightModeActive(this)).load();
        }
        else
            Toast.makeText(this, "Error!", Toast.LENGTH_SHORT).show();

    }
}