package com.example.happy_tummy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class AddOns extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_ons);
        String[] itemname3 = {"Iced Tea","Lime Soda","Cold Coffee","Diet Can"};
        int[] images3={R.drawable.icedtea,R.drawable.limesoda,R.drawable.coldcoffee,R.drawable.dietcan};
        int[] prices3 = {100,150,299,199};
        GridView gridView2 = findViewById(R.id.gridView3);
        GridAdapter gridAdapter2 = new GridAdapter(AddOns.this,itemname3,images3,prices3);
        gridView2.setAdapter(gridAdapter2);

    }
}