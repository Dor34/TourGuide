package com.example.android.tourguide.adapter;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.tourguide.Location;
import com.example.android.tourguide.R;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    private final int mColorResourceId;

    public LocationAdapter(Activity context, ArrayList<Location> location, int colorResourceId){
        super(context, 0, location);
        mColorResourceId = colorResourceId;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        final Location currentLocation = getItem (position);
        View listItemView = convertView;

        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate
                    (R.layout.list_item, parent, false);
        }

        TextView nameLocationTextView = (TextView) listItemView.findViewById(R.id.name);
        nameLocationTextView.setText(currentLocation.getName());

        TextView descriptionLocationTextView = (TextView)
                listItemView.findViewById(R.id.description);
        descriptionLocationTextView.setText(currentLocation.getDescription());

        TextView addressLocationTextView = (TextView) listItemView.findViewById(R.id.address);
        addressLocationTextView.setText(currentLocation.getAddress());

        TextView scheduleLocationTextView = (TextView) listItemView.findViewById(R.id.hours);
        scheduleLocationTextView.setText(currentLocation.getHours());

        TextView priceLocationTextView = (TextView) listItemView.findViewById(R.id.priceRange);
        priceLocationTextView.setText(currentLocation.getPriceRange());

        TextView phoneLocationTextView = (TextView) listItemView.findViewById(R.id.phoneNumber);
        phoneLocationTextView.setText(currentLocation.getPhoneNumber());

        ImageView photoLocationImageView = (ImageView) listItemView.findViewById(R.id.image_view);

        if (currentLocation.hasImage_View()){
            photoLocationImageView.setImageResource(currentLocation.getImageResourceId());
            photoLocationImageView.setVisibility(View.VISIBLE);
        } else {
            photoLocationImageView.setVisibility(View.GONE);
        }

        if (currentLocation.hasPriceRange()){
            priceLocationTextView.setVisibility(View.VISIBLE);
        } else {
            priceLocationTextView.setVisibility(View.GONE);
        }

        if (currentLocation.hasHours()){
            scheduleLocationTextView.setVisibility(View.VISIBLE);
        } else {
            scheduleLocationTextView.setVisibility(View.GONE);
        }

        if (currentLocation.hasAddress()){
            addressLocationTextView.setVisibility(View.VISIBLE);
        } else {
            addressLocationTextView.setVisibility(View.GONE);
        }

        if (currentLocation.hasPhoneNumber()){
            phoneLocationTextView.setVisibility(View.VISIBLE);
        } else {
            phoneLocationTextView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
