package com.google.kghy1234.speedquiz.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.WindowManager;

public abstract class BaseActivity extends AppCompatActivity {

    private static Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getFullScreen()){
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
        //setContentView(getLayoutResource());
        onCreate();
    }

    protected <T> T getDataBinding(Class<T> viewDataBinding){
        return viewDataBinding.cast(DataBindingUtil.setContentView(getActivity(), getLayoutResource()));
    }
    protected abstract void onCreate();

    protected void moveActivityDelayed(final Class target, final int ms, final boolean needFinish){

        Runnable runnable = new Runnable(){
            @Override
            public void run() {

                if(needFinish) {
                    moveActivityWithFinish(target);
                }else{
                    moveActivity(target);
                }
            }
        };
        handler.postDelayed(runnable, ms);
    }

    protected void moveActivity(Class target){
        Intent intent = new Intent(this, target);
        startActivity(intent);
    }

    protected void moveActivityWithFinish(Class target){
        moveActivity(target);
        finish();
    }

    protected void makeActivityToDialog(String title, double widthPercent, double heightPercent){
        Display display = ((WindowManager) getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();

        setTitle(title);

        int width = (int) (display.getWidth() * (widthPercent/100));
        int height = (int) (display.getHeight() * (heightPercent/100));

        getWindow().getAttributes().width = width;
        getWindow().getAttributes().height = height;

        setFinishOnTouchOutside(false);
    }

    protected abstract Activity getActivity();
    protected abstract Integer getLayoutResource();
    protected abstract boolean getFullScreen();

}