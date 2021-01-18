package com.tlabs.btechpapers.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tlabs.btechpapers.R;

import java.util.List;

public class DialogAdapter extends RecyclerView.Adapter<DialogAdapter.ViewHolder> {
    private final LayoutInflater layoutInflater;
    private final List<String> filename;
    private final List<Boolean> status;
    final Context appContext;
    public DialogAdapter(Context context, List<String> filename,List<Boolean> status){
        this.layoutInflater=LayoutInflater.from(context);
        this.filename =filename;
        this.status=status;
        appContext=context;
    }

    @NonNull
    @Override
    public DialogAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=layoutInflater.inflate(R.layout.status_item,parent,false);
        return new DialogAdapter.ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull final DialogAdapter.ViewHolder holder, final int position) {

        final String string= filename.get(position);
        final boolean hasUploaded=status.get(position);
       holder.textView.setText(string);
       if (hasUploaded)
           holder.textView.setCompoundDrawablesWithIntrinsicBounds(0,0,R.drawable.ic_outline_check_circle_24,0);
       else holder.textView.setCompoundDrawablesWithIntrinsicBounds(0,0,R.drawable.ic_baseline_error_outline_24,0);

    }

    @Override
    public int getItemCount() {
        return filename.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.text);
        }
    }
}