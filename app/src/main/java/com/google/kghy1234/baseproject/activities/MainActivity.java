package com.google.kghy1234.baseproject.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.kghy1234.baseproject.R;
import com.google.kghy1234.baseproject.base.BaseActivity;

public class MainActivity extends BaseActivity {


    @Override
    protected int getLayoutResource() {
        return R.layout.activity_main;
    }

    @Override
    protected boolean getFullScreen() {
        return false;
    }
}
