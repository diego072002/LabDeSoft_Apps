package com.example.piedrapappelotijera;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.TextViewCompat;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button Pi;
    private Button P;
    private Button T;
    private ImageView Pi1;
    private ImageView P1;
    private ImageView T1;
    private ImageView Pi2;
    private ImageView P2;
    private ImageView T2;
    private TextView G_P;
    private TextView I;
    private TextView V1;
    private TextView D1;
    private TextView V2;
    private TextView D2;


    int cont=0;
    int contp1=0;
    int contv1=0;
    int contp2=0;
    int contv2=0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);
        Pi=(Button) findViewById(R.id.pi);
        P=(Button)findViewById(R.id.p);
        T=(Button) findViewById(R.id.t);
        Pi1=(ImageView) findViewById(R.id.pi1);
        P1=(ImageView) findViewById(R.id.p1);
        T1=(ImageView)findViewById(R.id.t1);
        Pi2=(ImageView) findViewById(R.id.pi2);
        P2=(ImageView) findViewById(R.id.p2);
        T2=(ImageView)  findViewById(R.id.t2);
        G_P=(TextView)  findViewById(R.id.g_p);
        I=(TextView)findViewById(R.id.intent1);
        V1=(TextView) findViewById(R.id.v1);
        V2=(TextView) findViewById(R.id.v2);
        D1=(TextView) findViewById(R.id.d1);
        D2=(TextView) findViewById(R.id.d2);

    }
    public void papel(View view){

       cont++;
        Pi1.setVisibility(View.INVISIBLE);
        P1.setVisibility(View.INVISIBLE);
        T1.setVisibility(View.INVISIBLE);
        Pi2.setVisibility(View.INVISIBLE);
        P2.setVisibility(View.INVISIBLE);
        T2.setVisibility(View.INVISIBLE);
        int maquina=(int) (Math.random()*3+1);
        P1.setVisibility(View.VISIBLE);
        if(maquina==1){
            Pi2.setVisibility(View.VISIBLE);
            G_P.setTextColor(Color.GREEN);
            G_P.setText("Ganaste");
            contv1++;
            contp2++;
        }else if(maquina==2){
            P2.setVisibility(View.VISIBLE);
            G_P.setTextColor(Color.BLACK);
            G_P.setText("Empate");
        } else if (maquina==3) {
            T2.setVisibility(View.VISIBLE);
            G_P.setTextColor(Color.RED);
            G_P.setText("Perdiste");
            contp1++;
            contv2++;
        }
        I.setText("Intentos: "+cont);
        V1.setText("Victorias: "+contv1);
        D2.setText("Derrotas: "+contp2);
        V2.setText("Victorias: "+contv2);
        D1.setText("Derrotas: "+contp1);
    }
    public void tijeras (View view){
        cont++;



        Pi1.setVisibility(View.INVISIBLE);
        P1.setVisibility(View.INVISIBLE);
        T1.setVisibility(View.INVISIBLE);
        Pi2.setVisibility(View.INVISIBLE);
        P2.setVisibility(View.INVISIBLE);
        T2.setVisibility(View.INVISIBLE);
        int maquina=(int) (Math.random()*3+1);

        T1.setVisibility(View.VISIBLE);
        if(maquina==1){
            Pi2.setVisibility(View.VISIBLE);
            G_P.setTextColor(Color.RED);
            G_P.setText("Perdiste");
            contv2++;
            contp1++;
        } else if (maquina==2) {
            P2.setVisibility(View.VISIBLE);
            G_P.setTextColor(Color.GREEN);
            G_P.setText("Ganaste");
            contv1++;
            contp2++;

        } else if (maquina==3) {
            T2.setVisibility(View.VISIBLE);
            G_P.setTextColor(Color.BLACK);
            G_P.setText("Empate");
        }
        I.setText("Intentos: "+cont);
        V1.setText("Victorias: "+contv1);
        D2.setText("Derrotas: "+contp2);
        V2.setText("Victorias: "+contv2);
        D1.setText("Derrotas: "+contp1);
    }
    public void piedra (View view){
       cont++;
        Pi1.setVisibility(View.INVISIBLE);
        P1.setVisibility(View.INVISIBLE);
        T1.setVisibility(View.INVISIBLE);
        Pi2.setVisibility(View.INVISIBLE);
        P2.setVisibility(View.INVISIBLE);
        T2.setVisibility(View.INVISIBLE);
        int maquina=(int) (Math.random()*3+1);

        Pi1.setVisibility(View.VISIBLE);
        if(maquina==1){
            Pi2.setVisibility(View.VISIBLE);
            G_P.setTextColor(Color.BLACK);
            G_P.setText("Empate");
        } else if (maquina==2) {
            P2.setVisibility(View.VISIBLE);
            G_P.setTextColor(Color.RED);
            G_P.setText("Perdiste");
            contp1++;
            contv2++;
        } else if (maquina==3) {
            T2.setVisibility(View.VISIBLE);
            G_P.setTextColor(Color.GREEN);
            G_P.setText("Ganaste");
            contv1++;
            contp2++;
    }
        I.setText("Intentos: "+cont);
        V1.setText("Victorias: "+contv1);
        D2.setText("Derrotas: "+contp2);
        V2.setText("Victorias: "+contv2);
        D1.setText("Derrotas: "+contp1);

    }
    public void reinicio (View view){
        Pi1.setVisibility(View.INVISIBLE);
        P1.setVisibility(View.INVISIBLE);
        T1.setVisibility(View.INVISIBLE);
        Pi2.setVisibility(View.INVISIBLE);
        P2.setVisibility(View.INVISIBLE);
        T2.setVisibility(View.INVISIBLE);
        cont=0;
        contv1=0;
        contv2=0;
        contp1=0;
        contp2=0;
        I.setText("Intentos:");
        V1.setText("Victorias");
        V2.setText("Victoras");
        D1.setText("Derrotas");
        D2.setText("Derrotas");
        G_P.setText("");

    }
}