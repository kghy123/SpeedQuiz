package com.google.kghy1234.speedquiz.activities;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.databinding.DataBindingUtil;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;

import com.google.kghy1234.speedquiz.R;
import com.google.kghy1234.speedquiz.base.BaseActivity;
import com.google.kghy1234.speedquiz.databinding.ActivityIntroBinding;

public class IntroActivity extends BaseActivity {

    private ActivityIntroBinding binding;

    @Override
    protected void setDataBinding() {
        binding = DataBindingUtil.setContentView(this, getLayoutResource());
    }

    @Override
    protected void onCreate() {
        checkPermission();

        binding.introTextView.setText("테스트중");
    }

    private void checkPermission(){
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){
            if(checkSelfPermission(Manifest.permission.CAMERA) == PackageManager.PERMISSION_DENIED ||
                    checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED||
                    checkSelfPermission(Manifest.permission.RECORD_AUDIO) == PackageManager.PERMISSION_DENIED){
                requestPermissions(new String[]{Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.RECORD_AUDIO }, 10);
            }else{
                goToMainActivity();
            }
        }else{
            goToMainActivity();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if(requestCode == 10){
            if(grantResults[0] == PackageManager.PERMISSION_GRANTED && grantResults[1] == PackageManager.PERMISSION_GRANTED && grantResults[2] == PackageManager.PERMISSION_GRANTED){
                goToMainActivity();
            }else{
                finish();
            }
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    private void goToMainActivity(){
        moveActivityDelayed(MainActivity.class, 3000, true);
    }

    @Override
    protected Activity getActivity() {
        return this;
    }

    @Override
    protected Integer getLayoutResource() {
        return R.layout.activity_intro;
    }

    @Override
    protected boolean getFullScreen() {
        return true;
    }
}
