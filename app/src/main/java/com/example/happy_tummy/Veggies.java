package com.example.happy_tummy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

public class Veggies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veggies);
        String[] itemname2 = {"Veggie Delight","Chatpata Chana","Corn & Peas","Mexican Patty"};
        int[] images2={R.drawable.veggies,R.drawable.chatpatachana,R.drawable.cornpeas,R.drawable.mexicanpatty};
        int[] prices2 = {200,300,400,200};
        GridView gridView2 = findViewById(R.id.gridView2);
        GridAdapter gridAdapter2 = new GridAdapter(Veggies.this,itemname2,images2,prices2);
        gridView2.setAdapter(gridAdapter2);
        Button addonbtn = findViewById(R.id.addonbtn);
        addonbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deals = new Intent(Veggies.this,AddOns.class);
                startActivity(deals);
            }
        });

    }
}