package com.example.doubleactivity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        startActivity(new Intent(MainActivity.this, MainActivity2.class));
    }
}
