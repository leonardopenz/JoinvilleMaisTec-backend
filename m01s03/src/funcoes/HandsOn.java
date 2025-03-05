package funcoes;

import java.time.LocalDate;
import java.util.Scanner;

public class HandsOn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o ano em que você nasceu: ");
        int anoNasc = scan.nextInt();

        int idade = calculaIdade(anoNasc);

        System.out.printf("A sua idade é: %d anos", idade);
    }

    public static int calculaIdade(int anoNasc){
        int dataAtual = LocalDate.now().getYear();
        return dataAtual - anoNasc;

    }
}
