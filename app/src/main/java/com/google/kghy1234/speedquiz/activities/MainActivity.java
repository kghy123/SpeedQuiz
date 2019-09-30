package com.google.kghy1234.speedquiz.activities;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.GridLayoutManager;

import com.google.kghy1234.speedquiz.R;
import com.google.kghy1234.speedquiz.adapters.ThemeRecyclerAdapter;
import com.google.kghy1234.speedquiz.base.BaseActivity;
import com.google.kghy1234.speedquiz.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends BaseActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate() {
        binding = getDataBinding(ActivityMainBinding.class);
        binding.themeRecycler.setLayoutManager(new GridLayoutManager(this, 2));

        ArrayList<String> items = new ArrayList<String>();
        items.add("1번 아이템");
        items.add("2번 아이템");
        items.add("3번 아이템");
        items.add("4번 아이템");
        items.add("5번 아이템");

        ThemeRecyclerAdapter<String> adapter = new ThemeRecyclerAdapter(this, items);
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
