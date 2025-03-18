public class RelatorioImpacto {
    private int arvoresPlantadas;
    private double reducaoCO2;

    public RelatorioImpacto(int arvoresPlantadas, double reducaoCO2) {
        this.arvoresPlantadas = arvoresPlantadas;
        this.reducaoCO2 = reducaoCO2;
    }

    public void exibirRelatorio() {
        System.out.println("Relatório de Impacto Ambiental:");
        System.out.println("Árvores plantadas: " + arvoresPlantadas);
        System.out.println("Redução de CO2: " + reducaoCO2 + " toneladas");
    }
}
