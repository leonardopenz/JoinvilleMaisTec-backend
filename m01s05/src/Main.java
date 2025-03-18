import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criar uma Organização
        Organizacao organizacao = new Organizacao("Verde Futuro");

        // Criar Projetos Sustentáveis e adicioná-los à organização
        ProjetoSustentavel projeto1 = new ProjetoSustentavel("Reflorestamento Urbano", "Plantio de árvores em áreas urbanas.");
        ProjetoSustentavel projeto2 = new ProjetoSustentavel("Energia Solar Comunitária", "Instalação de painéis solares em comunidades carentes.");

        organizacao.adicionarProjeto(projeto1);
        organizacao.adicionarProjeto(projeto2);

        // Criar Voluntários e associá-los a projetos
        Voluntario voluntario1 = new Voluntario("Ana Silva", "ana@email.com");
        Voluntario voluntario2 = new Voluntario("Carlos Souza", "carlos@email.com");

        voluntario1.participarProjeto(projeto1);
        voluntario2.participarProjeto(projeto2);

        // Criar um Relatório de Impacto para um projeto e exibir os resultados
        projeto1.gerarRelatorioImpacto(500, 1.2);
        projeto1.calcularImpacto();

    }
}
