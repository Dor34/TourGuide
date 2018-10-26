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
    private int imageResourceId;

    /**
     * @param name place
     * @param description details about place
     * @param imageResourceId drawable resource for image
     * @param address location of place
     * @param phoneNumber contact
     * @param hours open and close
     * @param priceRange cost
     */


    public Location(String name, String description,String address, String hours,
                    String phoneNumber, String priceRange, int imageResourceId) {

        this.name = name;
        this.description = description;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.hours = hours;
        this.priceRange = priceRange;
        this.imageResourceId = imageResourceId;
    }

    public Location(String string, String string1, int pennhurst_asylum) {

        name = name;

    }

    public Location(String string, String string1) {
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

    public boolean image(){
        Log.v("hasImage", "word has image: "+ (imageResourceId != NO_IMAGE_PROVIDED));
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

    public boolean priceRange(){
        return getPriceRange() != null;
    }

    public boolean phoneNumber(){
        return getPhoneNumber() != null;
    }

    public boolean address(){
        return getAddress() != null;
    }

    public boolean hours(){
        return getHours() != null;
    }

    @NonNull
    @Override
    public String toString() {

        return  getName() + "\n" +
                getDescription() + "\n" +
                getAddress() + "\n" +
                getPhoneNumber() + "\n" +
                getPriceRange() + "\n" +
                getHours() + "\n" +
                getImageResourceId();

    }
}
