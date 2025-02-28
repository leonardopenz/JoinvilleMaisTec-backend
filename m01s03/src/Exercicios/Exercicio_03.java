package Exercicios;

import java.util.Random;

public class Exercicio_03 {
    public static void main(String[] args) {
        int[][] matriz3x3 = new int[3][3];
        Random numeroAleatorio = new Random();
        int maiorValor = 0;

        // Preenchendo a matriz com número aleatórios
        for(int i = 0; i < matriz3x3.length; i++){
            for(int j = 0; j < matriz3x3[0].length; j++){
                matriz3x3[i][j] = numeroAleatorio.nextInt(100);
                if(matriz3x3[i][j] > maiorValor){
                    maiorValor = matriz3x3[i][j];
                }
            }
            System.out.println();
        }
        // Imprimindo a matriz de forma organizada
        System.out.println("Matriz gerada:");
        for(int i = 0; i < matriz3x3.length; i++){
            for(int j = 0; j < matriz3x3[i].length; j++){
                System.out.print(matriz3x3[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("O maior valor da matriz é "+maiorValor);
    }
}
