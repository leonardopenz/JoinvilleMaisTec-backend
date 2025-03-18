import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Organizacao organizacao = null;
        ArrayList<ProjetoSustentavel> projetos = new ArrayList<>();
        ArrayList<Voluntario> voluntarios = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar Organização");
            System.out.println("2. Cadastrar Projeto Sustentável");
            System.out.println("3. Cadastrar Voluntário");
            System.out.println("4. Listar Projetos por Tipo");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("A organização é uma (1) ONG ou (2) Empresa? ");
                    int tipoOrganizacao = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Digite o nome da organização: ");
                    String nomeOrg = scan.nextLine();
                    if (tipoOrganizacao == 1) {
                        organizacao = new ONG(nomeOrg);
                    } else if (tipoOrganizacao == 2) {
                        System.out.print("Digite o CNPJ da empresa: ");
                        String cnpj = scan.nextLine();
                        organizacao = new Empresa(nomeOrg, cnpj);
                    }
                    System.out.println("Organização " + nomeOrg + " cadastrada com sucesso!");
                    break;

                case 2:
                    if (organizacao == null) {
                        System.out.println("Nenhuma organização cadastrada. Cadastre uma organização primeiro.");
                        break;
                    }
                    System.out.println("Escolha o tipo de projeto:");
                    System.out.println("1. Reflorestamento");
                    System.out.println("2. Reciclagem");
                    System.out.println("3. Energia Renovável");
                    int tipoProjeto = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Digite o nome do projeto: ");
                    String nomeProjeto = scan.nextLine();
                    System.out.print("Digite a descrição do projeto: ");
                    String descricao = scan.nextLine();

                    ProjetoSustentavel projeto = null;
                    if (tipoProjeto == 1) {
                        System.out.print("Quantas árvores serão plantadas? ");
                        int arvores = scan.nextInt();
                        projeto = new ProjetoReflorestamento(nomeProjeto, descricao, arvores);
                    } else if (tipoProjeto == 2) {
                        System.out.print("Quantas toneladas serão recicladas? ");
                        double toneladas = scan.nextDouble();
                        projeto = new ProjetoReciclagem(nomeProjeto, descricao, toneladas);
                    } else if (tipoProjeto == 3) {
                        System.out.print("Quantos kWh de energia serão gerados? ");
                        double energia = scan.nextDouble();
                        projeto = new ProjetoEnergiaRenovavel(nomeProjeto, descricao, energia);
                    }
                    if (projeto != null) {
                        organizacao.adicionarProjeto(projeto);
                        projetos.add(projeto);
                        System.out.println("Projeto cadastrado com sucesso!");
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do voluntário: ");
                    String nomeVoluntario = scan.nextLine();
                    System.out.print("Digite o email do voluntário: ");
                    String emailVoluntario = scan.nextLine();
                    voluntarios.add(new Voluntario(nomeVoluntario, emailVoluntario));
                    System.out.println("Voluntário cadastrado com sucesso!");
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scan.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        }
    }
}
