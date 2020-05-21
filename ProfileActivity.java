package com.example.dimaaoc2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {
    Button progg, change, log;
    ImageButton first,steps,cal,pro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        first = findViewById(R.id.kcal1);
        first.setOnClickListener( this);

        steps = findViewById(R.id.steps1);
        steps.setOnClickListener( this);

        cal = findViewById(R.id.calen1);
        cal.setOnClickListener( this);

        pro = findViewById(R.id.pro1);
        pro.setOnClickListener( this);

        progg = findViewById(R.id.progg);
        progg.setOnClickListener( this);

        change = findViewById(R.id.change);
        change.setOnClickListener( this);

        log = findViewById(R.id.out);
        log.setOnClickListener( this);
    }

    public boolean onCreateOptionMenu (Menu menu){
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

    @Override
    public void onClick(View v) {
        if(v == steps){
            Intent i = new Intent(this,StepsActivity.class);
            startActivity(i);
        }

        if(v == cal){
            Intent i = new Intent(this,CalendarActivity.class);
            startActivity(i);
        }

        if(v == first){
            Intent i = new Intent(this,FirstActivity.class);
            startActivity(i);
        }

        if(v == log){
            Intent i = new Intent(this,MainActivity.class);
            startActivity(i);
        }

        if(v == change){
            Intent i = new Intent(this,ChangePassActivity.class);
            startActivity(i);
        }
    }
}

