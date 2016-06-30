package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Joe on 6/30/2016.
 */

public class WordAdapter extends ArrayAdapter<Word>{

    public WordAdapter(Activity context, ArrayList<Word> Word) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, Word);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText((currentWord.getMiwokTranslation()));

        return listItemView;
    }
}

//    public View getView(int position, View convertView, ViewGroup parent) {
//        // Check if the existing view is being reused, otherwise inflate the view
//        View listItemView = convertView;
//        if (listItemView == null) {
//            listItemView = LayoutInflater.from(getContext()).inflate(
//                    R.layout.list_item, parent, false);
//        }
//    }
//}

//        // Get the {@link AndroidFlavor} object located at this position in the list
//        AndroidFlavor currentAndroidFlavor = getItem(position);
//
//        // Find the TextView in the list_item.xml layout with the ID version_name
//        TextView nameTextView = (TextView) listItemView.findViewById(R.id.version_name);
//        // Get the version name from the current AndroidFlavor object and
//        // set this text on the name TextView
//        nameTextView.setText(currentAndroidFlavor.getVersionName());
//
//        // Find the TextView in the list_item.xml layout with the ID version_number
//        TextView numberTextView = (TextView) listItemView.findViewById(R.id.version_number);
//        // Get the version number from the current AndroidFlavor object and
//        // set this text on the number TextView
//        numberTextView.setText(currentAndroidFlavor.getVersionNumber());
//
//        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
//        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
//        // Get the image resource ID from the current AndroidFlavor object and
//        // set the image to iconView
//        iconView.setImageResource(currentAndroidFlavor.getImageResourceId());
//
//        // Return the whole list item layout (containing 2 TextViews and an ImageView)
//        // so that it can be shown in the ListView
//        return listItemView;
//    }
