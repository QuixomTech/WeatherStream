package com.quixom.apps.weatherstream.helper;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatDelegate;

public class ThemeHelper {
    private static final String NIGHT_MODE = "NIGHT_MODE";


    public static void onAttach(Context context) {
        boolean nightMode = isNightModeEnabled(context, false);
        setTheme(context, nightMode);
    }

    public static void onAttach(Context context, boolean defaultTheme) {
        boolean nightMode = isNightModeEnabled(context, defaultTheme);
        setTheme(context, nightMode);
    }

    public static boolean isNightModeEnabled(Context context, boolean defaultTheme) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getBoolean(NIGHT_MODE, defaultTheme);
    }

    public static void setIsNightModeEnabled(Context context, boolean isNightModeEnabled) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean(NIGHT_MODE, isNightModeEnabled);
        editor.apply();
    }

    public static void setTheme(Context context, boolean isNightModeEnabled) {
        setIsNightModeEnabled(context, isNightModeEnabled);
        if (isNightModeEnabled) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }
    }
}
