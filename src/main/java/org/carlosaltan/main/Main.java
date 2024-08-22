package org.carlosaltan.main;

import org.carlosaltan.calculadora.Calculadora;
import org.carlosaltan.calculadora.CasioFX82;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new CasioFX82();
        Double numero1 = 22.00;
        Double numero2 = 2.00;
        String signo = "*";

        try {
            Double resultado = calculadora.calcular(numero1, numero2, signo);
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}