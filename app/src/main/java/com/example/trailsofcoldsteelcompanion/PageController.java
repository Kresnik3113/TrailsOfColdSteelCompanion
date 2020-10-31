package com.example.trailsofcoldsteelcompanion;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageController extends FragmentPagerAdapter {
    int tabCounts;
    public PageController(@NonNull FragmentManager fm, int tabCounts) {
        super(fm, tabCounts);
        this.tabCounts=tabCounts;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new EnemiesFragment();
            case 1: return new EquipmentFragment();
            case 2: return new MaterialsFragment();
            default: return null;
        }

    }

    @Override
    public int getCount() {
        return tabCounts;
    }
}
