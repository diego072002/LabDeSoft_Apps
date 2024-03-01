package com.example.leydeenfriamiento;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {


    double C5 = 0, K5 = 0, resultadotiemp, resultadotemp;
    int marca = 0, mn = 0, ms = 0;
    String e="",f="";

    private EditText Tiempo1;
    private EditText Tiempo2;
    private EditText Tiempo3;
    private EditText Temp1;
    private EditText Temp2;
    private EditText Temp3;
    private EditText Tempmedio;
    private TextView Resultado;
    private TextView Resultado1;
    private TextView Resultado2;
    private TextView texttiempo1;
    private TextView texttiempo2;
    private TextView texttemp1;
    private TextView texttemp2;
    private TextView texttemp3;
    private Spinner spinner1;
    private Spinner spinner2;
    private boolean infirsttime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Tiempo1 = (EditText) findViewById(R.id.Cajatiempo1);
        Tiempo2 = (EditText) findViewById(R.id.Cajatiempo2);
        Tiempo3 = (EditText) findViewById(R.id.Cajatiempo3);
        Temp1 = (EditText) findViewById(R.id.Cajatemp1);
        Temp2 = (EditText) findViewById(R.id.Cajatemp2);
        Temp3 = (EditText) findViewById(R.id.Cajatemp3);
        Tempmedio = (EditText) findViewById(R.id.Cajatempme);
        texttiempo1 = (TextView) findViewById(R.id.TextTiem1);
        texttiempo2 = (TextView) findViewById(R.id.TextTiem2);
        texttemp1 = (TextView) findViewById(R.id.textView11);
        texttemp2 = (TextView) findViewById(R.id.textView12);
        texttemp3 = (TextView) findViewById(R.id.textView13);

        Resultado = (TextView) findViewById(R.id.Re);
        Resultado1 = (TextView) findViewById(R.id.RE1);
        Resultado2 = (TextView) findViewById(R.id.RE2);
        spinner1 = (Spinner) findViewById(R.id.spinnertiem);
        spinner2 = (Spinner) findViewById(R.id.spinnertemp);

        String[] opciones1 = {"Segundos", "Minutos", "Horas"};
        String[] opciones2 = {"Celsius", "Farenheit"};

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, opciones1);
        spinner1.setAdapter(adapter1);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (parent.getItemAtPosition(position).toString().equals("Segundos")){
                    e="Seg";
                } else if (parent.getItemAtPosition(position).toString().equals("Minutos")) {
                  e="Min";
                }else if (parent.getItemAtPosition(position).toString().equals("Horas")){
                    e="Hrs";
                }
                texttiempo1.setText(e);
                texttiempo2.setText(e);
                Resultado2.setText(e+" la temperatura sera: ");



            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (parent.getItemAtPosition(position).toString().equals("Celsius")){
                    f="°C";
                } else if (parent.getItemAtPosition(position).toString().equals("Farenheit")) {
                    f="°F";
                }
                texttemp1.setText(f);
                texttemp2.setText(f);
                texttemp3.setText(f);
                Resultado1.setText(f+" se dara en un tiempo de: ");



            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });






        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, opciones2);
        spinner2.setAdapter(adapter2);






    }

    public void CALCULARFuncion(View view) {
        try {
            double t1, t2, TEM1, TEM2, TEMm, K1, K2, K, C, C1, C2;

            t1 = Float.parseFloat(Tiempo1.getText().toString());
            t2 = Float.parseFloat(Tiempo2.getText().toString());
            TEM1 = Float.parseFloat(Temp1.getText().toString());
            TEM2 = Float.parseFloat(Temp2.getText().toString());
            TEMm = Float.parseFloat(Tempmedio.getText().toString());

            K1 = Math.log((TEM2 - TEMm) / (TEM1 - TEMm));
            K2 = t2 - t1;
            K = K1 / K2;
            K5 = K;
            C1 = TEM1 - TEMm;
            C2 = Math.exp(t1 * K);
            C = C1 / C2;
            C5 = C;
            DecimalFormat formato1 = new DecimalFormat("#.######");
            if (TEMm>=0){
                Resultado.setText("T(t)=" + formato1.format(C) + "(e^" + formato1.format(K) + " t)+" + TEMm);
            } else {
                Resultado.setText("T(t)=" + formato1.format(C) + "(e^" + formato1.format(K) + " t)" + TEMm);

            }
            {

            }


            marca = 1;
        } catch (Exception e) {
            Toast.makeText(this, "Llena todos los campos", Toast.LENGTH_LONG).show();
        }
    }

    public void Calculartemp(View view) {
        try {
            double K, C, Tiempo, TEMm, R;
            K = K5;
            C = C5;

            if (C == 0 || K == 0) {
                Toast.makeText(this, "Calcule la funcion", Toast.LENGTH_LONG).show();

            } else {
                Tiempo = Float.parseFloat(Tiempo3.getText().toString());
                TEMm = Float.parseFloat(Tempmedio.getText().toString());
                DecimalFormat formato1 = new DecimalFormat("#.##");

                R = (C) * (Math.exp(K * Tiempo)) + TEMm;
                Resultado2.setText(e+" la temperatura sera: " + formato1.format(R) + " "+f);
                resultadotemp = R;
                mn = 1;
                //convertir2();


            }


        } catch (Exception e) {
            Toast.makeText(this, "Llene el campo necesario", Toast.LENGTH_LONG).show();

        }


    }

    public void Calculartiempo(View view) {
        try {
            double K, C, Temp, TEMm, R, div, lo;

            K = K5;
            C = C5;
            if (C == 0 || K == 0) {
                Toast.makeText(this, "Calcule la funcion", Toast.LENGTH_LONG).show();

            } else {
                Temp = Float.parseFloat(Temp3.getText().toString());
                TEMm = Float.parseFloat(Tempmedio.getText().toString());
                DecimalFormat formato1 = new DecimalFormat("#.##");

                    div = (Temp - TEMm) / C;
                    lo = Math.log(div);

                    R = lo / K;
                    if (R==-0){
                        R=0;
                    }
                    Resultado1.setText(f+" se dara en un tiempo de: " + formato1.format(R)+" "+e);
                    resultadotiemp = R;
                    ms = 1;
                  //  convertir1();
            }
        } catch (Exception e) {
            Toast.makeText(this, "Llene el campo necesario", Toast.LENGTH_LONG).show();

        }


    }

    public void convertir1() {
        try {
            //ms marca tiempo
            //mn marca temperatura
            if (marca == 1 && ms == 1) {
                String m = "Min";
                double r = 0;
                String seleccion1 = spinner1.getSelectedItem().toString();
                if (seleccion1.equals("Segundos") ) {
                    m = "Seg";
                    r = resultadotiemp * 60;
                }else if(seleccion1.equals("Horas") ){
                    m = "Hrs";
                    r = resultadotiemp / 60;
                } else if (seleccion1.equals("Minutos")) {
                    m="Min";
                    r=resultadotiemp;
                }
                DecimalFormat formato1 = new DecimalFormat("#.##");
                Resultado1.setText("°C se dara en un tiempo de: " + formato1.format(r)+" "+m);
            }


        } catch (Exception e) {
            Toast.makeText(this, "Llene el campo necesario", Toast.LENGTH_LONG).show();

        }


    }
    
    public void convertir2(){
        if (marca == 1 && mn == 1) {
            String m = "°C";
            double r = 0;
            String seleccion2 = spinner2.getSelectedItem().toString();
            if (seleccion2.equals("Celsius")){
                m="°C";
                r=resultadotemp;
                
            } else if (seleccion2.equals("Farenheit")) {
                m="°F";
                r=(resultadotemp*1.8)+32;
                
            }
            DecimalFormat formato1 = new DecimalFormat("#.##");
            Resultado2.setText("min la temperatura sera: " + formato1.format(r) + " "+m);

        }
        
    }
}

