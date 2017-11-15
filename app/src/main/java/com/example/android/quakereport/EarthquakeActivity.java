/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        // Create a fake list of earthquake locations.
        // We have used getTime method to get date type from Gregorian Calender
        List<Earthquake> earthquakes = new ArrayList<>();
        earthquakes.add(new Earthquake(7.2f, "San Francisco", new GregorianCalendar(2016, Calendar.FEBRUARY, 2).getTime()));
        earthquakes.add(new Earthquake(6.1f, "London", new GregorianCalendar(2015, Calendar.JULY, 20).getTime()));
        earthquakes.add(new Earthquake(3.9f, "Tokyo", new GregorianCalendar(2014, Calendar.NOVEMBER, 10).getTime()));
        earthquakes.add(new Earthquake(5.4f, "Mexico City", new GregorianCalendar(2014, Calendar.MAY, 3).getTime()));
        earthquakes.add(new Earthquake(2.8f, "Moscow", new GregorianCalendar(2013, Calendar.JANUARY, 31).getTime()));
        earthquakes.add(new Earthquake(4.9f, "Rio de Janeiro", new GregorianCalendar(2012, Calendar.AUGUST, 19).getTime()));
        earthquakes.add(new Earthquake(1.6f, "Paris", new GregorianCalendar(2011, Calendar.OCTOBER, 30).getTime()));

        Log.v("dsds", earthquakes.get(0).toString());



        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} of earthquakes
        ArrayAdapter<Earthquake> adapter = new EarthquakeAdapter(
                this, android.R.layout.simple_list_item_1, earthquakes);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(adapter);
    }
}
