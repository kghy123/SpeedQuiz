package com.google.kghy1234.speedquiz.base;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public abstract class BaseFragmentAdapter extends FragmentPagerAdapter {

    private BaseFragment[] fragments;

    public BaseFragmentAdapter(FragmentManager fm) {
        super(fm);
        this.fragments = getFragments();
    }

    @Override
    public Fragment getItem(int i) {
        return fragments[i];
    }

    @Override
    public int getCount() {
        return fragments.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragments[position].getTitle();
    }

    protected abstract BaseFragment[] getFragments();


}
