package com.example.android.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Joe on 7/5/2016.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position){
        switch (position){
            case 0:
                return new NumbersFragment();
            case 1:
                return new FamilyFragment();
            case 2:
                return new ColorsFragment();
            case 3:
                return new PhrasesFragment();
            default:
                return null;
        }
    }
//        if (position == 0) {
//            return new NumbersFragment();
//        } else if (position == 1){
//            return new FamilyFragment();
//        } else if (position == 2) {
//            return new ColorsFragment();
//        } else {
//            return new PhrasesFragment();
//        }
//    }

    @Override
    public int getCount() {
        return 4;
    }
}
