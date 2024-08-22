package org.carlosaltan.operaciones;

import org.carlosaltan.interfaz.InterfazOperaciones;

public class Division implements InterfazOperaciones {
    @Override
    public Double operacion(Double numero1, Double numero2) {

        if(numero2 != 0){
            return numero1 / numero2;
        } else {
            throw new ArithmeticException("No se puede dividir por cero");
        }
    }
}
