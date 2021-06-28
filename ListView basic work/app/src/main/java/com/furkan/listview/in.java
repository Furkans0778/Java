package com.furkan.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import static com.furkan.listview.MainActivity._deneme;

public class in extends AppCompatActivity {


    TextView yazi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in);

        yazi = findViewById(R.id.yazi);
        Intent getData = getIntent();
        //yazi.setText(getData.getStringExtra("data")); // ##opinional
        yazi.setText(_deneme);
    }
}