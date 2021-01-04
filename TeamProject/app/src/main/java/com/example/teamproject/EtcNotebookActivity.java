package com.example.teamproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EtcNotebookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etc_notebook);
        setTitle("기타 노트북");
    }

    public void click_samsung(View v) {
        Intent i1 = new Intent(EtcNotebookActivity.this, SamsungNotebookActivity.class);
        startActivity(i1);
    }

    public void click_apple(View v) {
        Intent i2 = new Intent(EtcNotebookActivity.this, AppleNotebookActivity.class);
        startActivity(i2);
    }

    public void click_lg(View v) {
        Intent i3 = new Intent(EtcNotebookActivity.this, LgNotebookActivity.class);
        startActivity(i3);
    }
}
