package org.carlosaltan.calculadora;

import org.carlosaltan.operaciones.Division;
import org.carlosaltan.operaciones.Multiplicacion;
import org.carlosaltan.operaciones.Resta;
import org.carlosaltan.operaciones.Suma;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


class CasioFX82Test {

    @InjectMocks
    private CasioFX82 casioFX82; // Objeto a ser testeado
    @Mock
    private Suma suma;
    @Mock
    private Resta resta;
    @Mock
    private Multiplicacion multiplicacion;
    @Mock
    private Division division;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void calcularSuma() {
        when(suma.operacion(10.00, 5.00)).thenReturn(15.00);
        Double resultado = casioFX82.calcular(10.00, 5.00, "+");
        assertEquals(15.00, resultado);
    }
    @Test
    void calcularResta() {
        when(resta.operacion(10.00, 5.00)).thenReturn(5.00);
        Double resultado = casioFX82.calcular(10.00, 5.00, "-");
        assertEquals(5.00, resultado);
    }
    @Test
    void calcularMultiplicacion() {
        when(multiplicacion.operacion(10.00, 5.00)).thenReturn(50.00);
        Double resultado = casioFX82.calcular(10.00, 5.00, "*");
        assertEquals(50.00, resultado);
    }

    @Test
    void calcularDivision() {
        when(division.operacion(10.00, 5.00)).thenReturn(2.00);
        Double resultado = casioFX82.calcular(10.00, 5.00, "/");
        assertEquals(2.00, resultado);
    }
}