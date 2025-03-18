package Exercicio_05;

public class AreaVerde {
    //Atributos
    private String nome;
    private String localizacao;
    private double tamanho;

    public AreaVerde(String nome, String localizacao, double tamanho) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }


    double calcularTamanhoEmHectares(double tamanho) {
        return this.tamanho / 10000;
    }

    public void exibirInformacoes(){
        System.out.println("----------- INFORMAÇÕES SOBRE ÁREA VERDE ------------");
        System.out.println("Área Verde: "+nome);
        System.out.println("Localização: "+localizacao);
        System.out.println("Tamanho: "+tamanho + "m² ("+calcularTamanhoEmHectares(tamanho)+" hectares)");
    }
}
