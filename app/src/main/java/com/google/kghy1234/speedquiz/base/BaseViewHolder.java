package com.google.kghy1234.speedquiz.base;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class BaseViewHolder extends RecyclerView.ViewHolder{

    public BaseViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public View getViewById(int viewId){
        return itemView.findViewById(viewId);
    }

}
