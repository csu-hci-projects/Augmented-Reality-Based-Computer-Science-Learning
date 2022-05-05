package com.google.ar.core.examples.java.common.helpers;


import android.content.Context;
import android.content.SharedPreferences;


public class ObjectToPlaceSettings {
    public static final String SHARED_PREFERENCES_ID = "SHARED_PREFERENCES_OBJECT_OPTIONS";
    public static final String SHARED_PREFERENCES_OBJECT_OPTIONS =
            "object_to_place";
    private SharedPreferences sharedPreferences;

    public void onCreate(Context context) {
        sharedPreferences = context.getSharedPreferences(SHARED_PREFERENCES_ID, Context.MODE_PRIVATE);

    }
}
