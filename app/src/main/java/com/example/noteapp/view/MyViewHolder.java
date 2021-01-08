package com.example.noteapp.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.noteapp.R;

public class MyViewHolder extends RecyclerView.ViewHolder {
    public TextView title;
    public TextView note;
    public TextView dot;
    public TextView timestamp;

    public MyViewHolder(View view) {
        super(view);
        title = view.findViewById(R.id.title);
        note = view.findViewById(R.id.note);
        dot = view.findViewById(R.id.dot);
        timestamp = view.findViewById(R.id.timestamp);
    }
}
