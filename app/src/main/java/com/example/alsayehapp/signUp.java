package com.example.alsayehapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Calendar;

public class signUp extends AppCompatActivity {
    private static final String Tag= "signUp";
    private Button mBackUserType,mNextInterest;

    private TextView mDisplayDate;
    private DatePickerDialog.OnDateSetListener mDateSetListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        mDisplayDate = (TextView) findViewById(R.id.txtSelectDate);
        mDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog dialog = new DatePickerDialog(signUp.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mDateSetListener,
                        year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
        mDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
               month = month + 1 ;
                Log.d(Tag,"onDateSet: mm/dd/yyy:" + month + "/" + day + "/" + year);

                String date = month + '/' + day + "/" + year;
                mDisplayDate.setText(date);
            }
        };
        setContentView(R.layout.activity_sign_up);
        mBackUserType = (Button) findViewById(R.id.backBtn);
        mNextInterest = (Button) findViewById(R.id.nextBtn);

        mBackUserType.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signUp.this, userType.class);
                startActivity(intent);
                finish();
                return;
            }
        });
        mNextInterest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signUp.this, interest.class);
                startActivity(intent);
                finish();
                return;
            }
        });
    }
    }