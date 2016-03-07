package com.example.jaykayitare.alumniapp.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.jaykayitare.alumniapp.FragmentCohort1;
import com.example.jaykayitare.alumniapp.FragmentCohort2;
import com.example.jaykayitare.alumniapp.FragmentCohort3;
import com.example.jaykayitare.alumniapp.FragmentCohort4;
import com.example.jaykayitare.alumniapp.FragmentCohort5;

/**
 * Created by jaykayitare on 3/5/16.
 */
public class TabsPagerAdapter extends FragmentPagerAdapter {
    public TabsPagerAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {
        switch (index){
            case 0:
                return new FragmentCohort3();
            case 1:
                return new FragmentCohort1();
            case 2:
                return new FragmentCohort2();
            case 3:
                return new FragmentCohort4();
            case 4:
                return new FragmentCohort5();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 5;
    }
}
