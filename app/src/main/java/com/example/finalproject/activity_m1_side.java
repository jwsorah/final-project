package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_m1_side extends AppCompatActivity {

    Button button5;
    Button button8;
    Button button9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m1_side);

        button5 = findViewById(R.id.button5);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), activity_database.class);
                startActivity(i);

            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), activity_m1_autobots.class);
                startActivity(i);

            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), activity_m1_decepticons.class);
                startActivity(i);

            }
        });


    }











}