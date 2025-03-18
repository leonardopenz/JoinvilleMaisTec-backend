public class Voluntario {
    private String nome;
    private String email;

    public Voluntario() {
    }

    public Voluntario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void participarProjeto(ProjetoSustentavel projetoSustentavel){
        projetoSustentavel.adicionarVoluntario(this);
    }
}
