package com.example.dimaaoc2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChangePassActivity extends AppCompatActivity implements View.OnClickListener{
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_pass);

        submit = findViewById(R.id.submit);
        submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==submit){
            Intent j = new Intent(this, ProfileActivity.class);
            startActivity(j);
        }
    }
}
