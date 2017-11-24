package com.example.android.quakereport;

/**
 * Created by Mehrnoosh on 11/9/2017.
 */
public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private long mDate;
    /** Website URL of the earthquake */
    private String mUrl;

    public Earthquake(double magnitude, String location, long date, String url){
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
        mUrl = url;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public long getmDate() {
        return mDate;
    }

    public String getmLocation() {
        return mLocation;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }



 /*   @Override
    public String toString() {
        return mMagnitude + " " + mLocation + mDate;
    }*/
}

