package org.carlosaltan.calculadora;

public abstract class Calculadora {
    public Double numero1;
    public Double numero2;
    public String signo;

    public Calculadora() {
    }

    public Calculadora(Double numero1, Double numero2, String signo) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.signo = signo;
    }

    public abstract Double calcular(Double numero1, Double numero2, String signo);
}
