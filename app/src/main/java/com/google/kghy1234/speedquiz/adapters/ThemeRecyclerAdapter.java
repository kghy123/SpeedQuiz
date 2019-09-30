package com.google.kghy1234.speedquiz.adapters;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.kghy1234.speedquiz.R;
import com.google.kghy1234.speedquiz.activities.SelectedActivity;
import com.google.kghy1234.speedquiz.base.BaseRecyclerAdapter;
import com.google.kghy1234.speedquiz.base.BaseViewHolder;

import java.util.ArrayList;

public class ThemeRecyclerAdapter<T> extends BaseRecyclerAdapter<T> {

    public ThemeRecyclerAdapter(Context context, ArrayList<T> items) {
        super(context, items);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(getContext()).inflate(R.layout.item_recycler_theme, viewGroup, false);
        return new BaseViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final BaseViewHolder holder, final int i) {
        ((TextView)holder.getViewById(R.id.tv)).setText(getItems().get(i).toString());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), SelectedActivity.class);

                intent.putExtra("NUMBER", i);

                ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity)getContext(), new Pair<View, String>(holder.itemView, "view"));

                getContext().startActivity(intent, activityOptions.toBundle());
            }
        });
    }
}
