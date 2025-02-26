package vetores;

import java.util.Scanner;

public class HandsOn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] alunos;
        double[] medias;
        double mediaTurma = 0, maiorMedia = 0, menorMedia =0;

        System.out.printf("Quantos alunos tem na turma? ");
        int qtdAlunos = scan.nextInt();
        scan.nextLine();

        alunos = new String[qtdAlunos];
        medias = new double[qtdAlunos];

        for (int i = 0; i < qtdAlunos; i++){
            System.out.printf("%d Aluno: ", i+1);
            alunos[i] = scan.nextLine();
            System.out.print("Média do aluno: ");
            medias[i] = scan.nextDouble();
            scan.nextLine();
            mediaTurma += medias[i];
        }
        for(int i = 0; i < qtdAlunos; i++){
            if( i == 0){
                maiorMedia = medias[i];
                menorMedia = medias[i];
            }

            if(maiorMedia < medias[i]){
                maiorMedia = medias[i];
            }

            if(menorMedia > medias[i]){
                menorMedia = medias[i];
            }
        }
        System.out.printf("Média da turma: %.1f", mediaTurma/qtdAlunos);
        System.out.printf("\nA menor média da turma é: %.1f", menorMedia);
        System.out.printf("\nA maior média da turma é: %.1f", maiorMedia);
    }
}
