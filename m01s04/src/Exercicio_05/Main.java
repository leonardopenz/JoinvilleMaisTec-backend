package Exercicio_05;

public class Main {
    public static void main(String[] args) {
        AreaVerde areav1 = new AreaVerde(
                "Parque do Costa e Silva",
                "Rua: Inambu - Número 375",
                80
        );
        areav1.setTamanho(235);

        AreaVerde areav2 = new AreaVerde(
                "Praça do Centro",
                "Rua: Prefeito Luiz Carlos Garcia - Número 242",
                47
        );

        MonitoramentoResiduos residuo1 = new MonitoramentoResiduos(
                "Reciclagem",
                10,
                "2025-3-11"
        );

        residuo1.setQuantidade(22.5);
        residuo1.setDataColeta("2025-3-15");

        System.out.println("Informações das Áreas Verdes:");
        System.out.println(areav1.getNome());
        System.out.println(areav2.getNome());
        System.out.println("Informações sobre o Monitoramento de Resíduos: ");
        residuo1.exibirInformacoes();

    }
}
