package com.example.dimaaoc2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class GoalActivity extends AppCompatActivity implements View.OnClickListener {

    Button gDone;
    EditText stepG, calG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal);

        gDone = findViewById(R.id.gdone);
        gDone.setOnClickListener(this);

        stepG = findViewById(R.id.stepG);
        calG = findViewById(R.id.calG);
    }



    public void onClick(View v) {
        if (v == gDone) {
            if (calG.getText().toString().equals("") || stepG.getText().toString().equals("")) {
                Toast.makeText(this, "empty informations", Toast.LENGTH_LONG).show();
            } else {
                Intent i = new Intent(this, FirstActivity.class);
                startActivity(i);
            }
        }
    }
}
