package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by Mehrnoosh on 11/9/2017.
 */
public class EventsAdapter extends ArrayAdapter<Earthquake> {

    public EventsAdapter(Context context, int resource, List<Earthquake> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }

        // Get the {@link WordAdapter} object located at this position in the list
        final Earthquake currentEarthquake = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView magTextView = (TextView) listItemView.findViewById(R.id.magnitude);

        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        magTextView.setText(String.valueOf(currentEarthquake.getMagnitude()));

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView cityTextView = (TextView) listItemView.findViewById(R.id.location);

        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        cityTextView.setText(currentEarthquake.getmLocation());


        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date);

        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView

        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM d, yyyy");
        dateTextView.setText(dateFormat.format(currentEarthquake.getmDate()));


        return listItemView;    }

}
