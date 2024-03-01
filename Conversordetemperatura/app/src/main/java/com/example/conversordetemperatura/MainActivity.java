package com.example.conversordetemperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner1;

    private EditText Temp1;
    private TextView re;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner1 = (Spinner) findViewById(R.id.spinner);
        Temp1 = (EditText) findViewById(R.id.editTextNumberDecimal);
        re = (TextView) findViewById(R.id.RES);




        String[] opciones1 = {"Celsius", "Farenheit","Kelvin"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, opciones1);
        spinner1.setAdapter(adapter1);
    }


    public void CALCULAR(View view) {

        float num,cel = 0,far = 0,kel=0;

        num=Float.parseFloat(Temp1.getText().toString());
        String opcion=spinner1.getSelectedItem().toString();

        if (opcion.equals("Celsius")){
            cel=num;
            far= (float) (num*1.8+32);
            kel= (float) (num+273.15);
        } else if (opcion.equals("Farenheit")) {
            far=num;
            cel= (float) ((num-32)*(0.5555555555555555555555));
            kel= (float) ((num-32)*(0.5555555555555555555555)+273.15);
        } else if (opcion.equals("Kelvin")){
            kel=num;
            cel= (float) (num-273.15);
            far= (float) ((num-273.15)*(1.8)+32);
        }


        re.setText("Celsius: "+cel+"°"+
                        "\n\nFarenheit: "+far+"°"+
                        "\n\nKelvin: "+kel+"°");


    }


}