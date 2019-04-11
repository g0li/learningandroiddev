package com.lilliemountain.learningandroiddev;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class StringRecyclerAdapter extends RecyclerView.Adapter<StringRecyclerAdapter.StringHolder> {
    List<String> stringList;

    public StringRecyclerAdapter(List<String> stringList) {
        this.stringList = stringList;
    }

    @NonNull
    @Override
    public StringHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_recycler,viewGroup,false);
        return new StringHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StringHolder stringHolder, int i) {
        stringHolder.textView.setText(stringList.get(i));
    }

    @Override
    public int getItemCount() {
        return stringList.size();
    }

    public class StringHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public StringHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.text);
        }
    }
}
