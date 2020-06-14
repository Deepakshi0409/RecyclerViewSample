package com.example.to_do;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class ProgrammingViewHolder extends RecyclerView.ViewHolder {
    TextView txt;
 public ProgrammingViewHolder(@NonNull View itemView){
     super(itemView);
     txt = itemView.findViewById(R.id.text);
 }


}
