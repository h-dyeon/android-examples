package com.example.viewpager_tablayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
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
                return new Fragment0();
            case 1:
                return new Fragment1();
            case 2:
                return new Fragment2();
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
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
    }
}
