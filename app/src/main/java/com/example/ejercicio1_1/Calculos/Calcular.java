package com.example.ejercicio1_1.Calculos;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Calcular implements Parcelable {

    private Double numero1;
    private Double  numero2;
    private Double  resultado;
    private String Operacion;


    public Calcular (Double numero1, Double numero2, Double resultado, String Operacion ){
        this.numero1=numero1;
        this.numero2=numero2;
        this.resultado=resultado;
        this.Operacion=Operacion;
    }

    protected Calcular(Parcel in) {
        numero1 = in.readDouble();
        numero2 = in.readDouble();
        resultado = in.readDouble();
        Operacion = in.readString();
    }

    public static final Creator<Calcular> CREATOR = new Creator<Calcular>() {
        @Override
        public Calcular createFromParcel(Parcel in) {
            return new Calcular(in);
        }

        @Override
        public Calcular[] newArray(int size) {
            return new Calcular[size];
        }
    };

    public Double getNumero1() {
        return numero1;
    }

    public void setNumero1(Double numero1) {
        this.numero1 = numero1;
    }

    public Double getNumero2() {
        return numero2;
    }

    public void setNumero2(Double numero2) {
        this.numero2 = numero2;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

    public String getOperacion() {
        return Operacion;
    }

    public void setOperacion(String operacion) {
        Operacion = operacion;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeDouble(numero1);
        dest.writeDouble(numero2);
        dest.writeDouble(resultado);
        dest.writeString(Operacion);
    }
}
