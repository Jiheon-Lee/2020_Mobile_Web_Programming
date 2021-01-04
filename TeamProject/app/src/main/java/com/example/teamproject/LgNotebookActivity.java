package com.example.teamproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LgNotebookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lg_notebook);
        setTitle("엘지 노트북");
    }

    public void click_samsung(View v) {
        Intent i1 = new Intent(LgNotebookActivity.this, SamsungNotebookActivity.class);
        startActivity(i1);
    }

    public void click_apple(View v) {
        Intent i2 = new Intent(LgNotebookActivity.this, AppleNotebookActivity.class);
        startActivity(i2);
    }

    public void click_etc(View v) {
        Intent i3 = new Intent(LgNotebookActivity.this, EtcNotebookActivity.class);
        startActivity(i3);
    }
}
