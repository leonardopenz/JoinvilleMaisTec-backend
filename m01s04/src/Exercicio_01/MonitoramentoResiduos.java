package Exercicio_01;


import java.time.LocalDate;

public class MonitoramentoResiduos {

    //Atributos
    String tipoResiduo;
    double quantidade;
    LocalDate dataColeta;

    public String details(){
        return String.format(" ------- Monitoramento de Residuos ----------"+
                "\ntipoResiduo: %s"+
                "\nQuantidade: %.2f" +
                "\nData da coleta: %s", tipoResiduo, quantidade, dataColeta);
    }
}
