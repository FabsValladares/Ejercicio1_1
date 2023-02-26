package com.example.ejercicio1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.ejercicio1_1.Calculos.Calcular;

public class ActivityResultados extends AppCompatActivity {

    EditText num, num2, resultado,Operacion;
    Button atras;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);
        Calcular calculo = getIntent().getParcelableExtra("calculo");

        String op = calculo.getOperacion();
        Double nu1 = calculo.getNumero1();
        Double nu2 = calculo.getNumero2();
        Double r = calculo.getResultado();

        num = (EditText) findViewById(R.id.num);
        num2 = (EditText) findViewById(R.id.num2);
        resultado = (EditText) findViewById(R.id.resultado);
        Operacion = (EditText) findViewById(R.id.operacion);

        num.setText(nu1+"");
        num2.setText(nu2+"");
        resultado.setText(r+"");
        Operacion.setText(op);
    }
    }