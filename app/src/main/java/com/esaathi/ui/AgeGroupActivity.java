package com.esaathi.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.esaathi.R;

public class AgeGroupActivity extends AppCompatActivity {

    SharedPreferences sp;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age_group);
        sp = PreferenceManager.getDefaultSharedPreferences(this);
    }

    public void Child(View view) {
        editor = sp.edit();
        editor.putBoolean("isChild", true);
        startActivity(new Intent(getApplicationContext(), ArticleListActivity.class));
        overridePendingTransition(R.anim.push_right_in, R.anim.push_left_out);
        finish();
        editor.apply();
    }

    public void Adult(View view) {
        editor = sp.edit();
        editor.putBoolean("isAdult", true);
        startActivity(new Intent(getApplicationContext(), CategoryActivity.class));
        overridePendingTransition(R.anim.push_right_in, R.anim.push_left_out);
        finish();
        editor.apply();
    }
}
