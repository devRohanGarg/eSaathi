package com.esaathi.remote;

import android.util.Log;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static final URL BASE_URL;
    private static final String TAG = "Config";

    static {
        URL url = null;
        try {
            url = new URL("https://youtube.com/videos-json");
        } catch (MalformedURLException ignored) {
            // TODO: throw a real error
            Log.e(TAG, "Error creating an URL. Incorrect specification.", ignored);
        }

        BASE_URL = url;
    }
}