package example;

import calculator.AdvancedOperation;
import calculator.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Testando operações básicas
        System.out.println("Soma: " + calculator.addition(5, 3));
        System.out.println("Subtração: " + calculator.subtraction(10, 4));
        System.out.println("Multiplicação: " + calculator.multiplication(6, 7));
        System.out.println("Divisão: " + calculator.division(20, 5));

        // Testando operaçãoes avançadas
        AdvancedOperation advancedOperation = calculator;
        System.out.println("Potência: " + advancedOperation.calcularPotencia(2, 3));
        System.out.println("Raiz Quadrada: " + advancedOperation.calcularRaizQuadrada(16));
    }
}