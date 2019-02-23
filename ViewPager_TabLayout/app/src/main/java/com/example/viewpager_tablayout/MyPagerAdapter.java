package com.example.viewpager_tablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import com.example.viewpager_tablayout.Fragments.Fragment0;
import com.example.viewpager_tablayout.Fragments.Fragment1;
import com.example.viewpager_tablayout.Fragments.Fragment2;

public class MyPagerAdapter  extends FragmentPagerAdapter {
    int mNumOfPages;

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
        this.mNumOfPages = 3;
    }

    @Override
    public Fragment getItem(int position) {

        if(position<0 || position>=mNumOfPages)
            return null;

         switch (position) {
            case 0:
                Fragment cur_fragment0=new Fragment0();
                return cur_fragment0;
            case 1:
                Fragment cur_fragment1=new Fragment1();
                return cur_fragment1;
            case 2:
                Fragment cur_fragment2=new Fragment2();
                return cur_fragment2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        Log.d("test","getCount()");
        return mNumOfPages;

    }

    private String[] pageTitle={
            "tab0",
            "tab1",
            "tab2"
    };
    @Override
    public CharSequence getPageTitle(int position){
        if(pageTitle[position]!=null)
            return pageTitle[position];
        else
            return null;
        /*
        switch (position) {
            case 0:
                return "tab0";
            case 1:
                return "tab1";
            case 2:
                return "tab2";
            default:
                return null;
        }*/
    }
}
