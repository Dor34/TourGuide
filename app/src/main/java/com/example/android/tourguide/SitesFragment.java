package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.android.tourguide.adapter.LocationAdapter;

import java.util.ArrayList;

/**
 * {@link Fragment}
 */

public class SitesFragment extends Fragment {

    public SitesFragment() {
        //empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View rootView = inflater.inflate (R.layout.locations, container, false);

        final ArrayList<Location> location = new ArrayList<> ();
        location.add (new Location(getString (R.string.sites1), getString (R.string.sites_address1),
                R.drawable.art_museum));
        location.add (new Location(getString(R.string.sites2), getString (R.string.sites_address2),
                R.drawable.liberty_bell));
        location.add(new Location(getString (R.string.sites3), getString (R.string.sites_address3),
                R.drawable.african_american_museum));
        location.add (new Location(getString (R.string.sites4), getString (R.string.sites_address4),
                R.drawable.independence_seaport));
        location.add (new Location (getString (R.string.sites5), getString (R.string.sites_address5),
                R.drawable.eastern_state_penitentiary));

        LocationAdapter adapter = new LocationAdapter (getActivity (), location, R.color.category_sites);

        ListView listView = (ListView) rootView.findViewById (R.id.listView);
        listView.setAdapter((ListAdapter) adapter);
        return rootView;
    }
}
