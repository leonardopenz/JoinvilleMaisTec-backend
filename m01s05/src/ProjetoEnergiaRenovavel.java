public class ProjetoEnergiaRenovavel extends ProjetoSustentavel{
    private double energiaGerada;

    public ProjetoEnergiaRenovavel(){

    }

    public ProjetoEnergiaRenovavel(String nome, String descricao, double energiaGerada){
        super(nome, descricao);
        this.energiaGerada = energiaGerada;
    }

    @Override
    public void calcularImpacto() {
        System.out.println("Impacto: " + energiaGerada + " kWh de energia renovável gerada.");
    }
}
