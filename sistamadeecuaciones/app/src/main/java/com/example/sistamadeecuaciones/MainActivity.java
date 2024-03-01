package com.example.sistamadeecuaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText a1;

    private TextView x1;

    private EditText b1;

    private TextView y1;

    private EditText c1;

    private EditText a2;

    private TextView x2;

    private EditText b2;

    private TextView y2;

    private EditText c2;

    private TextView rx;

    private TextView ry;

    private TextView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a1 = (EditText) findViewById(R.id.A1);

        b1 = (EditText) findViewById(R.id.B1);

        c1 = (EditText) findViewById(R.id.C1);

        a2 = (EditText) findViewById(R.id.A2);

        b2 = (EditText) findViewById(R.id.B2);

        c2 = (EditText) findViewById(R.id.C2);

        rx = (TextView) findViewById(R.id.resultadox);

        ry = (TextView) findViewById(R.id.resulatadoy);


    }
    public void FormGnrl(View view){
        try{
            double a, b, c, A, B, C, r1, r2, Ds, Dx, Dy, X,Y;

            a=Double.parseDouble(a1.getText().toString());
            b=Double.parseDouble(b1.getText().toString());
            c=Double.parseDouble(c1.getText().toString());
            A=Double.parseDouble(a2.getText().toString());
            B=Double.parseDouble(b2.getText().toString());
            C=Double.parseDouble(c2.getText().toString());

            Ds = (a*A)-(A*b);
            Dx = (c*B)-(C*b);
            Dy = (a*C)-(A*c);

            if(Ds!=0){
                X = Dx/Ds;
                Y = Dy/Ds;
                rx.setText("El Resultado es el siguente: "+ X);
                ry.setText("El Resultado es el siguente: "+ Y);

            }else{

                ry.setText("El Resultado no valido: "+ rv);



            }


            

        }catch (Exception e) {
            Toast.makeText(this, "inserta los valores", Toast.LENGTH_SHORT).show();
        }







    }

}