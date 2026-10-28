package com.exemplo;
/* Grupo: Bruno Rovani Marcelino, Bruno Schimiguel, Felipe dos Santos, Erick Andreas Ponticelli,
Luan Ferreira do Amaral e Gabriel Tissi
* */
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;
class CalculadoraTest {
    Calculadora calc;
    @BeforeEach
    void init() { calc = new Calculadora(); }
    @ParameterizedTest
    @CsvSource({"2,3,5", "0,0,0", "-1,1,0"})
    void testSomar(int a, int b, int esperado) {
        assertEquals(esperado, calc.somar(a,b));
    }
    @Test
    void testDividirValido() {
        assertEquals(5.0, calc.dividir(10, 2));
    }
    @Test
    void testDividirPorZero() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> calc.dividir(10, 0));
        assertTrue(ex.getMessage().contains("Divisão por zero"));
    }
}