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

public class EventsFragment extends Fragment {

    public EventsFragment(){
        //Required public constructor (empty)
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.locations, container, false);

        //Creates array list for events
        final ArrayList<Location> location = new ArrayList<> ();
        location.add(new Location(getString(R.string.event1), getString(R.string.events_address1),
                R.drawable.pennhurst_asylum));
        location.add(new Location(getString(R.string.event2), getString(R.string.events_address2),
                R.drawable.dilworth_park));
        location.add(new Location(getString(R.string.event3), getString(R.string.events_address3),
                R.drawable.riverrink_winterfest));
        location.add(new Location(getString(R.string.event4), getString(R.string.events_address4),
                R.drawable.chrysanthemum));
        location.add(new Location(getString(R.string.event5), getString(R.string.events_address5),
                R.drawable.thanksgivingparade));

        LocationAdapter adapter = new LocationAdapter (getActivity (), location, R.color.category_events);

        ListView listView =(ListView) rootView.findViewById (R.id.listView);

        listView.setAdapter ((ListAdapter) adapter);
        return rootView;
    }
}
