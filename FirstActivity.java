package com.example.dimaaoc2020;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton pro1,calen1,kcal1, steps1;
    TextView textView11,totCal, call;
    private Menu main_menu;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


        textView11 = findViewById(R.id.textView11);
        totCal = findViewById(R.id.totCal);
        call = findViewById(R.id.call);



        kcal1 = findViewById(R.id.kcal1);
        kcal1.setOnClickListener( this);

        steps1 = findViewById(R.id.steps1);
        steps1.setOnClickListener( this);

        calen1 = findViewById(R.id.calen1);
        calen1.setOnClickListener( this);

        pro1 = findViewById(R.id.pro1);
        pro1.setOnClickListener( this);




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



    public void onClick(View v){

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



   /* @Override
    public boolean onCreateOptionsMenu (Menu m){
        getMenuInflater().inflate(R.menu.main_menu, m);
        return super.onCreateOptionsMenu(m);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.logout:
                Intent i = new Intent(this, MainActivity.class);
                startActivity(i);

        }
        return true;
    }

    public Menu getMain_menu() {
        return main_menu;
    }

    public void setMain_menu(Menu main_menu) {
        this.main_menu = main_menu;
    }*/
}

