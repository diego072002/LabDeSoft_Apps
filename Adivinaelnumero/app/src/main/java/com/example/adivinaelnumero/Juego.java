package com.example.adivinaelnumero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Juego extends AppCompatActivity {
    private TextView m,numint,res;
    private TextView n;
    private EditText com;
    String modo="";
    int aleatorio;
    int intento=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);
        m=(TextView) findViewById(R.id.mostrar);
        n=(TextView) findViewById(R.id.nota);
        com=(EditText) findViewById(R.id.numero);
        numint=(TextView) findViewById(R.id.intentos);
        res=(TextView) findViewById(R.id.h);

        int nivel = Integer.parseInt(getIntent().getStringExtra("nivel"));
        if(nivel==1){
            modo="novato\nAdivina un numero del 1 al 10";
            aleatorio=(int)(Math.random()*10)+1;
        } else if (nivel==2) {
            modo="fácil\nAdivina un numero del 1 al 100";
            aleatorio=(int)(Math.random()*100)+1;
        } else if (nivel==3) {
            modo="medio\nAdivina un numero del 1 al 500";
            aleatorio=(int)(Math.random()*500)+1;
        } else if (nivel==4) {
            modo="dificil\nAdivina un numero del 1 al 1000";
            aleatorio=(int)(Math.random()*1000)+1;
        } else if (nivel==5) {
            modo="maestro\nAdivina un numero del 1 al 5000";
            aleatorio=(int)(Math.random()*5000)+1;
        }
        m.setText("Bienvenido al modo "+modo);

    }

    public void procedimiento(View view) {

        int numero= Integer.parseInt(com.getText().toString());
        intento++;
        if (numero>aleatorio) {
            n.setText("Numero alto");
        } else if (numero<aleatorio) {
            n.setText("Numero bajo");
        } else if (numero==aleatorio) {
            n.setText("Felicidades");
            Toast.makeText(this,"Felicidades ese es el numero",Toast.LENGTH_SHORT).show();
            res.setText(aleatorio+"");
        }
        numint.setText(intento+"");


    }
    }




