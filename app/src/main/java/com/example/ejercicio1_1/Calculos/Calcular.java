package com.example.ejercicio1_1.Calculos;

public class Calcular {
    public Calcular (Double numero1, Double numero2, Double resultado, String Operacion ){
        this.numero1=numero1;
        this.numero2=numero2;
        this.resultado=resultado;
        this.Operacion=Operacion;
    }

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

    private Double numero1;
    private Double  numero2;
    private Double  resultado;
    private String Operacion;
}
