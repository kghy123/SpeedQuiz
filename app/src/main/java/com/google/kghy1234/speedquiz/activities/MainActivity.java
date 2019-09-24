package com.google.kghy1234.speedquiz.activities;

import android.os.Bundle;

import com.google.kghy1234.speedquiz.R;
import com.google.kghy1234.speedquiz.base.BaseActivity;

public class MainActivity extends BaseActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_main;
    }

    @Override
    protected boolean getFullScreen() {
        return true;
    }
}
