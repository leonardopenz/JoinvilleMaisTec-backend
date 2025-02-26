package initial;

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double PI = 3.14159;
        System.out.println("Informe o valor do raio: ");
        double raio = scan.nextDouble();
        double area = 0;

        area = Math.PI * Math.pow(raio, 2);

        System.out.printf("A área do circulo é: %.1f", area);
    }
}
