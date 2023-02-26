package com.example.ejercicio1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.IDNA;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.ejercicio1_1.Calculos.Calcular;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    ImageButton sumar,restar,multiplicar, Dividir;
    Double resulta, nu1, nu2;
    String Opera,one,two;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText) findViewById(R.id.operacion);
        num2 = (EditText) findViewById(R.id.num2);


        sumar = (ImageButton) findViewById(R.id.SUMA);
        restar = (ImageButton) findViewById(R.id.RESTA);
        multiplicar = (ImageButton) findViewById(R.id.MULTI);
        Dividir = (ImageButton) findViewById(R.id.DIVISION);


        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                one = num1.getText().toString();
                nu1 = Double.parseDouble(one);
                two = num1.getText().toString();
                nu2 = Double.parseDouble(one);
                resulta = operacionsuma(nu1, nu2);
                Opera = "Suma";
                Calcular calculo= new Calcular(nu1,nu2,resulta,Opera);
                Intent intent = new Intent(getApplicationContext(), ActivityResultados.class);
                intent.putExtra("calculo", calculo);
                startActivity(intent);


            }
        });


        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                one = num1.getText().toString();
                nu1 = Double.parseDouble(one);
                two = num1.getText().toString();
                nu2 = Double.parseDouble(one);
                resulta = operacionresta(nu1, nu2);
                Opera = "Resta";
                Calcular calculo= new Calcular(nu1,nu2,resulta,Opera);
                Intent intent = new Intent(getApplicationContext(), ActivityResultados.class);
                intent.putExtra("calculo", calculo);
                startActivity(intent);
            }
        });

        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                one = num1.getText().toString();
                nu1 = Double.parseDouble(one);
                two = num1.getText().toString();
                nu2 = Double.parseDouble(one);
                resulta = operacionmulti(nu1, nu2);
                Opera = "Multiplicacion";
                Calcular calculo= new Calcular(nu1,nu2,resulta,Opera);
                Intent intent = new Intent(getApplicationContext(), ActivityResultados.class);
                intent.putExtra("calculo", calculo);
                startActivity(intent);

            }
        });

        Dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                one = num1.getText().toString();
                nu1 = Double.parseDouble(one);
                two = num1.getText().toString();
                nu2 = Double.parseDouble(one);
                resulta = operaciondivision(nu1, nu2);
                Opera = "dividir";
                Log.d("Info",resulta+""+Opera);
                Intent intent = new Intent(MainActivity.this, ActivityResultados.class);
                Calcular calculo= new Calcular(nu1,nu2,resulta,Opera);
                intent.putExtra("calculo", calculo);
                startActivity(intent);

            }
        });
    }






    public double operacionsuma(double n1, double n2){
        double r;
        r=n1+n2;
        return r;
    }

   public double operacionresta(double n1, double n2){
        double r;
        r=n1-n2;
        return r;
    }

    public double operaciondivision(double n1, double n2){
        double r;
        r=n1/n2;
        return r;
    }

    public double operacionmulti(double n1, double n2){
        double r;
        r=n1*n2;
        return r;
    }

}