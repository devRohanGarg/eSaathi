package com.esaathi.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.esaathi.R;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        //startActivity(new Intent(getApplicationContext(), MainActivity.class));
        overridePendingTransition(R.anim.push_right_in, R.anim.push_left_out);
        finish();
    }
}
