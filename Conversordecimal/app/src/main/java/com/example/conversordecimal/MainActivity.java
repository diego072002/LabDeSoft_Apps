package com.example.conversordecimal;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText decimal, binario,hexadecimal;

    private TextWatcher texto=null;
    private Button btndec,btnbin,btnhex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        decimal=(EditText) findViewById(R.id.EdTextDec);
        binario=(EditText) findViewById(R.id.EdTextBin);
        hexadecimal=(EditText)findViewById(R.id.edTextHex);
        btndec=(Button)findViewById(R.id.BtnDec);
        btnbin=(Button)findViewById(R.id.BtnBin);
        btnhex=(Button)findViewById(R.id.BtnHex);
        binario.setEnabled(false);
        hexadecimal.setEnabled(false);

        try{

            texto=new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    if (!decimal.getText().toString().isEmpty()){
                        binario.setText(Integer.toBinaryString(Integer.parseInt(decimal.getText().toString())));
                        hexadecimal.setText(Integer.toHexString(Integer.parseInt(decimal.getText().toString())).toUpperCase());
                    }else{
                        binario.setText("");
                        hexadecimal.setText("");
                    }
                }

                @Override
                public void afterTextChanged(Editable s) {

                }
            };

            decimal.addTextChangedListener(texto);
        }catch (Exception e){
            Toast.makeText(this, "No se pueden introducir mas de 9 digitos", Toast.LENGTH_SHORT).show();
        }




    }

    public void decimal(View view){
        int colorR= Color.parseColor("#CD1111");
        int colorV=Color.parseColor("#31A118");
        btndec.setBackgroundColor(colorV);
        btnbin.setBackgroundColor(colorR);
        btnhex.setBackgroundColor(colorR);
        binario.setEnabled(false);
        hexadecimal.setEnabled(false);
        decimal.setEnabled(true);

    }

    public void binario(View view){
        int colorR= Color.parseColor("#CD1111");
        int colorV=Color.parseColor("#31A118");
        btndec.setBackgroundColor(colorR);
        btnbin.setBackgroundColor(colorV);
        btnhex.setBackgroundColor(colorR);
        decimal.setEnabled(false);
        hexadecimal.setEnabled(false);
        binario.setEnabled(true);

    }

    public void hexadecimal(View view){
        int colorR= Color.parseColor("#CD1111");
        int colorV=Color.parseColor("#31A118");
        btndec.setBackgroundColor(colorR);
        btnbin.setBackgroundColor(colorR);
        btnhex.setBackgroundColor(colorV);
        decimal.setEnabled(false);
        binario.setEnabled(false);
        hexadecimal.setEnabled(true);
    }


}