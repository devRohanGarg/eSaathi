package com.esaathi.remote;

import android.util.Log;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static final URL BASE_URL;
    private static final String TAG = "Config";
    private static final String KEY = "AIzaSyDYPZ98uUm49hXsI9-I5Dk7Aqc4GnRWWLQ";
    private static final String KIDS_PLAYLIST_ID = "PLTNAiZtt-h0tNhd9fRActCB3MrOOv0r1V";

    static {
        URL url = null;
        try {
            url = new URL("https://www.googleapis.com/youtube/v3/playlistItems?part=snippet&key=" + KEY + "&playlistId=" + KIDS_PLAYLIST_ID);
        } catch (MalformedURLException ignored) {
            // TODO: throw a real error
            Log.e(TAG, "Error creating an URL. Incorrect specification.", ignored);
        }

        BASE_URL = url;
    }
}
