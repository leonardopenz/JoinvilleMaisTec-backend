package initial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Initial

        //Declaração de variáveis e constantes

        byte number1 = 1;
        short number2 = 2;
        int number3 = 3;
        long number4 = 444444444;

        double decimal1 = 3.14;
        float decimal2 = 1.5f;

        char sexo = 'M';
        boolean isActive = false;

        final double PI = 3.14;

        //Operadores

        int idade = 15;
        boolean habilitado = false;

        System.out.println(idade >= 18); //false
        System.out.println(idade < 18); //true
        System.out.println(habilitado == true); //false
        System.out.println(idade >=18 && habilitado == true); //false

        Scanner scan = new Scanner(System.in);
        /*
        scan.next(); // captura até o primeiro espaço
        scan.nextLine(); // captura até o primeiro enter

         */
        String nomeCompleto = scan.nextLine();
        System.out.println("Nome completo: "+nomeCompleto);
    }
}
