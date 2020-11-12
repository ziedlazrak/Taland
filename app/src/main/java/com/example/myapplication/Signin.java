package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Signin extends AppCompatActivity {
    TextView talandlogo;
    TextView signemail;
    EditText Email;
    EditText Password;
    Button Signin;
    Button Forgotpassword;
    Button gotosignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        //--------------------------------------------------------
        talandlogo = findViewById(R.id.textView);
        signemail = findViewById(R.id.textView2);
        Email = findViewById(R.id.addEmailAddress);
        Password = findViewById(R.id.addPassword);
        Signin = findViewById(R.id.Signinbtn);
        Forgotpassword = findViewById(R.id.forgotpasswordbtn);
        gotosignup = findViewById(R.id.gotosignup);
        //--------------------------------------------------------
        talandlogo.startAnimation(AnimationUtils.loadAnimation(
                getApplicationContext(),R.anim.fadein
        ));
        signemail.startAnimation(AnimationUtils.loadAnimation(
                getApplicationContext(),R.anim.fadein
        ));
        Email.startAnimation(AnimationUtils.loadAnimation(
                getApplicationContext(),R.anim.fadein
        ));
        Password.startAnimation(AnimationUtils.loadAnimation(
                getApplicationContext(),R.anim.fadein
        ));
        Signin.startAnimation(AnimationUtils.loadAnimation(
                getApplicationContext(),R.anim.fadein
        ));
        Forgotpassword.startAnimation(AnimationUtils.loadAnimation(
                getApplicationContext(),R.anim.fadein
        ));
        gotosignup.startAnimation(AnimationUtils.loadAnimation(
                getApplicationContext(),R.anim.fadein
        ));
        //-----------------------------------------------------
        gotosignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Signin.this, SignUp.class);
                startActivity(intent);
                overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
            }
        });


    }
}