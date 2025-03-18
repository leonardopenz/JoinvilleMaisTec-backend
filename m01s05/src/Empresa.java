public class Empresa extends Organizacao{
    private String cnpj;

    public Empresa(){

    }

    public Empresa(String nome, String cnpj){
        super(nome);
        this.cnpj = cnpj;
    }
}