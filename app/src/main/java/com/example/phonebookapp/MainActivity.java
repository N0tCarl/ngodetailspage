package com.example.phonebookapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
        public void movenextpage1(View v){
            Intent intent = new Intent (MainActivity.this, MainActivity2.class);
            startActivity(intent);
         }

         public void movenextpage2(View v){
            Intent intent = new Intent (MainActivity.this, MainActivity3.class);
            startActivity(intent);
        }

        public void movenextpage3(View v){
            Intent intent = new Intent (MainActivity.this, MainActivity4.class);
            startActivity(intent);
        }

        public void movenextpage4(View v){
            Intent intent = new Intent (MainActivity.this, MainActivity5.class);
            startActivity(intent);
        }





    }

