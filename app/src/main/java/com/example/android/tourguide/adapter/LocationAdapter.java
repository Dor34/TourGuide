package com.example.android.tourguide.adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.tourguide.Location;
import com.example.android.tourguide.R;

import java.util.ArrayList;

/**
 * {@link LocationAdapter} {@link ArrayAdapter} {@link Location}
 */

public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Activity context, ArrayList<Location> location, int category_food){
        super(context, 0, location);
    }

    private static class ViewHolder{
        private TextView nameTextView;
        private TextView descriptionTextView;
        private TextView addressTextView;
        private TextView hoursTextView;
        private TextView priceRangeTextView;
        private TextView phoneNumberTextView;
        private ImageView imageView;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent){
        //Get {@link location}
        Location currentLocation = getItem (position);
        ViewHolder holder;

        if(convertView != null){
            holder = (ViewHolder) convertView.getTag ();
        }else{
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            holder = new ViewHolder ();

            holder.nameTextView = (TextView) convertView.findViewById (R.id.name);
            holder.descriptionTextView = (TextView) convertView.findViewById (R.id.description);
            holder.addressTextView = (TextView) convertView.findViewById (R.id.address);
            holder.hoursTextView = (TextView) convertView.findViewById (R.id.hours);
            holder.priceRangeTextView = (TextView) convertView.findViewById (R.id.priceRange);
            holder.phoneNumberTextView = (TextView) convertView.findViewById (R.id.phoneNumber);
            holder.imageView = (ImageView) convertView.findViewById (R.id.image_view);
            convertView.setTag (holder);
        }

        assert currentLocation != null;
        holder.nameTextView.setText(currentLocation.getName());

        holder.descriptionTextView.setText(currentLocation.getDescription());

        holder.addressTextView.setText(currentLocation.getAddress());

        holder.hoursTextView.setText(currentLocation.getHours());

        holder.priceRangeTextView.setText(currentLocation.getPriceRange());

        holder.phoneNumberTextView.setText(currentLocation.getPhoneNumber());

        holder.imageView.setImageResource (currentLocation.getImageResourceId ());

        return convertView;
    }
}
