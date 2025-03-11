package Exercicio_03;

public class AreaVerde {

    String nome;
    String localizacao;
    double tamanho;
    String statusConservacao;
    String responsavel;

    double calcularTamanhoEmHectares(double tamanho) {
        return this.tamanho / 10000;
    }

    public String exibirInformacoes(){
        return String.format("----- INFORMAÇÕES DA ÁREA VERDE -------" +
                "\nNOME: %s"+
                "\nLOCALIZAÇÃO: %s"+
                "\nTAMANHO: %.2f m²"+" (%.2f hectares)"+
                "\nSTATUS CONSERVAÇÃO: %s"+
                "\nRESPONSÁVEL: %s"+
                "\n---------------------------------------------------", nome, localizacao, tamanho, calcularTamanhoEmHectares(tamanho), statusConservacao, responsavel);
    }

}
