package com.google.kghy1234.speedquiz.activities;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;

import com.google.kghy1234.speedquiz.R;
import com.google.kghy1234.speedquiz.adapters.ThemeRecyclerAdapter;
import com.google.kghy1234.speedquiz.base.BaseActivity;
import com.google.kghy1234.speedquiz.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends BaseActivity {

    private ActivityMainBinding binding;

    @Override
    protected void setDataBinding() {
        binding = DataBindingUtil.setContentView(this, getLayoutResource());
    }

    @Override
    protected void onCreate() {
        binding.themeRecycler.setLayoutManager(new GridLayoutManager(this, 2));

        ArrayList<String> items = new ArrayList<String>();
        items.add("1");
        items.add("2");
        items.add("3");
        items.add("4");
        items.add("5");

        ThemeRecyclerAdapter adapter = new ThemeRecyclerAdapter(this, items);
        binding.themeRecycler.setAdapter(adapter);

    }

    @Override
    protected Activity getActivity() {
        return this;
    }

    @Override
    protected Integer getLayoutResource() {
        return R.layout.activity_main;
    }

    @Override
    protected boolean getFullScreen() {
        return true;
    }
}
