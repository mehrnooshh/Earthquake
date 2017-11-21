package com.example.android.quakereport;

/**
 * Created by Mehrnoosh on 11/9/2017.
 */
public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private long mDate;

    public Earthquake(double magnitude, String location, long date){
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
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

 /*   @Override
    public String toString() {
        return mMagnitude + " " + mLocation + mDate;
    }*/
}

