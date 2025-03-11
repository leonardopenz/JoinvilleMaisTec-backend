package Exercicio_03;

import java.time.LocalDate;

public class MonitoramentoResiduos {
    //Atributos
    String tipoResiduo;
    double quantidade;
    LocalDate dataColeta;
    String statusColeta;
    String responsavelColeta;

    double calcularResiduosPorMes(double quantidade) {
        return quantidade * 30;
    }

    public String exibirInformacoes(){
        return String.format(" ------- Monitoramento de Residuos ----------"+
                "\nTipo de Residuo: %s"+
                "\nQuantidade: %.2f" + " No mês gerará: %.2f KG"+
                "\nData da Coleta: %s"+
                "\nStatus da Coleta: %s"+
                "\nResponsável da Coleta: %s", tipoResiduo, quantidade, calcularResiduosPorMes(quantidade),dataColeta, statusColeta, responsavelColeta);
    }
}
