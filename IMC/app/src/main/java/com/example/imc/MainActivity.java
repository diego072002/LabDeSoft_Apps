package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText kg,m;
    private TextView RES;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kg=(EditText) findViewById(R.id.EdTextkg);
        m=(EditText) findViewById(R.id.EdTextm);
        RES=(TextView) findViewById(R.id.resultado);

    }

    public void CALCULARres(View view) {

        try{
            float masa,altura,imc;

            masa=Float.parseFloat(kg.getText().toString());
            altura=Float.parseFloat(m.getText().toString());

            imc= (float) (masa/(Math.pow(altura,2)));


            RES.setText("El indice de masa corporal es: "+imc);
        }catch (Exception e){

            Toast.makeText(this, "Ingresa todos los datos", Toast.LENGTH_SHORT).show();

        }









    }





}