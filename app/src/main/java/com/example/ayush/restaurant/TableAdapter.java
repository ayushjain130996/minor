package com.example.ayush.restaurant;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ayush on 04/18/2018.
 */

public class TableAdapter extends ArrayAdapter<Table> {



    public TableAdapter(Activity context, ArrayList<Table> table) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0,table);

    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View gridItemView = convertView;
        if (gridItemView == null) {
            gridItemView = LayoutInflater.from(getContext()).inflate(R.layout.table_grid_item, parent, false);

        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Table currentgrid = getItem(position);

        // Find the TextView in the table_grid_item.xmlem.xml layout with the ID version_name
        TextView tableName = (TextView) gridItemView.findViewById(R.id.grid_item_textView);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        tableName.setText(currentgrid.getTableName());


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return gridItemView;

    }
}
