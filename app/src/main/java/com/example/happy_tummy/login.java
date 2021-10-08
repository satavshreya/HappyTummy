package com.example.happy_tummy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    private EditText loginUsername , loginPassword;
    private Button loginButton;
    private DBHELPER myDb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);

            loginUsername =(EditText) findViewById(R.id.loginusername);
            loginPassword =(EditText) findViewById(R.id.loginpassword);
            loginButton = findViewById(R.id.loginbtn2);

            myDb = new DBHELPER(this);

            loginUser();
        }

    private void loginUser(){
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean var1 = myDb.checkUser(loginUsername.getText().toString() , loginPassword.getText().toString());
//                boolean var2 = myDb.check(loginUsername.getText().toString() , loginPassword.getText().toString());

                if (var1 ==true){
                    Toast.makeText(login.this, "Login Successfully", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(login.this , Home.class));
                    finish();
                }else{
                    Toast.makeText(login.this, "Login Failed Check Credentials!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }



}