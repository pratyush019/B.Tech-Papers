package com.tlabs.btechpapers.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tlabs.btechpapers.HelperClasses.Methods;
import com.tlabs.btechpapers.Activity.Pdf;
import com.tlabs.btechpapers.R;

import java.io.File;
import java.util.List;

public class PaperAdapter extends RecyclerView.Adapter<PaperAdapter.ViewHolder> {
    private final LayoutInflater layoutInflater;
    private final List<String> data;
    private final List<File> fileList;
    private final List<String> downloadURL;
    final Context appContext;
    public PaperAdapter(Context context, List<String> data, List<File> fileList, List<String> downloadURL){
        this.layoutInflater=LayoutInflater.from(context);
        this.data=data;
        this.fileList=fileList;
        this.downloadURL=downloadURL;
        appContext=context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=layoutInflater.inflate(R.layout.button_design,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {

        final String string=data.get(position);
        final File file=fileList.get(position);
        final  String url=downloadURL.get(position);
        holder.button.setText(string);
        Methods.validate(file,holder.download,holder.button,holder.delete,appContext);
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(appContext, Pdf.class);
                intent.putExtra("File",file.getAbsolutePath());
                appContext.startActivity(intent);
            }
        });

        holder.delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Methods.delete(file,holder.download,holder.button,holder.delete,appContext);
            }
        });

        holder.download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Methods.download(url,file,holder.download,holder.button,holder.delete,appContext);

            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final Button button;
        final ImageView download;
        final ImageView delete;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            button=itemView.findViewById(R.id.paper);
            download=itemView.findViewById(R.id.download);
            delete=itemView.findViewById(R.id.delete);
        }
    }
}