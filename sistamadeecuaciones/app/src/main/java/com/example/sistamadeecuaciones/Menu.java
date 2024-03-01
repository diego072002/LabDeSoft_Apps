package com.example.sistamadeecuaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


    }

    public void ira2x2(View view) {
        Intent dosxdos = new Intent(this, MainActivity.class);

        startActivity(dosxdos);
    }

    public void ira3x3(View view) {
        Intent tresxtres = new Intent(this, sistema3x3.class);

        startActivity(tresxtres);
    }

        public void iravector(View view){
            Intent vector = new Intent(this, MATRIVECTORIAL.class);

            startActivity(vector);
        }


    }
