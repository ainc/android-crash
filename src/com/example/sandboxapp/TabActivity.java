package com.example.sandboxapp;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

public class TabActivity extends FragmentActivity {

	private ViewPager viewPager;
	private MyPagerAdapter mAdapter;
	private ActionBar actionBar;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_activity);
        
        viewPager = (ViewPager) findViewById(R.id.pager);
        mAdapter = new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(mAdapter);
    }
    
    
    private class MyPagerAdapter extends FragmentPagerAdapter {
   	 
        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }
     
        @Override
        public Fragment getItem(int index) {
            return new MyFragment();
        }
     
        @Override
        public int getCount() {
            // get item count - equal to number of tabs
            return 6;
        }
     
    }
}
