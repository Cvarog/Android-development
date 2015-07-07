package com.example.android.movieapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Admin on 07.07.2015.
 */
public class MovieFragment extends Fragment {

    private ImageAdapter imageAdapter;


    public MovieFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        GridView gridView = (GridView) rootView.findViewById(R.id.gridView_movie);
        imageAdapter = new ImageAdapter(getActivity());
        gridView.setAdapter(imageAdapter);

        return rootView;
    }
}



