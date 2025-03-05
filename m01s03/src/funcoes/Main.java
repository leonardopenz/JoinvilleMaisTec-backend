package funcoes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int valor = scan.nextInt();
        //numeroPar(valor);

        System.out.println(numeroPar(valor) ? "O número é PAR!" : "O número é IMPAR!");

        String[] nomes = {"Alexandre", "Carlos", "Julia"};

        String[][] produtos = {
                {"Bicicleta", "Pino"},
                {"Flauta", "Computador"}
        };

        ArrayList<String> emails = new ArrayList<>();
        emails.add("teste@gmail.com");
        emails.add("leonardopenz@gmail.com");

        visualizarVetor(nomes);

        exibirMatriz(produtos);

        exibirArrayList(emails);
    }

    public static boolean numeroPar(int numero){
        return numero % 2 == 0;

    }

    public static void visualizarVetor(String[] vars){

        for(String var : vars){
            System.out.println(var);
        }
    }

    public static void exibirMatriz(String[][] vars){
        for(String[] var : vars){
            for(String value : var){
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    public static void exibirArrayList(ArrayList<String> vars){
        for(String var : vars){
            System.out.println(var + "\t");
        }
    }
}
