import java.util.ArrayList;

public class Organizacao {
    private String nome;
    private ArrayList<ProjetoSustentavel> projetos;

    public Organizacao() {
    }

    public Organizacao(String nome) {
        this.nome = nome;
        this.projetos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<ProjetoSustentavel> getProjetos() {
        return projetos;
    }

    public void setProjetos(ArrayList<ProjetoSustentavel> projetos) {
        this.projetos = projetos;
    }

    public void adicionarProjeto(ProjetoSustentavel projeto){
        projetos.add(projeto);
    }

    public void  listarProjetos(){
        System.out.println("Projetos da organização " + nome + ":");
        for (ProjetoSustentavel projeto : projetos) {
            System.out.println("- " + projeto.getNome());
        }
    }
}
