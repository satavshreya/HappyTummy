package com.example.happy_tummy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        View deals1 = findViewById(R.id.Deals);
        Button menucardbtn=findViewById(R.id.menucard);
        menucardbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menuu = new Intent(Home.this,bread.class);
                startActivity(menuu);
            }
        });

        deals1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deals = new Intent(Home.this,DealsOfTheDay.class);
                startActivity(deals);
            }
        });

        View home = findViewById(R.id.Home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home1 = new Intent(Home.this,Home.class);
                startActivity(home1);
            }
        });

        View locateus = findViewById(R.id.Findus);
        locateus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home1 = new Intent(Home.this,findus.class);
                startActivity(home1);
            }
        });
    }
}