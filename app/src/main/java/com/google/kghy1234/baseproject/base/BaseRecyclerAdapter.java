package com.google.kghy1234.baseproject.base;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public abstract class BaseRecyclerAdapter extends RecyclerView.Adapter {

    private Context context;
    private ArrayList items;

    public BaseRecyclerAdapter(Context context, ArrayList items){
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public abstract RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i);

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i){
        onBindViewHolder((BaseViewHolder)viewHolder, i);
    }

    public abstract void onBindViewHolder(BaseViewHolder holder, int i);

    @Override
    public int getItemCount() {
        return items.size();
    }

    protected Context getContext(){
        return context;
    }

    protected ArrayList getItems(){
        return items;
    }

    protected BaseViewHolder getViewHolder(View view){
        return new BaseViewHolder(view);
    }

}
