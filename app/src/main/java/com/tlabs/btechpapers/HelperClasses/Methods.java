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

package com.tlabs.btechpapers.HelperClasses;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.tlabs.btechpapers.BuildConfig;

import java.io.File;
import java.util.Objects;

import static android.content.Context.MODE_PRIVATE;
import static androidx.core.app.ActivityCompat.shouldShowRequestPermissionRationale;

public class Methods {
    private Methods() {
    }

    public static void download(String url, File file, final ImageView download,
                                final Button button, final ImageView delete, final Context context) {

        if (isConnected(context)) {
            StorageReference storageReference = FirebaseStorage.getInstance().getReferenceFromUrl(url);
            final AlertDialog progressDialog = progressDialog(context, "Please Wait while we finish Downloading");
            progressDialog.setTitle("Downloading...");
            progressDialog.setCanceledOnTouchOutside(false);
            progressDialog.show();


            storageReference.getFile(file).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                @Override
                public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                    progressDialog.dismiss();
                    Toast.makeText(context, "Download Finished", Toast.LENGTH_SHORT).show();
                    download.setVisibility(View.GONE);
                    button.setEnabled(true);
                    delete.setVisibility(View.VISIBLE);

                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {
                    Toast.makeText(context, "Download Failed", Toast.LENGTH_LONG).show();
                    progressDialog.dismiss();
                }
            });
        } else
            Toast.makeText(context, "Please connect to Internet first!", Toast.LENGTH_SHORT).show();


    }

    public static void delete(final File file, final ImageView download,
                              final Button button, final ImageView delete, final Context context) {


        AlertDialog.Builder builder = builder(context,"Confirmation..","Are you sure to delete?");
        builder.setCancelable(true);
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                boolean deleted = file.delete();

                if (deleted && !file.exists()) {
                        download.setVisibility(View.VISIBLE);
                        button.setEnabled(false);
                    delete.setVisibility(View.GONE);
                    Toast.makeText(context, "Deleted Successfully!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(context, "Unsuccessful, Please Retry", Toast.LENGTH_SHORT).show();
                }

            }
        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
                Toast.makeText(context, "Cancelled", Toast.LENGTH_SHORT).show();
            }
        }).show();

    }

    public static void validate(File file, ImageView download, Button button, ImageView delete) {
     /*   if (shouldShowOnlyDownloadedPapers(context)) {
            if (file.exists()) {
                download.setVisibility(View.GONE);
                button.setEnabled(true);
                delete.setVisibility(View.VISIBLE);
            } else {
                download.setVisibility(View.GONE);
                button.setVisibility(View.GONE);
                delete.setVisibility(View.GONE);
            }
        } else { */
            if (file.exists()) {
                download.setVisibility(View.GONE);
                button.setEnabled(true);
                delete.setVisibility(View.VISIBLE);
            } else {
                download.setVisibility(View.VISIBLE);
                button.setEnabled(false);
                delete.setVisibility(View.GONE);
            }

    }

    public static boolean isConnected(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            Network nw = connectivityManager.getActiveNetwork();
            if (nw == null) return false;
            NetworkCapabilities actNw = connectivityManager.getNetworkCapabilities(nw);
            return actNw != null && (
                    actNw.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) ||
                    actNw.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) ||
                    actNw.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) ||
                    actNw.hasTransport(NetworkCapabilities.TRANSPORT_BLUETOOTH));
        } else {
            NetworkInfo nwInfo = connectivityManager.getActiveNetworkInfo();
            return nwInfo != null && nwInfo.isConnected();
        }
    }

    public static AlertDialog progressDialog(Context context, String message) {

        int padding = 30;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(LinearLayout.HORIZONTAL);
        linearLayout.setPadding(padding, padding, padding, padding);
        linearLayout.setGravity(Gravity.CENTER);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        params.gravity = Gravity.CENTER;
        linearLayout.setLayoutParams(params);

        ProgressBar progressBar = new ProgressBar(context);
        progressBar.setIndeterminate(true);
        progressBar.setPadding(0, 0, padding, 0);
        progressBar.setLayoutParams(params);

        params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        params.gravity = Gravity.CENTER;
        TextView tvText = new TextView(context);
        tvText.setText(message);
       // tvText.setTextColor(Color.parseColor("#000000"));
        tvText.setLayoutParams(params);

        linearLayout.addView(progressBar);
        linearLayout.addView(tvText);

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(true);
        builder.setView(linearLayout);

        AlertDialog dialog = builder.create();
        Window window = dialog.getWindow();
        if (window != null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(dialog.getWindow().getAttributes());
            layoutParams.width = LinearLayout.LayoutParams.WRAP_CONTENT;
            layoutParams.height = LinearLayout.LayoutParams.WRAP_CONTENT;
            dialog.getWindow().setAttributes(layoutParams);
        }
        return dialog;
    }

    public static void saveTogglePreference(Context context, boolean preference) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("preference", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("showOnlyDownloadedPapers", preference);
        editor.apply();
    }

    public static void saveFirstOpen(Context context, boolean firstOpen,String which) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("firstOpen", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(which, firstOpen);
        editor.apply();
    }
    public static boolean isFirstOpen(Context context,String which) {
        return context.getSharedPreferences("firstOpen", MODE_PRIVATE)
                .getBoolean(which, true);
    }

    public static boolean shouldShowOnlyDownloadedPapers(Context context) {
        return context.getSharedPreferences("preference", MODE_PRIVATE)
                .getBoolean("showOnlyDownloadedPapers", false);
    }

    public static void saveUserDetails(Context context, String name,String mail,String phone,int branchPosition,int semPosition) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("userDetails", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("name",name);
        editor.putString("mail",mail);
        editor.putString("phone",phone);
        editor.putInt("branchPosition",branchPosition);
        editor.putInt("semPosition",semPosition);
        editor.apply();
    }

    public static void retrieveUserDetails(Context context, EditText name, EditText mail, EditText phone, AppCompatSpinner branchSpinner,
                                           AppCompatSpinner semSpinner) {

        SharedPreferences sharedPreferences = context.getSharedPreferences("userDetails", MODE_PRIVATE);
        name.setText(sharedPreferences.getString("name", ""));
        mail.setText(sharedPreferences.getString("mail", ""));
        phone.setText(sharedPreferences.getString("phone", ""));
        branchSpinner.setSelection(sharedPreferences.getInt("branchPosition",0));
        semSpinner.setSelection(sharedPreferences.getInt("semPosition",0));
    }

    public static void shareApp(Activity activity) {
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        String shareMessage= "\nHi\nFound an awesome application you might be interested in\n\n";
        shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" +
                BuildConfig.APPLICATION_ID +"\n\n";
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareMessage);
        activity.startActivity(Intent.createChooser(sharingIntent, "Choose a Sharing Client"));
    }

    public static void rateApp(Context context,Activity activity) {
        final String appPackageName = context.getPackageName(); // getPackageName() from Context or Activity object
        try {
            activity.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
        } catch (android.content.ActivityNotFoundException anfe) {
            activity.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
        }
    }
    public static void openPolicyPage(Activity activity) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://pratyush019.github.io/policy.html"));
        activity.startActivity(i);
    }
    public static void contactDeveloper(Activity activity,String subject,String body) {
        Intent mailIntent = new Intent(Intent.ACTION_VIEW);
        Uri data = Uri.parse("mailto:?subject=" + subject+
                "&body=" + body + "&to=" + "care4tlabs@gmail.com");
        mailIntent.setData(data);
        activity.startActivity(Intent.createChooser(mailIntent, "Send mail..."));
    }

    public static String returnBranch(int i){
        String[] options = new String[]{"Select","Mechanical", "ECE", "Civil", "PIE", "Biotech", "Chemical", "CSE", "IT", "Electrical"};
            return options[i];
    }
    public static boolean checkPermissions(final Context context, final String permissionString,
                                           final String permissionRationaleMessage,String launchSettingMessage,
                                           final int requestCode){
        boolean granted=false;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (ContextCompat.checkSelfPermission(context, permissionString) == PackageManager.PERMISSION_GRANTED){
                granted=true;
            }
            else if (shouldShowRequestPermissionRationale((Activity) context, permissionString)) {
                AlertDialog.Builder builder = builder(context,"Grant Permission..",permissionRationaleMessage);
                builder.setCancelable(true);
                builder.setPositiveButton("CONTINUE", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                ActivityCompat.requestPermissions((Activity) context,
                                        new String[]{permissionString}, requestCode);

                            }
                        }).setNegativeButton("NOT NOW", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();

                    }
                }).show();
            } else {
                AlertDialog.Builder builder = builder(context,"Launch Settings?",launchSettingMessage);
                builder.setCancelable(true);
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                context.startActivity(new Intent(android.provider.Settings.ACTION_APPLICATION_DETAILS_SETTINGS,
                                        Uri.parse("package:" + BuildConfig.APPLICATION_ID)));

                            }
                        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();

                    }
                }).show();

            }
        }
        else granted=true;
        return granted;
    }
    public static boolean isValidEmail(String mail) {
        if (mail == null)
            return false;
        else
        return android.util.Patterns.EMAIL_ADDRESS.matcher(mail).matches();
    }
    public static AlertDialog.Builder builder(Context context,String title,String message){
        AlertDialog.Builder builder = new AlertDialog.Builder(Objects.requireNonNull(context));
        builder.setTitle(title).setMessage(message);
        return builder;
    }
    public static boolean isNightModeActive(Context context){
       return context.getSharedPreferences("theme",MODE_PRIVATE).getBoolean("mode",false);
    }
    public static void saveThemePrefs(Context context,boolean isActive){
        SharedPreferences sharedPreferences=context.getSharedPreferences("theme",MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("mode",isActive);
        editor.apply();
    }
}
