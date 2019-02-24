package com.example.viewpager_tablayout.Fragments;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.viewpager_tablayout.MyPagerAdapter_to_Fragment1;
import com.example.viewpager_tablayout.R;

public class Fragment1 extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View view=inflater.inflate(R.layout.fragment1, container, false);

            //viewPager와 tabLayout 연결
            TabLayout tabLayout=(TabLayout)view.findViewById(R.id.tablayout_fragment1);
            MyPagerAdapter_to_Fragment1 adapter=new MyPagerAdapter_to_Fragment1(getChildFragmentManager());
            ViewPager viewPager = (ViewPager)view.findViewById(R.id.pager_fragment1);
            viewPager.setAdapter(adapter);
            tabLayout.setupWithViewPager(viewPager);

            return view;
        }
}