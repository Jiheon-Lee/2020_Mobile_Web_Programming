package com.example.teamproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ApplePhoneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apple_phone);
        setTitle("애플 스마트폰");
    }

    public void click_samsung(View v) {
        Intent i1 = new Intent(ApplePhoneActivity.this, SamsungPhoneActivity.class);
        startActivity(i1);
    }

    public void click_lg(View v) {
        Intent i2 = new Intent(ApplePhoneActivity.this, LgPhoneActivity.class);
        startActivity(i2);
    }
}
