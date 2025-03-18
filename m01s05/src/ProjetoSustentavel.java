import java.util.ArrayList;

public class ProjetoSustentavel implements ImpactoAmbiental{
    private String nome;
    private String descricao;
    private ArrayList<Voluntario> voluntarios;
    private RelatorioImpacto relatorioImpacto;

    public ProjetoSustentavel() {
    }

    public ProjetoSustentavel(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.voluntarios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Voluntario> getVoluntarios() {
        return voluntarios;
    }

    public void setVoluntarios(ArrayList<Voluntario> voluntarios) {
        this.voluntarios = voluntarios;
    }

    public RelatorioImpacto getRelatorioImpacto() {
        return relatorioImpacto;
    }

    public void setRelatorioImpacto(RelatorioImpacto relatorioImpacto) {
        this.relatorioImpacto = relatorioImpacto;
    }

    public void adicionarVoluntario(Voluntario voluntario){
        voluntarios.add(voluntario);
    }

    public void gerarRelatorioImpacto(int arvoresPlantadas, double reducaoCO2) {
        this.relatorioImpacto = new RelatorioImpacto(arvoresPlantadas, reducaoCO2);
    }

    public void exibirRelatorio() {
        if (relatorioImpacto != null) {
            relatorioImpacto.exibirRelatorio();
        } else {
            System.out.println("Nenhum relatório de impacto gerado para o projeto " + nome);
        }
    }

    @Override
    public void calcularImpacto() {
        if (relatorioImpacto != null) {
            System.out.println("Impacto calculado para o projeto " + nome + ":");
            relatorioImpacto.exibirRelatorio();
        } else {
            System.out.println("Impacto ainda não foi calculado para o projeto " + nome);
        }
    }
}
