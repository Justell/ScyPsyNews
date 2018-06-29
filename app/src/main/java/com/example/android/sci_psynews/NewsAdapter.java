package com.example.android.sci_psynews;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        // Check if the existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        News currentArticle = getItem(position);

        // Find the TextView with view ID title
        TextView titleView = (TextView) convertView.findViewById(R.id.title);
        //Display the title of published article in that TextView
        titleView.setText(currentArticle.getTitle());

        //Get and asign publishing date to a string
        String stringDateTime = currentArticle.getTime();
        //Split parsed publishing date to date and time
        String[] splitDateTime = stringDateTime.split("T");
        String date = splitDateTime[0];
        //Asign to time and cut off the last character from hh:mm:ssZ
        String time = splitDateTime[1].substring(0, 8);

        // Find the TextView with view ID date
        TextView dateView = (TextView) convertView.findViewById(R.id.date);
        // Display the date of the published article in that TextView
        dateView.setText(date);

        // Find the TextView with view ID time
        TextView timeView = (TextView) convertView.findViewById(R.id.time);
        // Display the time of the published article in that TextView
        timeView.setText(time);

        // Return the list item view that is now showing the appropriate data
        return convertView;
    }


}
