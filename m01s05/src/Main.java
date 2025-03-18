import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criar uma ONG
        ONG ong = new ONG("Verde Futuro");

        // Criar Projetos Sustentáveis e adicioná-los à ONG
        ProjetoReflorestamento projeto1 = new ProjetoReflorestamento("Reflorestamento Urbano", "Plantio de árvores em áreas urbanas.", 500);
        ProjetoEnergiaRenovavel projeto2 = new ProjetoEnergiaRenovavel("Energia Solar Comunitária", "Instalação de painéis solares em comunidades carentes.", 1200.5);

        ong.adicionarProjeto(projeto1);
        ong.adicionarProjeto(projeto2);

        // Criar Voluntários e associá-los a projetos
        Voluntario voluntario1 = new Voluntario("Ana Silva", "ana@email.com");
        Voluntario voluntario2 = new Voluntario("Carlos Souza", "carlos@email.com");

        voluntario1.participarProjeto(projeto1);
        voluntario2.participarProjeto(projeto2);

        // Criar um Relatório de Impacto para um projeto e exibir os resultados
        projeto1.gerarRelatorioImpacto(500, 1.2);
        projeto1.calcularImpacto();

        projeto2.gerarRelatorioImpacto(500, 1.2);
        projeto2.calcularImpacto();
    }
}
