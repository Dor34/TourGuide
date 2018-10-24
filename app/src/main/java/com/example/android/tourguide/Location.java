package com.example.android.tourguide;

import android.support.annotation.NonNull;
import android.util.Log;

/**
 * {@link Location}
 */

public class Location {

    private String name;
    private String description;
    private String address;
    private String phoneNumber;
    private String hours;
    private String priceRange;
    private static final int NO_IMAGE_PROVIDED = -1;
    private static int imageResourceId;

    /**
     * Create listed items
     * @param name name of place
     * @param description of said place
     */

    public Location(String name, String description) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.hours = hours;
        this.priceRange = priceRange;
        Location.imageResourceId = imageResourceId;
    }

    public Location(String string, String string1, int pennhurst_asylum) {
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getHours() {
        return hours;
    }

    public String getPriceRange() {
        return priceRange;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage_View(){
        Log.v("hasImage", "word has image: "+ (imageResourceId != NO_IMAGE_PROVIDED));
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

    public boolean hasPriceRange(){
        return getPriceRange() != null;
    }

    public boolean hasPhoneNumber(){
        return getPhoneNumber() != null;
    }

    public boolean hasAddress(){
        return getAddress() != null;
    }

    public boolean hasHours(){
        return getHours() != null;
    }

    @NonNull
    @Override
    public String toString() {

        return getName() + "\n" +
                getDescription() + "\n" +
                getAddress() + "\n" +
                getPhoneNumber() + "\n" +
                getPriceRange() + "\n" +
                getHours() + "\n" +
                getImageResourceId();
    }
}
