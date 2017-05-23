package com.test.hanchengyang.photogallery;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

/**
 * Project : PhotoGallery
 * Created by Hancheng Yang ( hancheng.yang@eptender.com )
 * Date : 23/05/2017, 11:39
 * Description :
 **/
public abstract class SingleFragmentActivity extends AppCompatActivity {
    private FragmentManager fm;
    private Fragment mFragment;

    protected abstract Fragment createFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResId());
        fm = getSupportFragmentManager();
        mFragment = fm.findFragmentById(R.id.fragment_container);
        if(mFragment == null) {
            mFragment = createFragment();
            fm.beginTransaction().add(R.id.fragment_container, mFragment).commit();
        }
    }

    @LayoutRes
    protected int getLayoutResId() {
        return R.layout.activity_fragment;
    }

}
