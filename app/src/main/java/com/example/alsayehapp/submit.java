package com.example.alsayehapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class submit extends AppCompatActivity {
    private Button mBackInterest,mRegister;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit);
        mBackInterest = (Button) findViewById(R.id.backInterestBtn);
        mRegister = (Button) findViewById(R.id.registerBtn);

        mBackInterest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(submit.this, interest.class);
                startActivity(intent);
                finish();
                return;
            }
        });

        mRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(submit.this, MainActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });
    }
}