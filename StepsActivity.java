package com.example.dimaaoc2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

public class StepsActivity extends AppCompatActivity implements SensorEventListener {

    TextView steps, goalS;
    SensorManager sensorManager;
    boolean running =false;
    ProgressBar progress1;
    double pro= Double.parseDouble(steps.getText().toString());
    ImageButton pro1,calen1,steps1,kcal1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_steps);

        steps = (TextView) findViewById(R.id.stepC);
        goalS = (TextView) findViewById(R.id.goalS);


        kcal1 = findViewById(R.id.kcal1);
        kcal1.setOnClickListener((View.OnClickListener) this);

        steps1 = findViewById(R.id.steps1);
        steps1.setOnClickListener((View.OnClickListener) this);

        calen1 = findViewById(R.id.calen1);
        calen1.setOnClickListener((View.OnClickListener) this);

        pro1 = findViewById(R.id.pro1);
        pro1.setOnClickListener((View.OnClickListener) this);

/*
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
         pro=0.063*pro;

        progress1.setProgress(599);

*/
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
        if(v == kcal1){
            Intent i = new Intent(this,FirstActivity.class);
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

    @Override
    public void onSensorChanged(SensorEvent event) {

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }


    /*

    @Override
    public void onSensorChanged(SensorEvent event) {

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }



    @Override
    protected void onResume() {
        super.onResume();

        running= true;
        Sensor countSensor =sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER);
        if(countSensor!=null){
            sensorManager.registerListener(this, countSensor, sensorManager.SENSOR_DELAY_UI);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();

        running=false;
        sensorManager.unregisterListener(this);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
       if(running) {
           steps.setText(String.valueOf(event.values[0]));
       }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
    */
}
