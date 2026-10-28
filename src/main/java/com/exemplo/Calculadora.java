package com.exemplo;

public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }
    public double dividir(double a, double b) {
        if (b == 0) throw new IllegalArgumentException("Divisão por zero não permitida");
        return a / b;
    }
}