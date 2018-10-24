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


public class DinningFragment extends Fragment {

    public DinningFragment(){
        //public empty constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.locations, container, false);

        final ArrayList<Location> location = new ArrayList<>();
        location.add(new Location(getString(R.string.food1), getString(R.string.food_address1),
                R.drawable.reading_terminal));
        location.add(new Location (getString(R.string.food2), getString(R.string.food_address2),
                R.drawable.warmdaddys));
        location.add(new Location(getString(R.string.food3), getString(R.string.food_address3),
                R.drawable.jims));
        location.add(new Location(getString(R.string.food4), getString(R.string.food_address4),
                R.drawable.sonnys));
        location.add(new Location (getString(R.string.food5), getString(R.string.food_address5),
                R.drawable.ishkabibbles));

        LocationAdapter adapter = new LocationAdapter (getActivity (), location, R.color.category_food);

        ListView listView = (ListView) rootView.findViewById (R.id.listView);
        listView.setAdapter ((ListAdapter) adapter);
        return rootView;
    }
}
