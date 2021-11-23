package com.jack.cafe;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListItemsAdapter extends ArrayAdapter<Selection> {
    public ListItemsAdapter(Activity context, ArrayList<Selection> selections){
        super(context,0,selections);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_list_item_view,parent,false);
        }

        Selection currentItem = getItem(position);

        TextView attractionName = listItemView.findViewById(R.id.list_item_text);
        attractionName.setText(currentItem.getName());

        TextView address = listItemView.findViewById(R.id.list_item_text2);
        address.setText(currentItem.getShortDescription());

        ImageView image = listItemView.findViewById(R.id.list_image);
        image.setImageResource(currentItem.getImage());

        return listItemView;
    }

}
