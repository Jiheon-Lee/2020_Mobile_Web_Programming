package com.example.teamproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LgPhoneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lg_phone);
        setTitle("엘지 스마트폰");
    }

    public void click_samsung(View v) {
        Intent i1 = new Intent(LgPhoneActivity.this, SamsungPhoneActivity.class);
        startActivity(i1);
    }

    public void click_apple(View v) {
        Intent i2 = new Intent(LgPhoneActivity.this, ApplePhoneActivity.class);
        startActivity(i2);
    }
}
