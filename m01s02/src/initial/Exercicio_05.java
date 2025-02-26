package initial;

import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        double A = scan.nextDouble();

        System.out.print("Informe a segunda nota: ");
        double B = scan.nextDouble();

        double peso1 = 3.5;
        double peso2 = 7.5;

        double media = ((A * peso1) + (B * peso2))/(peso1+peso2);
        System.out.printf("A média é: %.2f", media);
    }
}
