package com.example.birthdaygreeting;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class BirthdayGreetingActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_greeting);

        Intent i= getIntent();
        String message=i.getStringExtra("name");
        ((TextView)findViewById(R.id.textView3)).setText("HAPPY BIRTHDAY"+ "\n" + message.toUpperCase());

    }

}