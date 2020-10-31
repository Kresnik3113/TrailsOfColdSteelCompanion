package com.example.trailsofcoldsteelcompanion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class CodexActivity extends AppCompatActivity {

    Toolbar mToolbar;
    TabLayout mTabLayout;
    TabItem enemies;
    TabItem equipment;
    TabItem materials;
    ViewPager mPager;
    PageController mPagerController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_codex);

        mToolbar=findViewById(R.id.toolBar);

        getSupportActionBar().setTitle("Codex");
        mTabLayout=findViewById(R.id.tabLayout);
        enemies=findViewById(R.id.enemiesTab);
        equipment=findViewById(R.id.equipmentTab);
        materials=findViewById(R.id.materialsTab);
        mPager=findViewById(R.id.viewPager);

        mPagerController=new PageController(getSupportFragmentManager(),mTabLayout.getTabCount());
        mPager.setAdapter(mPagerController);

        mPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));

        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}