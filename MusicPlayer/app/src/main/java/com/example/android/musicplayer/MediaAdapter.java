package com.example.android.musicplayer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by SANKET on 3/8/2017.
 */


    public class MediaAdapter extends ArrayAdapter<media> {


    public MediaAdapter(Activity context, ArrayList<media> androidmedia) {
        super(context, 0, androidmedia);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_song, parent,false);
        }


        media currentmedia = getItem(position);


        TextView song = (TextView) listItemView.findViewById(R.id.songname);
        song.setText(currentmedia.getsong());

        return listItemView;
    }
}