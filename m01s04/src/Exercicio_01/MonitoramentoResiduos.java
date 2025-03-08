package Exercicio_01;


import java.time.LocalDate;

public class MonitoramentoResiduos {

    //Atributos
    String tipoResiduo;
    double quantidade;
    LocalDate dataColeta;

    public MonitoramentoResiduos(String tipoResiduo, double quantidade, LocalDate dataColeta) {
        this.tipoResiduo = tipoResiduo;
        this.quantidade = quantidade;
        this.dataColeta = dataColeta;
    }
}
