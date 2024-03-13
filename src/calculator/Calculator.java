package calculator;

public class Calculator implements AdvancedOperation {

    // Método para adição
    public double addition(double num1, double num2) {
        return num1 + num2;
    }

    // Método para subtração
    public double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    // Método multiplicação
    public double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    // Método divisão
    public double division(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero.");
        }
        return num1 / num2;
    }

    @Override
    public double calcularPotencia(double base, double expoente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularPotencia'");
    }

    @Override
    public double calcularRaizQuadrada(double num) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularRaizQuadrada'");
    }
}