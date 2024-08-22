package org.carlosaltan.operaciones;

import org.carlosaltan.interfaz.InterfazOperaciones;

public class Suma implements InterfazOperaciones {

    @Override
    public Double operacion(Double numero1, Double numero2) {
        return numero1 + numero2;
    }
}
