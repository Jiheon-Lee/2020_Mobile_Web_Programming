package com.example.teamproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("전자제품 비교 앱");
    }

    public void click_notebook(View v) {
        Intent i1 = new Intent(MainActivity.this, NotebookActivity.class);
        startActivity(i1);
    }

    public void click_smartphone(View v) {
        Intent i2 = new Intent(MainActivity.this, SmartphoneActivity.class);
        startActivity(i2);
    }

}
