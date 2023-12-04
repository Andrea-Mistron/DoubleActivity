package com.example.doubleactivity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onClick(View view){
        startActivity(new Intent(MainActivity2.this, MainActivity.class));
    }
}