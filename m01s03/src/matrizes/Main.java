package matrizes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Declarar uma matriz
        int[][] valores = new int[2][3];
        System.out.println("Quantidade de Linhas: "+valores.length);
        System.out.println("Qualidade de Colunas: "+valores[0].length);
        /*
            (0,0), (0,1), (0,2)
            (1,0), (1,1), (1,2)

         */
        valores[1][1] = 10;
        System.out.println(valores[1][1]);
    }
}
