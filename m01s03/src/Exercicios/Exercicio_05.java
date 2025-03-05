package Exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> carros = new ArrayList<>();
        carros.add("Golf");
        carros.add("Fusca");
        carros.add("Passat");
        carros.add("Gol");
        carros.add("Brasília");

        System.out.printf("Informe uma letra inicial para pesquisar na lista de carros: ");
        char letraInicial = scan.next().charAt(0);

        ArrayList<String> filtro = filtrarLetraInicial(carros, letraInicial);

        System.out.println("Os carros que começam com "+ letraInicial + " é/são esse(s): "+ filtro);
    }

    public static ArrayList<String> filtrarLetraInicial(ArrayList<String> carros, char letra){
        ArrayList<String> filtragem = new ArrayList<>();
        for(String carro : carros){
            if (carro.length() > 0 && carro.charAt(0) == letra) {
                filtragem.add(carro);
            }
        }
        return filtragem;
    }

}
