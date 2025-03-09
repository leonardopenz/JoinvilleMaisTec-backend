package Exercicio_02;

import java.time.LocalDate;

public class MonitoramentoResiduos {
    //Atributos
    String tipoResiduo;
    double quantidade;
    LocalDate dataColeta;
    String statusColeta;
    String responsavelColeta;

    public String details(){
        return String.format(" ------- Monitoramento de Residuos ----------"+
                "\nTipo de Residuo: %s"+
                "\nQuantidade: %.2f" +
                "\nData da Coleta: %s"+
                "\nStatus da Coleta: %s"+
                "\nResponsável da Coleta: %s", tipoResiduo, quantidade, dataColeta, statusColeta, responsavelColeta);
    }

}
