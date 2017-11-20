package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Mehrnoosh on 11/9/2017.
 */
public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(Context context, List<Earthquake> objects) {
        super(context, android.R.layout.simple_list_item_1, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }

        // Find the earthquake at the given position in the list of earthquakes
        final Earthquake currentEarthquake = getItem(position);

        // Find the TextView with view ID magnitude
        TextView magTextView = (TextView) listItemView.findViewById(R.id.magnitude);

        // Display the magnitude of the current earthquake in that TextView
        magTextView.setText(String.valueOf(currentEarthquake.getMagnitude()));

        // Find the TextView with view ID location
        TextView cityTextView = (TextView) listItemView.findViewById(R.id.location);

        // Display the location of the current earthquake in that TextView
        cityTextView.setText(currentEarthquake.getmLocation());

        // Find the TextView with view ID date
        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date);

        // Display the date of the current earthquake in that TextView
        //SimpleDateFormat dateFormat = new SimpleDateFormat("MMM d, yyyy");
        //dateTextView.setText(dateFormat.format(currentEarthquake.getmDate()));
        dateTextView.setText(currentEarthquake.getmDate());
        // Return the list item view that is now showing the appropriate data
        return listItemView;    }

}
