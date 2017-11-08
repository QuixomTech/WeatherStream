package com.quixom.apps.weatherstream.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.quixom.apps.weatherstream.R;

public class WeatherTVFragment extends Fragment {
    private static final String ARG_SECTION_COLOR = "section-color";

    public static WeatherTVFragment newInstance(int color) {
        WeatherTVFragment fragment = new WeatherTVFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_COLOR, color);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_weather_location_view, container, false);
//        rootView.setBackgroundColor(ContextCompat.getColor(getContext(), getArguments().getInt(ARG_SECTION_COLOR)));
//        rootView.setBackgroundResource(R.drawable.honey_dew);
        return rootView;
    }

}
