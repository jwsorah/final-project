package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_m1_decepticons extends AppCompatActivity {

    Button button10;
    Button button16;
    Button button17;
    Button button18;
    Button button19;
    Button button20;
    Button button21;
    Button button22;
    Button button23;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m1_decepticons);

            button10 = findViewById(R.id.button10);
            button16 = findViewById(R.id.button16);
            button17 = findViewById(R.id.button17);
            button18 = findViewById(R.id.button18);
            button19 = findViewById(R.id.button19);
            button20 = findViewById(R.id.button20);
            button21 = findViewById(R.id.button21);
            button22 = findViewById(R.id.button22);
            button23 = findViewById(R.id.button23);

            button10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent i = new Intent(getApplicationContext(), activity_m1_side.class);
                    startActivity(i);

                }
            });

            button16.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent i = new Intent(getApplicationContext(), activity_m1_megatron.class);
                    startActivity(i);

                }
            });

            button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), activity_m1_starscream.class);
                startActivity(i);

            }
             });

            button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), activity_m1_barricade.class);
                startActivity(i);

            }
             });

            button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), activity_m1_frenzy.class);
                startActivity(i);

            }
             });

            button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), activity_m1_bonecrusher.class);
                startActivity(i);

            }
            });

            button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), activity_m1_blackout.class);
                startActivity(i);

            }
            });

            button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), activity_m1_scorponok.class);
                startActivity(i);


            }
            });

            button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), activity_m1_brawl.class);
                startActivity(i);


            }
            });


        }
    }