package com.example.passimage2activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class SecondActivity extends Activity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        imageView = (ImageView) findViewById(R.id.imageView2);
        Bundle bundle = getIntent().getExtras();
        int resId = bundle.getInt("resId");
        imageView.setImageResource(resId);
    }


}
