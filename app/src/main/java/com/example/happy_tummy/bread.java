package com.example.happy_tummy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;



public class bread extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_bread);

        String[] itemname = {"White","Brown","Low Fat","Gluten Free"};
        int[] images={R.drawable.whitebread,R.drawable.brownbread,R.drawable.lowfatbread,R.drawable.glutenfree};
        int[] prices = {200,300,400,200};
        GridView gridView = findViewById(R.id.gridView);
        GridAdapter gridAdapter = new GridAdapter(bread.this,itemname,images,prices);
        gridView.setAdapter(gridAdapter);
        Button vegiebtn = findViewById(R.id.veggiebtn);
        vegiebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deals = new Intent(bread.this,Veggies.class);
                startActivity(deals);
            }
        });

//        String[] itemname2 = {"Veggie Delight","Chatpata Chana","Corn & Peas","Mexican Patty"};
//        int[] images2={R.drawable.veggies,R.drawable.chatpatachana,R.drawable.cornpeas,R.drawable.mexicanpatty};
//        int[] prices2 = {200,300,400,200};
//        GridView gridView2 = findViewById(R.id.gridView2);
//        GridAdapter gridAdapter2 = new GridAdapter(bread.this,itemname2,images2,prices2);
//        gridView2.setAdapter(gridAdapter2);




    }
}
