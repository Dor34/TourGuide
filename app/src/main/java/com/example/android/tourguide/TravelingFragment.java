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

public class TravelingFragment extends Fragment {

    public TravelingFragment(){
        //empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.locations, container, false);

        final ArrayList<Location> location = new ArrayList<> ();
        location.add(new Location(getString(R.string.travel1), getString(R.string.travel_address1),
                R.drawable.thirtieth_street_station));
        location.add(new Location(getString(R.string.travel2), getString(R.string.travel_address2)));
        location.add(new Location(getString(R.string.travel3), getString(R.string.travel_address3)));
        location.add(new Location(getString(R.string.travel4), getString(R.string.travel_address4)));
        location.add(new Location(getString(R.string.travel5), getString(R.string.travel_address5)));

        LocationAdapter adapter = new LocationAdapter (getActivity(),
                location, R.color.category_traveling);

        ListView listView = (ListView) rootView.findViewById (R.id.listView);
        listView.setAdapter ((ListAdapter) adapter);
        return rootView;
    }
}