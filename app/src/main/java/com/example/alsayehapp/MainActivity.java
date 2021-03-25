package com.example.alsayehapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button mLogin,mSignup,mForget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLogin= (Button) findViewById(R.id.LogInBtn);
        mSignup= (Button) findViewById(R.id.signupBtn);
        mForget= (Button) findViewById(R.id.forgetPassBtn);

        mSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,userType.class);
                startActivity(intent);
                finish();
                return;

            }
        });

        mForget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent( MainActivity.this,ForgetPasswordActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });
    }


}