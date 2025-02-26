package initial;

import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num1 = scan.nextInt();
        System.out.print("Informe outro número: ");
        int num2 = scan.nextInt();

        int produto = num1 * num2;

        System.out.println("Produto = "+ produto);
    }
}
