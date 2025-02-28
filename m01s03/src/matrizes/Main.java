package matrizes;

public class Main {
    public static void main(String[] args) {
        //Declarar uma matriz
        int[][] valores = new int[2][3];

        //Declarar e Inicializar uma matriz
        String[][] matriz = {
                {"A", "B", "C"},
                {"D", "E", "F"},
                {"G", "H", "I"}
        };

        String[][] letras = matriz;

        System.out.println("Quantidade de Linhas: " + valores.length);
        System.out.println("Quantidade de Colunas:" + valores[0].length);

        /*
                (0,0), (0,1), (0,2)
                (1,0), (1,1), (1,2)
            ->  (2,0), (2,1), (2,2)
         */

        valores[1][1] = 10;

        System.out.println(valores[1][1]);

        //Iterar a nossa matriz
        //For Convencional
        for (int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[0].length; coluna++){
                System.out.print(letras[linha][coluna] + "\t");
            }
            System.out.println();
        }
        System.out.println("--------------------------------");
        //For each
        for(String[] linha : matriz){
            for(String elemento : linha){
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }

        System.out.println(matriz);
       // System.out.println(letras);
    }
}