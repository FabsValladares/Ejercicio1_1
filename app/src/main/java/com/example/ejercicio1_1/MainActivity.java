package com.example.ejercicio1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.ejercicio1_1.Calculos.Calcular;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    ImageButton sumar,restar,multiplicar, Dividir;
    Double resultado, nu1, nu2;
    String Operacion,one,two;

    Calcular calculo= null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText) findViewById(R.id.num);
        num2 = (EditText) findViewById(R.id.num2);


       sumar = (ImageButton) findViewById(R.id.SUMAR);
        restar = (ImageButton) findViewById(R.id.RESTAR);
        multiplicar =  (ImageButton) findViewById(R.id.MULTIPLICAR);
        Dividir =  (ImageButton) findViewById(R.id.DIVISION);




        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                one = num1.getText().toString();
                double nu1 = Double.parseDouble(one);
                two = num1.getText().toString();
                double nu2 = Double.parseDouble(one);
                resultado = operacionsuma(nu1, nu2);
                Operacion = "Suma";
                calculo.setNumero1(nu1);
                calculo.setNumero2(nu2);
                calculo.setResultado(resultado);
                calculo.setOperacion(Operacion);
                Intent intent = new Intent(getApplicationContext(), ActivityResultados.class);
                startActivity(intent);

                finish();
            }
        });


        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado = operacionresta(nu1, nu2);
                Operacion = "Resta";
                calculo.setNumero1(nu1);
                calculo.setNumero2(nu2);
                calculo.setResultado(resultado);
                calculo.setOperacion(Operacion);
                Intent intent = new Intent(getApplicationContext(), ActivityResultados.class);
                startActivity(intent);
            }
        });

        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado = operacionmulti(nu1, nu2);
                Operacion = "Multiplicacion";
                calculo.setNumero1(nu1);
                calculo.setNumero2(nu2);
                calculo.setResultado(resultado);
                calculo.setOperacion(Operacion);
                Intent intent = new Intent(getApplicationContext(), ActivityResultados.class);

                finish();
            }
        });

        Dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado = operaciondivision(nu1, nu2);
                Operacion = "dividir";
                calculo.setNumero1(nu1);
                calculo.setNumero2(nu2);
                calculo.setResultado(resultado);
                calculo.setOperacion(Operacion);
                Intent intent = new Intent(getApplicationContext(), ActivityResultados.class);
                startActivity(intent);

            }
        });

        Dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado = operaciondivision(nu1, nu2);
                Operacion = "Suma";
                calculo.setNumero1(nu1);
                calculo.setNumero2(nu2);
                calculo.setResultado(resultado);
                calculo.setOperacion(Operacion);
                Intent intent = new Intent(getApplicationContext(), ActivityResultados.class);
                startActivity(intent);

            }
        });
    }


    private double operacionsuma(double n1, double n2){
        double r;
        r=n1+n2;
        return r;
    }
    private double operacionresta(double n1, double n2){
        double r;
        r=n1-n2;
        return r;
    }

    private double operaciondivision(double n1, double n2){
        double r;
        r=n1/n2;
        return r;
    }

    private double operacionmulti(double n1, double n2){
        double r;
        r=n1*n2;
        return r;
    }

}