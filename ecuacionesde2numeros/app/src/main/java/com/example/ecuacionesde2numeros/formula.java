package com.example.ecuacionesde2numeros;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class formula extends AppCompatActivity {

private EditText d1;

private TextView x2;

private EditText d2;

private TextView y;

private EditText d3;

private TextView rx;

private TextView ry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        d1 = (EditText) findViewById(R.id.dato1);

        d2 = (EditText) findViewById(R.id.dato2);

        d3 = (EditText) findViewById(R.id.dato3);

        rx = (TextView) findViewById(R.id.resultado1);

        ry = (TextView) findViewById(R.id.resultado2);
    }
    public void FormGnrl(View view){
        try {

            double a, b, c, r1, r2;

            a=Double.parseDouble(d1.getText().toString());
            b=Double.parseDouble(d2.getText().toString());
            c=Double.parseDouble(d3.getText().toString());


            if((Math.pow(b,2)-4*a*c)>=0){
                r1=(-b+(Math.sqrt((Math.pow(b,2)-4*a*c))))/(2*a);
                r2=(-b-(Math.sqrt((Math.pow(b,2)-4*a*c))))/(2*a);
                rx.setText("x1: "+r1);
                ry.setText("x2: "+r2);

            }else{

                r1=(-b+(Math.sqrt(-1*(Math.pow(b,2)-4*a*c))))/(2*a);
                r2=(-b-(Math.sqrt(-1*(Math.pow(b,2)-4*a*c))))/(2*a);

                rx.setText("x1: "+r1+"i");
                ry.setText("x2: "+r2+"i");
            }

        }catch (Exception e){
            Toast.makeText(this,"inserta los valores",Toast.LENGTH_SHORT).show();
        }

    }
}

