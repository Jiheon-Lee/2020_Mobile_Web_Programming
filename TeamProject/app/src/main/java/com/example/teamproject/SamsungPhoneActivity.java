package com.example.teamproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SamsungPhoneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samsung_phone);
        setTitle("삼성 스마트폰");
    }

    public void click_apple(View v) {
        Intent i1 = new Intent(SamsungPhoneActivity.this, ApplePhoneActivity.class);
        startActivity(i1);
    }

    public void click_lg(View v) {
        Intent i2 = new Intent(SamsungPhoneActivity.this, LgPhoneActivity.class);
        startActivity(i2);
    }
}
