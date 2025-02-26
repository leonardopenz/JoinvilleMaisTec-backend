package Exercicios;

public class Exercicio_01 {
    public static void main(String[] args) {
        int[] vetorNumeros = {2, 3, 7, 8, 10, 15, 17};
        int somaVetor = 0;

        for( int i = 0; i < vetorNumeros.length; i++){
            somaVetor += vetorNumeros[i];
        }
        System.out.println("A soma do vetor é: "+somaVetor);

    }
}
