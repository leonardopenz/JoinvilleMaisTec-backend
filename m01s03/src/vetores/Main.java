package vetores;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Criando ou Instanciando vetores
        int[] valores = new int[3]; // Os [] indicam que será uma array - se não usar, gera um erro de tipo incompatível

        double[] notas = {4.5, 5.6, 9.5};// inicializando vetores

        boolean[] valores_logicos = {true, false, false};

        /*System.out.print("Informe a primeira nota: ");
        notas[0] = scan.nextDouble();

        System.out.print("Informe a segunda nota: ");
        notas[1] = scan.nextDouble();

        System.out.print("Informe a terceira nota: ");
        notas[2] = scan.nextDouble();

        System.out.println("O tamanho do Array notas é "+notas.length);
        System.out.println(notas);*/

        System.out.println("-----------------------------------------------------------");
        System.out.println("=== CADASTRO DE NOTAS ===");
        for( int i = 0; i < notas.length; i++){
            System.out.printf("%d Nota: ", (i+1));
            notas[i] = scan.nextDouble();
        }
        //FOR convencional
        System.out.println("=== VISUALIZAÇÃO DE NOTAS ===");
        for( int i = 0; i < notas.length; i++){
            System.out.printf("%d Nota: %.1f\n", (i+1), notas[i]);
        }
        // FOR each
        for(double nota: notas){
            System.out.println("--> "+ nota);
        }
    }
}
