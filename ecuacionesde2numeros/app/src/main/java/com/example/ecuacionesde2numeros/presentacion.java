package com.example.ecuacionesde2numeros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class presentacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentacion);

    }public void inicio (View view){
        Intent iraFORMULA=new Intent(this, formula.class);
        startActivity(iraFORMULA);

    }



    }
