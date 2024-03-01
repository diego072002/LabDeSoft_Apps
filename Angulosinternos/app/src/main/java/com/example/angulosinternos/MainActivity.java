package com.example.angulosinternos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText n;
    private TextView RES;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n=(EditText) findViewById(R.id.eTextnumero);
        RES=(TextView) findViewById(R.id.resultado);
    }

    public void CALCULARres(View view) {

        try{
            float numero, suma, angulo;

            numero=Float.parseFloat(n.getText().toString());
            if(numero<=2){
                RES.setText("El numero de lados tiene que ser mayor a 2");
            }else{
                suma=180*(numero-2);
                angulo=suma/numero;

                RES.setText("La suma de los angulos interiores es: "+suma+"\n Un solo angulo mide: "+angulo);
            }
        }catch (Exception e){
            Toast.makeText(this, "Coloca un dato valido", Toast.LENGTH_SHORT).show();
        }
















    }





}