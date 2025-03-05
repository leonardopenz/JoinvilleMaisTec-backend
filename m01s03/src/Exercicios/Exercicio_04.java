package Exercicios;

public class Exercicio_04 {
    public static double calculaMedia(double[] numeros) {
        double soma = 0;
        for (double num : numeros) {
            soma += num;
        }
        return soma / numeros.length;
    }

    public static void main(String[] args) {
        double[] numReais = {10.5, 20.0, 30.5, 40.0};
        System.out.println("A média é: " + calculaMedia(numReais));
    }
}