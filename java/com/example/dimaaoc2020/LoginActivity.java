package com.example.dimaaoc2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    //1.properties definition
    EditText  password, email;
    Button log;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //2.initialize properties
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);

        log = findViewById(R.id.log);
        log.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == log){
            Intent i = new Intent(this,FirstActivity.class);
            startActivity(i);
        }
    }


}