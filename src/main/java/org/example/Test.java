package org.example;

import org.apache.commons.math3.analysis.function.Sqrt;

public class Test {
    public static void main(String[] args) {
        double x = 25.0;
        double squareRoot = MathOperations.calculateSquareRoot(x);
        System.out.println("A raiz quadrada de " + x + " é: " + squareRoot);
    }
}

class MathOperations {
    public static double calculateSquareRoot(double x) {
        return new Sqrt().value(x);
    }
}
// ideia futura, fazer uma mini calculadora com as informações basicas so que graficamente representadas