package com.example.android.tourguide.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.tourguide.DinningFragment;
import com.example.android.tourguide.EventsFragment;
import com.example.android.tourguide.Location;
import com.example.android.tourguide.R;
import com.example.android.tourguide.SitesFragment;
import com.example.android.tourguide.TravelingFragment;

/**
 * {@link CategoryAdapter} {@link FragmentPagerAdapter}
 * {@link Location}
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context context;
    private static final int PAGE_COUNT = 4;

    /**
     * {@link CategoryAdapter}
     * @param context
     * @param fm (fragment manager)
     */


    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    /**
     * {@link Fragment}
     *
     */

    @Override
    public Fragment getItem(int position){
        switch (position){
            case 0:
                return new DinningFragment ();
            case 1:
                return new TravelingFragment ();
            case 2:
                return new SitesFragment ();
            default:
                return new EventsFragment ();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public String getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getString (R.string.category_dinning);
            case 1:
                return context.getString (R.string.category_traveling);
            case 2:
                return context.getString (R.string.category_sites);
            default:
                return context.getString (R.string.category_events);
        }
    }
}