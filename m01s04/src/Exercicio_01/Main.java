package Exercicio_01;

public class Main {
    public static void main(String[] args) {

        AreaVerde areav1 = new AreaVerde();

        areav1.nome = ("Parque do Costa e Silva");
        areav1.localizacao = ("Rua: Inambu - Número 375");
        areav1.tamanho = (80);

        System.out.println(areav1.details());
    }
}
