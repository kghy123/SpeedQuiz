package com.google.kghy1234.baseproject.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

public abstract class BaseActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getFullScreen()){
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
        setContentView(getLayoutResource());
    }

    protected void moveActivity(Class target){
        Intent intent = new Intent(this, target);
        startActivity(intent);
    }

    protected void moveActivityWithFinish(Class target){
        moveActivity(target);
        finish();
    }

    protected abstract int getLayoutResource();
    protected abstract boolean getFullScreen();

}