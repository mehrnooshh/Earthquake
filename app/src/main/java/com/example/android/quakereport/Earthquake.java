package com.example.android.quakereport;

import java.util.Date;

/**
 * Created by Mehrnoosh on 11/9/2017.
 */
public class Earthquake {

    private float mMagnitude;
    private String mLocation;
    private Date mDate;

    public Earthquake(float magnitude, String location, Date date){
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    public float getMagnitude() {
        return mMagnitude;
    }

    public Date getmDate() {
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

