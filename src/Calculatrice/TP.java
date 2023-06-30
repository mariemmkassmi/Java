package Calculatrice;

public class TP {
    public int addition(int a, int b) {
        return a + b;
    }

    public int soustraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public double division(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("C'est l'infini !");
            return Double.POSITIVE_INFINITY;
        }
    }
}
