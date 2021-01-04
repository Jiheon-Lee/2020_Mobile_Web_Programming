package com.example.teamproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NotebookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notebook);
        setTitle("노트북");
    }

    public void click_samsung(View v) {
        Intent i1 = new Intent(NotebookActivity.this, SamsungNotebookActivity.class);
        startActivity(i1);
    }

    public void click_apple(View v) {
        Intent i2 = new Intent(NotebookActivity.this, AppleNotebookActivity.class);
        startActivity(i2);
    }

    public void click_lg(View v) {
        Intent i3 = new Intent(NotebookActivity.this, LgNotebookActivity.class);
        startActivity(i3);
    }

    public void click_etc(View v) {
        Intent i4 = new Intent(NotebookActivity.this, EtcNotebookActivity.class);
        startActivity(i4);
    }
}
