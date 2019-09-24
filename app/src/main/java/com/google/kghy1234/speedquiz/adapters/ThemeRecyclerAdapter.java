package com.google.kghy1234.speedquiz.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.kghy1234.speedquiz.R;
import com.google.kghy1234.speedquiz.base.BaseRecyclerAdapter;
import com.google.kghy1234.speedquiz.base.BaseViewHolder;

import java.util.ArrayList;

public class ThemeRecyclerAdapter extends BaseRecyclerAdapter {


    public ThemeRecyclerAdapter(Context context, ArrayList items) {
        super(context, items);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(getContext()).inflate(R.layout.theme_recycler_item, viewGroup, false);
        return new BaseViewHolder(v);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int i) {
        ((TextView)holder.getViewById(R.id.tv)).setText(i + " : " + getItems().get(i));
    }
}
