package com.example.teamproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SamsungNotebookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samsung_notebook);
        setTitle("삼성 노트북");
    }

    public void click_apple(View v) {
        Intent i1 = new Intent(SamsungNotebookActivity.this, AppleNotebookActivity.class);
        startActivity(i1);
    }

    public void click_lg(View v) {
        Intent i2 = new Intent(SamsungNotebookActivity.this, LgNotebookActivity.class);
        startActivity(i2);
    }

    public void click_etc(View v) {
        Intent i3 = new Intent(SamsungNotebookActivity.this, EtcNotebookActivity.class);
        startActivity(i3);
    }
}
