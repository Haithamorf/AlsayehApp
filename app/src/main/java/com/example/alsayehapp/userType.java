package com.example.alsayehapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class userType extends AppCompatActivity {
    private Button mTousistType, mTouristGuideType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_type);
        mTousistType = (Button) findViewById(R.id.touristBtn);
        mTouristGuideType = (Button) findViewById(R.id.touristGuideBtn);

        mTousistType.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(userType.this, signUp.class);
                startActivity(intent);
                finish();
                return;
            }
        });
    }
}