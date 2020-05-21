package com.example.dimaaoc2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button loginB, SignupB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginB = findViewById(R.id.loginB);
        loginB.setOnClickListener(this);

        SignupB = findViewById(R.id.SignupB);
        SignupB.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == loginB) {
            Intent i = new Intent(this, LoginActivity.class);
            startActivity(i);
        }
        else {
            if (v == SignupB) {
                Intent i = new Intent(this, SignupActivity.class);
                startActivity(i);
            }
        }



    }
}
