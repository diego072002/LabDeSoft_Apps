package com.example.sistamadeecuaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class sistema3x3 extends AppCompatActivity {

    private EditText a1;

    private EditText b1;

    private EditText c1;

    private EditText z1;

    private EditText a2;

    private EditText b2;

    private EditText c2;

    private EditText z2;

    private EditText a3;

    private EditText b3;

    private EditText c3;

    private EditText z3;

    private TextView rx;

    private TextView ry;

    private TextView rz;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sistema3x3);


        a1 = (EditText) findViewById(R.id.a1);

        b1 = (EditText) findViewById(R.id.b1);

        c1 = (EditText) findViewById(R.id.c1);

        z1 = (EditText) findViewById(R.id.z1);

        a2 = (EditText) findViewById(R.id.a2);

        b2 = (EditText) findViewById(R.id.b2);

        c2 = (EditText) findViewById(R.id.c2);

        z2 = (EditText) findViewById(R.id.z2);

        a3 = (EditText) findViewById(R.id.a3);

        b3 = (EditText) findViewById(R.id.b3);

        c3 = (EditText) findViewById(R.id.c3);

        z3 = (EditText) findViewById(R.id.z3);

        rx = (TextView) findViewById(R.id.resultadox2);
        ry = (TextView) findViewById(R.id.resulatadoy2);
        rz = (TextView) findViewById(R.id.resulz);

    }

    public void FormGnrl(View view) {
        try {
            float A1, B1, C1, Z1, A2, B2, C2, Z2, A3, B3, C3, Z3, DS, DX, DY, DZ, x, y, Z;

            A1 = Float.parseFloat(a1.getText().toString());
            B1 = Float.parseFloat(b1.getText().toString());
            C1 = Float.parseFloat(c1.getText().toString());
            Z1 = Float.parseFloat(z1.getText().toString());
            A2 = Float.parseFloat(a2.getText().toString());
            B2 = Float.parseFloat(b2.getText().toString());
            C2 = Float.parseFloat(c2.getText().toString());
            Z2 = Float.parseFloat(z2.getText().toString());
            A3 = Float.parseFloat(a3.getText().toString());
            B3 = Float.parseFloat(b3.getText().toString());
            C3 = Float.parseFloat(c3.getText().toString());
            Z3 = Float.parseFloat(z3.getText().toString());

            DS = ((A1 * B2 * C3) + (A2 * B3 * C1) + (A3 * B1 * C2)) - ((A2 * B1 * C3) + (A1 * B3 * C2) + (A3 * B2 * C1));
            DX = ((Z1 * B2 * C3) + (Z2 * B3 * C1) + (Z3 * B1 * C2)) - ((Z2 * B1 * C3) + (Z1 * B3 * C2) + (Z3 * B2 * C1));
            x = (DX / DS);
            rx.setText("resultado de x" + x);

            DY = ((A1 * Z2 * C3) + (A2 * Z3 * C1) + (A3 * Z1 * C2)) - ((A2 * Z1 * C3) + (A1 * Z3 * C2) + (A3 * Z2 * C1));

            y = (DY / DS);

            ry.setText("resultado de y" + y);

            DZ = ((A1 * B2 * Z3) + (A2 * B3 * Z1) + (A3 * B1 * Z2)) - ((A2 * B1 * Z3) + (A1 * B3 * Z2) + (A3 * B2 * Z1));

            Z = (DZ / DS);

            rz.setText("resultado de y" + Z);
        } catch (Exception e) {
            Toast.makeText(this, "inserta los valores", Toast.LENGTH_SHORT).show();
        }
    }
}

