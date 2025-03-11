package Exercicio_03;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        AreaVerde areav1 = new AreaVerde();

        areav1.nome = ("Parque do Costa e Silva");
        areav1.localizacao = ("Rua: Inambu - Número 375");
        areav1.tamanho = (80);
        areav1.statusConservacao = "Bom";
        areav1.responsavel = "João da Silva";

        MonitoramentoResiduos residuo1 = new MonitoramentoResiduos();
        residuo1.tipoResiduo = "Reciclagem";
        residuo1.quantidade = 10;
        residuo1.dataColeta = LocalDate.of(2025, 3, 7);
        residuo1.statusColeta = "Pendente";
        residuo1.responsavelColeta = "Carlos Souza";

        System.out.println(areav1.exibirInformacoes());
        System.out.println(residuo1.exibirInformacoes());
    }
}
