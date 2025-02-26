package initial;

import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o nome do funcionário: ");
        String nomeFuncionario = scan.nextLine();
        System.out.println("Informe o valor/hora deste funcionário: ");
        double valorHoraFun = scan.nextDouble();
        System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
        double horasTrabalhadas = scan.nextDouble();

        double salario = valorHoraFun * horasTrabalhadas;

        System.out.printf("O funcionário %s, trabalhou %.1f horas, e portanto possui R$ %.2f a receber!", nomeFuncionario, horasTrabalhadas, salario);
    }
}
