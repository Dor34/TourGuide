package com.example.android.tourguide;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.android.tourguide.R;
import com.example.android.tourguide.adapter.CategoryAdapter;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById (R.id.viewpager);
        CategoryAdapter adapter = new CategoryAdapter (this, getSupportFragmentManager());

        viewPager.setAdapter (adapter);

        TabLayout tabLayout = (TabLayout) findViewById (R.id.tabs);
        assert tabLayout !=null;
        tabLayout.setupWithViewPager (viewPager);
    }
}
