package Exercicio_06;

import java.util.ArrayList;

public class MonitoramentoResiduos {
    private String tipoResiduo;
    private double quantidade; // em quilogramas
    private String dataColeta;

    public static ArrayList<MonitoramentoResiduos> monitResiduos = new ArrayList<>();

    public MonitoramentoResiduos(String tipoResiduo, double quantidade, String dataColeta) {
        this.tipoResiduo = tipoResiduo;
        this.quantidade = quantidade;
        this.dataColeta = dataColeta;
        monitResiduos.add(this);
    }

    public String getTipoResiduo() {
        return tipoResiduo;
    }

    public void setTipoResiduo() {
        this.tipoResiduo = tipoResiduo;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade() {
        this.quantidade = quantidade;
    }

    public String getDataColeta() {
        return dataColeta;
    }

    public void setDataColeta() {
        this.dataColeta = dataColeta;
    }

    double calcularResiduosPorMes(double quantidade) {
        return quantidade * 30; // Multiplica a quantidade diária por 30 dias
    }

    public void exibirInformacoes(){
        System.out.println("----------- Monitoramento de Resíduos -----------");
        System.out.println("Tipo de Residuo: "+tipoResiduo);
        System.out.println("Quantidade: "+quantidade);
        System.out.println("Quantidade para 30 dias: "+calcularResiduosPorMes(quantidade));
        System.out.println("Data da coleta: "+dataColeta);
    }
}
