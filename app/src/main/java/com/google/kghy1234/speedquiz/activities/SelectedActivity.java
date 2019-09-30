package com.google.kghy1234.speedquiz.activities;

import android.app.Activity;
import android.content.Context;
import android.databinding.DataBindingUtil;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

import com.google.kghy1234.speedquiz.R;
import com.google.kghy1234.speedquiz.base.BaseActivity;
import com.google.kghy1234.speedquiz.databinding.ActivitySelectedBinding;

public class SelectedActivity extends BaseActivity {

    private ActivitySelectedBinding binding;

    @Override
    protected void onCreate() {
        binding = getDataBinding(ActivitySelectedBinding.class);

       makeActivityToDialog(getIntent().getIntExtra("NUMBER", 0) + "", 80, 70);
    }



    @Override
    protected Activity getActivity() {
        return this;
    }

    @Override
    protected Integer getLayoutResource() {
        return R.layout.activity_selected;
    }

    @Override
    protected boolean getFullScreen() {
        return false;
    }

    public void clickPlay(View v){
        //Intent intent = new Intent(this, IngameActivity.class);
        //intent.putExtra("key", key);
        //startActivity(intent);
        finish();
    }

    public void clickCancel(View v){

        onBackPressed();

    }
}
