package com.example.dimaaoc2020;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class SignupActivity extends AppCompatActivity implements View.OnClickListener {
    EditText name, email, pass;
    Button signn;
    ImageButton b;


    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);

        signn = findViewById(R.id.signn);
        signn.setOnClickListener(this);

        b = findViewById(R.id.imageButton);
        b.setOnClickListener(this);

        AlertDialog dialog = new AlertDialog.Builder(this).setMessage("click on the profile icon to add photo").setNegativeButton("ok", null).show();
        dialog.show();

        //signup(email.getText().toString(), pass.getText().toString());
    }


    @Override
    public void onClick(View v) {
        if (v == signn) {
            if (name.getText().toString().equals("") || email.getText().toString().equals("") || pass.getText().toString().equals("")) {
                Toast.makeText(this, "empty informations", Toast.LENGTH_LONG).show();
            } else {
                createAccount(email.getText().toString(), pass.getText().toString());

                Intent j = new Intent(this, GoalActivity.class);
                j.putExtra("email", email.getText().toString());
                j.putExtra("password", pass.getText().toString());
                j.putExtra("name", name.getText().toString());
                startActivity(j);
            }
        }
        if (v == b) {
            Intent j = new Intent(this, CamActivity.class);
            startActivity(j);
        }

    }


    public void createAccount(String email, String password) {
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d("FIREBASE", "createUserWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                            // updateUI(user);
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w("FIREBASE", "createUserWithEmail:failure", task.getException());
                            Toast.makeText(SignupActivity.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                            // updateUI(null);
                        }

                        // ...
                    }
                });
    }

    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
    }

    public void signup(String email, String password) {

        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d("FirbaseAuth", "createUserWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w("FirbaseAuth", "createUserWithEmail:failure", task.getException());

                        }

                        // ...
                    }
                });


    }
}



