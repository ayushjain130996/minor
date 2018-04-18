package com.example.ayush.restaurant;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ayush on 04/18/2018.
 */

public class MenuAdapter extends ArrayAdapter<Menu> {


    private int mColorResourceId;

    public MenuAdapter(Activity context, ArrayList<Menu> menu, int colorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context,0,menu);
        mColorResourceId=colorResourceId;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View gridItemView = convertView;
        if (gridItemView == null) {
            gridItemView = LayoutInflater.from(getContext()).inflate(R.layout.gridview, parent, false);

        }

        // Get the {@link AndroidFlavor} object located at this position in the list
         Menu currentMenu = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView menuTextView = (TextView) gridItemView.findViewById(R.id.menu_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        menuTextView.setText(currentMenu.getMenuName());


        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) gridItemView.findViewById(R.id.menu_image);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        iconView.setImageResource(currentMenu.getMenuImage());

        View textContainer=gridItemView.findViewById(R.id.menu_container);
        int color= ContextCompat.getColor(getContext(),mColorResourceId);
        textContainer.setBackgroundColor(color);
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return gridItemView;

    }
}

