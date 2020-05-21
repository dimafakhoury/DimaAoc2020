package com.example.dimaaoc2020;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CamActivity extends AppCompatActivity implements View.OnClickListener {

    private static final int CAMERA_REQUEST = 0;
    private static final int SELECT_IMAGE = 1;
    ImageView imageView;
    Button  btTakePhot, done;
    Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cam);


        btTakePhot = findViewById(R.id.camera);
        btTakePhot.setOnClickListener(this);

        done = findViewById(R.id.button3);
        done.setOnClickListener(this);


    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK) {
            bitmap = (Bitmap) data.getExtras().get("data");
            imageView.setImageBitmap(bitmap);
        }
    }


        @Override
        public void onClick(View view) {
            if (view == btTakePhot) {
                Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i, CAMERA_REQUEST);
            }

            if (view == done) {
                Intent i = new Intent(this, SignupActivity.class);
                startActivity(i);
            }
        }
    }

