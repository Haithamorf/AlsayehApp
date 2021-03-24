package com.example.alsayehapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.ToggleButton;

public class ForgetPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);
    }

    public void changeMethod(View view) {
        ToggleButton toggleButtonToChange = (ToggleButton) findViewById(R.id.toggleButton);
        EditText info = (EditText)findViewById(R.id.infoText);
        if(toggleButtonToChange.isChecked()){
            toggleButtonToChange.setGravity(Gravity.LEFT|Gravity.CENTER_VERTICAL);
            info.setHint("Email");
            info.setInputType(InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS);
        } else {
            toggleButtonToChange.setGravity(Gravity.RIGHT|Gravity.CENTER_VERTICAL);
            info.setHint("Phone number");
            info.setInputType(InputType.TYPE_CLASS_PHONE);
        }
    }
}