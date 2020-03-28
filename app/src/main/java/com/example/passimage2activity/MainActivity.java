package com.example.passimage2activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void send (View v) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("resId", R.drawable.city_people);
        startActivity(intent);
    }

}
