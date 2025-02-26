package initial;

import java.util.Scanner;

public class Exercicio03_aula {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o seu salário atual: ");
        double salarioAtual = scan.nextDouble();

        System.out.println("Informe o tempo total de serviço: ");
        double tempoServico = scan.nextDouble();

        if(tempoServico > 5){
            double bonus = salarioAtual * 0.10;
            double salarioAumento = salarioAtual + bonus;
            System.out.printf("O seu salário atual é R$ %.2f\n Seu bonus será de R$ %.2f\n E o novo salário será de R$ %.2f", salarioAtual, bonus, salarioAumento);
        }else {
            double bonus = salarioAtual * 0.05;
            double salarioAumento = salarioAtual+bonus;
            System.out.printf("O seu salário atual é R$ %.2f %nSeu bonus será de R$ %.2f %nE o novo salário será de R$ %.2f %n", salarioAtual, bonus, salarioAumento);
        }
    }
}
