package com.tlabs.btechpapers.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.tlabs.btechpapers.R;
import com.tlabs.btechpapers.Activity.Sem;

import java.util.List;

public class BranchAdapter extends RecyclerView.Adapter<BranchAdapter.ViewHolder> {
private final LayoutInflater layoutInflater;
private final List<String> cardText;
private final List<Integer> drawable;
final Context appContext;
       public BranchAdapter(Context context, List<String> cardText, List<Integer> drawable){
        this.layoutInflater=LayoutInflater.from(context);
        this.cardText =cardText;
        this.drawable =drawable;
        appContext=context;
        }

@NonNull
@Override
public BranchAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=layoutInflater.inflate(R.layout.card_design,parent,false);

    GridLayoutManager.LayoutParams params = (GridLayoutManager.LayoutParams) view.getLayoutParams();
    params.height = (parent.getMeasuredHeight() / 3);
    view.setLayoutParams(params);

        return new BranchAdapter.ViewHolder(view);

        }

@Override
public void onBindViewHolder(@NonNull final BranchAdapter.ViewHolder holder, final int position) {

final String branch= cardText.get(position);
final Integer image= drawable.get(position);
        holder.textView.setText(branch);
        holder.textView.setCompoundDrawablesWithIntrinsicBounds(0,image,0,0);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        Intent intent=new Intent(appContext, Sem.class);
        intent.putExtra("branch",branch);
        appContext.startActivity(intent);
        }
        });
        }

@Override
public int getItemCount() {
        return cardText.size();
        }

public static class ViewHolder extends RecyclerView.ViewHolder {
    final CardView cardView;
    final TextView textView;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        cardView=itemView.findViewById(R.id.cardView);
        textView=itemView.findViewById(R.id.cardTextView);
    }
}
}