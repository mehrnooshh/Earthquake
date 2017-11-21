package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Mehrnoosh on 11/9/2017.
 */
public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    private static final String LOCATION_SEPARATOR = " of ";

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
        TextView magnitudeView = (TextView) listItemView.findViewById(R.id.magnitude);
        // Format the magnitude to show 1 decimal place
        String formattedMagnitude = formatMagnitude(currentEarthquake.getMagnitude());
        // Display the magnitude of the current earthquake in that TextView
        magnitudeView.setText(formattedMagnitude);


        // Find the TextView with view ID location and Display the location of the current earthquake in that TextView
        String originalLocation = currentEarthquake.getmLocation();
        String primaryLocation;
        String locationOffset;
        if (originalLocation.contains(LOCATION_SEPARATOR)) {
            String[] parts = originalLocation.split(LOCATION_SEPARATOR);
            locationOffset = parts[0] + LOCATION_SEPARATOR;
            primaryLocation = parts[1];
        } else {
            locationOffset = getContext().getString(R.string.near_the);
            primaryLocation = originalLocation;
        }
        TextView primaryLocationView = (TextView) listItemView.findViewById(R.id.primary_location);
        primaryLocationView.setText(primaryLocation);

        TextView locationOffsetView = (TextView) listItemView.findViewById(R.id.location_offset);
        locationOffsetView.setText(locationOffset);


        // Create a new Date object from the time in milliseconds of the earthquake
        Date dateObject = new Date(currentEarthquake.getmDate());

        // Find the TextView with view ID date
        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date);

        // Display the date of the current earthquake in that TextView
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM DD, yyyy");
        dateTextView.setText(dateFormat.format(dateObject));
      // We could also do this
      // dateTextView.setText(dateFormat.format(currentEarthquake.getmDate()));

        // Find the TextView with view ID time
        TextView timeTextView = (TextView) listItemView.findViewById(R.id.time);


        // Format the time string (i.e. "4:30PM")
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a");
        // Display the time of the current earthquake in that TextView
        timeTextView.setText(timeFormat.format(dateObject));



        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }


    /**
     * Return the formatted magnitude string showing 1 decimal place (i.e. "3.2")
     * from a decimal magnitude value.
     */
    private String formatMagnitude(double magnitude) {
        DecimalFormat magnitudeFormat = new DecimalFormat("0.0");
        return magnitudeFormat.format(magnitude);
    }

}
