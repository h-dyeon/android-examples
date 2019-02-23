package com.example.viewpager_tablayout;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

public class MainActivity extends FragmentActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout=(TabLayout)findViewById(R.id.tablayout);

        MyPagerAdapter adapter=new MyPagerAdapter(getSupportFragmentManager());
        viewPager = (ViewPager) findViewById(R.id.pager);
        viewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));

        tabLayout.setupWithViewPager(viewPager);
        setTabLayout_icon_and_text();
    }
    private int[] imgResId={
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_background
    };
    private int[] textResId={
            R.string.tab0,
            R.string.tab1,
            R.string.tab2
    };
    private void setTabLayout_icon_and_text(){
        for(int i=0;i<tabLayout.getTabCount();i++){
            tabLayout.getTabAt(i).setIcon(imgResId[i]);
            tabLayout.getTabAt(i).setText(textResId[i]);
        }
    }
}
