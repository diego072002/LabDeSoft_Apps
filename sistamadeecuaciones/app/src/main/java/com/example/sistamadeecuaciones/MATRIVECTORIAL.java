package com.example.sistamadeecuaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MATRIVECTORIAL extends AppCompatActivity {
    private EditText a1;

    private EditText b1;

    private EditText c1;

    private EditText a2;

    private EditText b2;

    private EditText c2;
    private TextView ri;

    private TextView rj;

    private TextView rk;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrivectorial);

        a1 = (EditText) findViewById(R.id.AV);

        b1 = (EditText) findViewById(R.id.BV);

        c1 = (EditText) findViewById(R.id.CV);

        a2 = (EditText) findViewById(R.id.AV2);

        b2 = (EditText) findViewById(R.id.BV2);

        c2 = (EditText) findViewById(R.id.CV2);

        ri = (TextView) findViewById(R.id.RI);

        rj = (TextView) findViewById(R.id.RJ);

        rk = (TextView) findViewById(R.id.RK);

    }

    public void FormGnrl(View view) {



    }
}