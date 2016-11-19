package com.example.android.samplepageui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Created by vamsi on 19-11-2016.
 */

public class StoreListAdapter extends ArrayAdapter<Stores> {


    public StoreListAdapter(Context context, ArrayList<Stores> Stores) {
        super(context, 0, Stores);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View listItemView = convertView;

        storeViewHolder viewHolder = new storeViewHolder();

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.store_list_layout, parent, false);

            viewHolder.storeWallpaper = (ImageView) listItemView.findViewById(R.id.store_wallpaper);
            viewHolder.storeName = (TextView) listItemView.findViewById(R.id.store_name);
            viewHolder.storeDistance = (TextView) listItemView.findViewById(R.id.store_distance);
            viewHolder.storeAddress = (TextView) listItemView.findViewById(R.id.store_address);
            viewHolder.storeNoOfBookmarks = (TextView) listItemView.findViewById(R.id.no_of_bookmarks);
            viewHolder.storeOpenStatusTime = (TextView) listItemView.findViewById(R.id.store_open_time);
            viewHolder.men = (ImageView) listItemView.findViewById(R.id.icon_man);
            viewHolder.women = (ImageView) listItemView.findViewById(R.id.icon_woman);
            viewHolder.kids = (ImageView) listItemView.findViewById(R.id.icon_kid);

            listItemView.setTag(viewHolder);


        } else {
            viewHolder = (storeViewHolder) listItemView.getTag();
        }

        Stores currentStore = getItem(position);

        viewHolder.storeName.setText(currentStore.getStoreName());
        viewHolder.storeAddress.setText(currentStore.getStoreAddress());
        viewHolder.storeOpenStatusTime.setText(currentStore.getStoreOpenStatusTime());

        String formattedDistance = formatdouble(currentStore.getStoreDistance()) + " km";
        viewHolder.storeDistance.setText(formattedDistance);

//        String bookmarksNumber = Integer.toString(currentStore.getNoOfBookmarks());
        viewHolder.storeNoOfBookmarks.setText(currentStore.getNoOfBookmarks());

        viewHolder.storeWallpaper.setImageResource(currentStore.getStoreWallpaperId());

        if (!currentStore.isThereMen()) {
            viewHolder.men.setVisibility(View.GONE);
        }

        if (!currentStore.isThereWomen()) {
            viewHolder.women.setVisibility(View.GONE);
        }

        if (!currentStore.isThereKids()) {
            viewHolder.kids.setVisibility(View.GONE);
        }

        return listItemView;
    }

    private String formatdouble(double rating) {
        DecimalFormat ratingFormat = new DecimalFormat("#.00");
        return ratingFormat.format(rating);
    }

    static class storeViewHolder {
        TextView storeName;
        TextView storeDistance;
        TextView storeAddress;
        ImageView storeWallpaper;
        TextView storeOpenStatusTime;
        TextView storeNoOfBookmarks;
        ImageView men;
        ImageView women;
        ImageView kids;
        int position;
    }
}

