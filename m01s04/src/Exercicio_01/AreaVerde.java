package Exercicio_01;

public class AreaVerde {

    //Atributos
    String nome;
    String localizacao;
    double tamanho;

    public String details(){
        return String.format("----- INFORMAÇÕES DA ÁREA VERDE -------" +
                "\nNOME: %s"+
                "\nLOCALIZAÇÃO: %s"+
                "\nTAMANHO: %.2f m²", nome, localizacao, tamanho);
    }
}
