package com.example.teamproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AppleNotebookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apple_notebook);
        setTitle("애플 노트북");
    }

    public void click_samsung(View v) {
        Intent i1 = new Intent(AppleNotebookActivity.this, SamsungNotebookActivity.class);
        startActivity(i1);
    }

    public void click_lg(View v) {
        Intent i2 = new Intent(AppleNotebookActivity.this, LgNotebookActivity.class);
        startActivity(i2);
    }

    public void click_etc(View v) {
        Intent i3 = new Intent(AppleNotebookActivity.this, EtcNotebookActivity.class);
        startActivity(i3);
    }
}
