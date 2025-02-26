package initial;

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int A = scan.nextInt();
        System.out.print("Informe o segundo número: ");
        int B = scan.nextInt();

        int SOMA = A + B;

        System.out.println("SOMA = "+SOMA);
    }
}
