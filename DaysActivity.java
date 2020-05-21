package com.example.dimaaoc2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DaysActivity extends AppCompatActivity implements View.OnClickListener {
    Button mealbu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_days);

        mealbu = findViewById(R.id.mealbu);
        mealbu.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        if(v==mealbu){
            Intent i = new Intent(this, CalendarActivity.class);
            startActivity(i);
        }
    }
}
