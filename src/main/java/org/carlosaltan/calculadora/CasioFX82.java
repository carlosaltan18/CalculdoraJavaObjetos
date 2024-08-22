package org.carlosaltan.calculadora;

import org.carlosaltan.operaciones.Division;
import org.carlosaltan.operaciones.Multiplicacion;
import org.carlosaltan.operaciones.Resta;
import org.carlosaltan.operaciones.Suma;
import org.carlosaltan.interfaz.InterfazOperaciones;

public class CasioFX82 extends Calculadora {


    public CasioFX82(Double numero1, Double numero2, String signo) {
        super(numero1, numero2, signo);
    }
    public  CasioFX82() {}
    @Override
    public Double calcular(Double numero1, Double numero2, String signo) {
        InterfazOperaciones operacion = signo.equals("+") ? new Suma() :
                                            signo.equals("-") ? new Resta() :
                                                    signo.equals("*") ? new Multiplicacion():
                                                            signo.equals("/") ? new Division(): null;
        if(operacion != null) {
            return operacion.operacion(numero1, numero2);
        }else{
            throw new IllegalArgumentException("Todos los parámetros requeridos");
        }
    }
}

