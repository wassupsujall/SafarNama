package com.example.safarnama;

import static android.view.View.VISIBLE;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class WelcomeActivity extends AppCompatActivity {


    public Integer REQUEST_EXIT = 9;
    public FirebaseAuth mAuth;
    public FirebaseUser currentUser;
    Button signUpButton;
    Button signInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


        mAuth = FirebaseAuth.getInstance();


        signUpButton = findViewById(R.id.welcomeSignUpButton);
        signInButton = findViewById(R.id.welcomeSignInButton);

        signInButton.setVisibility(VISIBLE);
        signUpButton.setVisibility(VISIBLE);

        if (mAuth.getCurrentUser() != null) {
            mAuth.getCurrentUser().reload().addOnSuccessListener(aVoid -> {

                currentUser = mAuth.getCurrentUser();


                if (currentUser != null && currentUser.isEmailVerified()) {


                    System.out.println("Email Verified : " + currentUser.isEmailVerified());

                    Intent MainActivity = new Intent(WelcomeActivity.this, MainActivity.class);
                    startActivity(MainActivity);
                    WelcomeActivity.this.finish();


                }
            });

        } else {

            signInButton.setVisibility(VISIBLE);
            signUpButton.setVisibility(VISIBLE);

            System.out.println("user not available");

        }

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent signUpIntent = new Intent(WelcomeActivity.this, MainActivity.class);

                startActivity(signUpIntent);


            }
        });


        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent signInIntent = new Intent(WelcomeActivity.this, MainActivity2.class);

                startActivityForResult(signInIntent, REQUEST_EXIT);


            }
        });

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_EXIT) {
            if (resultCode == RESULT_OK) {
                this.finish();

            }
        }
    }



}
