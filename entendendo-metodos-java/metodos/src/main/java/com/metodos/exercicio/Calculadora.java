package com.metodos.exercicio;

public class Calculadora {
    public int a, b;

    public Calculadora() {
        this.a = 0;
        this.b = 0;
    }

    public int soma(int a, int b) {
        return a + b;
    }

    public int subtracao(int a, int b) {
        return a - b;
    }

    public int multiplicacao(int a, int b) {
        return a * b;
    }

    public int divisao(int a, int b) {
        return a / b;
    }
}
