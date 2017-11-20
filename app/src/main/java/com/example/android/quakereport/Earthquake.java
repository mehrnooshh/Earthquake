package com.example.android.quakereport;

/**
 * Created by Mehrnoosh on 11/9/2017.
 */
public class Earthquake {

    private String mMagnitude;
    private String mLocation;
    private String mDate;

    public Earthquake(String magnitude, String location, String date){
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public String getmDate() {
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

