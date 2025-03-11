package Exercico_04;

public class Main {
    public static void main(String[] args) {

        AreaVerde areav1 = new AreaVerde(
                "Parque do Costa e Silva",
                "Rua: Inambu - Número 375",
                80
        );

        MonitoramentoResiduos residuo1 = new MonitoramentoResiduos(
                "Reciclagem",
                10,
                "2025-3-11"
        );

        System.out.println("Informações das Áreas Verdes:");
        areav1.exibirInformacoes();
        System.out.println();
        System.out.println("Informações sobre o Monitoramento de Resíduos: ");
        residuo1.exibirInformacoes();
    }
}
