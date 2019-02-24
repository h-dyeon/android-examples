package com.example.viewpager_tablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.example.viewpager_tablayout.Fragments_to_1.Fragment1_0;
import com.example.viewpager_tablayout.Fragments_to_1.Fragment1_1;

public class MyPagerAdapter_to_Fragment1 extends FragmentPagerAdapter {
    int mNumOfPages;

    public MyPagerAdapter_to_Fragment1(FragmentManager fm) {
        super(fm);
        this.mNumOfPages = 2;
    }
    @Override
    public Fragment getItem(int position) {
         switch (position) {
            case 0:
                return new Fragment1_0();
            case 1:
                return new Fragment1_1();
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return mNumOfPages;
    }
    private String[] pageTitle={
            "tab1-0",
            "tab1-1"
    };
    @Override
    public CharSequence getPageTitle(int position){
        if(pageTitle[position]!=null)
            return pageTitle[position];
        else
            return null;
    }
}
