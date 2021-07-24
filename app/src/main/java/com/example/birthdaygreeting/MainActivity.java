package com.example.birthdaygreeting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void clickingMethod(View view) {
        String message=((EditText)findViewById(R.id.personName)).getText().toString();

        Intent intent=new Intent(this,BirthdayGreetingActivity.class);
        intent.putExtra("name", message);

        startActivity(intent);
    }
}