package com.example.adivinaelnumero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void novato(View view){
        Intent uno=new Intent(this, Juego.class);
        uno.putExtra("nivel","1");
        startActivity(uno);
    }
    public void facil(View view){
        Intent dos=new Intent(this, Juego.class);
        dos.putExtra("nivel","2");
        startActivity(dos);
    }
    public void medio(View view){
        Intent tres=new Intent(this, Juego.class);
        tres.putExtra("nivel","3");
        startActivity(tres);
    }
    public void dificil(View view){
        Intent cuatro=new Intent(this, Juego.class);
        cuatro.putExtra("nivel","4");
        startActivity(cuatro);
    }
    public void maestro(View view){
        Intent cinco=new Intent(this, Juego.class);
        cinco.putExtra("nivel","5");
        startActivity(cinco);
    }





}