package com.example.dimaaoc2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class CalendarActivity extends AppCompatActivity implements View.OnClickListener{
    ImageButton pro1,calen1,steps1,kcal1;
    Button o1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        o1 = findViewById(R.id.b1);
        o1.setOnClickListener( this);

        b2 = findViewById(R.id.b2);
        b2.setOnClickListener( this);

        b3 = findViewById(R.id.b3);
        b3.setOnClickListener( this);

        b4 = findViewById(R.id.b4);
        b4.setOnClickListener(this);

        b5 = findViewById(R.id.b5);
        b5.setOnClickListener( this);

        b6 = findViewById(R.id.b6);
        b6.setOnClickListener(this);

        b7 = findViewById(R.id.b7);
        b7.setOnClickListener(this);
        b8 = findViewById(R.id.b8);
        b8.setOnClickListener(this);

        b9 = findViewById(R.id.b9);
        b9.setOnClickListener(this);

        b10 = findViewById(R.id.b10);
        b10.setOnClickListener(this);

        b11 = findViewById(R.id.b11);
        b11.setOnClickListener( this);

        b12 = findViewById(R.id.b12);
        b12.setOnClickListener(this);

        kcal1 = findViewById(R.id.kcal1);
        kcal1.setOnClickListener(this);

        steps1 = findViewById(R.id.steps1);
        steps1.setOnClickListener( this);

        calen1 = findViewById(R.id.calen1);
        calen1.setOnClickListener(this);

        pro1 = findViewById(R.id.pro1);
        pro1.setOnClickListener(this);
    }

    public boolean aBoolean (Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }



    public boolean onOptionsItemSelected(MenuItem item) {
        Intent goToNextActivity = new Intent(getApplicationContext(), FirstActivity.class);
        switch (item.getItemId()) {
            case R.id.item1:
                goToNextActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(goToNextActivity);
                break;

        }
        return true;
    }

    public void onClick(View v){
        if(v==o1){Intent i = new Intent(this,DaysActivity.class);
            startActivity(i);}

        if(v==b7){Intent i = new Intent(this,DaysActivity.class);
            startActivity(i);}

        if(v == kcal1){
            Intent i = new Intent(this,FirstActivity.class);
            startActivity(i);
        }

        if(v == steps1){
            Intent i = new Intent(this,StepsActivity.class);
            startActivity(i);
        }

        if(v == calen1){
            Intent i = new Intent(this,CalendarActivity.class);
            startActivity(i);
        }

        if(v == pro1){
            Intent i = new Intent(this,ProfileActivity.class);
            startActivity(i);
        }
    }
}
