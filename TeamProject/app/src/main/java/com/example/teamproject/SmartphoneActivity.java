package com.example.teamproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SmartphoneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smartphone);
        setTitle("스마트폰");
    }

    public void click_samsung(View v) {
        Intent i1 = new Intent(SmartphoneActivity.this, SamsungPhoneActivity.class);
        startActivity(i1);
    }

    public void click_apple(View v) {
        Intent i2 = new Intent(SmartphoneActivity.this, ApplePhoneActivity.class);
        startActivity(i2);
    }

    public void click_lg(View v) {
        Intent i3 = new Intent(SmartphoneActivity.this, LgPhoneActivity.class);
        startActivity(i3);
    }
}
