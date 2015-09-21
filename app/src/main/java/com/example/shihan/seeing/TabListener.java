package com.example.shihan.seeing;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;

public class TabListener<T extends Fragment> implements ActionBar.TabListener {
    private Fragment mFragment;

    public TabListener(Fragment fragment) {
        mFragment = fragment;
    }

    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        ft.replace(R.id.fragment_container, mFragment);
    }

    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
        ft.remove(mFragment);
    }

    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
        // User selected the already selected tab. Usually do nothing.
    }
}