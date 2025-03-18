package Exercicio_06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("------- Sustentabilidade de Joinville ---------");
            System.out.println("Informe a ação desejada: ");
            System.out.println("1 - Cadastrar área verde na cidade");
            System.out.println("2 - Listar áreas verde na cidade");
            System.out.println("3 - Solicitar coleta de resíduos em algum local");
            System.out.println("4 - Listar as coletas solicitadas");
            System.out.println("9 - Encerrar o programa!");
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    cadastroAreaVerde(scan);
                    break;
                case 2:
                    exibirAreasVerdes();
                    break;
                case 3:
                    cadastroColetaResiduo(scan);
                    break;
                case 4:
                    exibirColetasSolicitas();
                    break;
                case 9:
                    System.out.println("Encerrando o programa, até breve!");
                    break;
                default:
                    System.out.println("Opção inválida, tente outra opção!");
            }
        }while ( opcao != 9);
        scan.close();
        }
        public static void cadastroAreaVerde(Scanner scan){
            System.out.println("CADASTRO DE ÁREA VERDE");
            System.out.print("Nome: ");
            String nome = scan.nextLine();
            System.out.print("Localização: ");
            String localizacao = scan.nextLine();
            System.out.print("Tamanho (m²): ");
            double tamanho = scan.nextDouble();
            scan.nextLine();


            AreaVerde areaVerde = new AreaVerde(nome, localizacao, tamanho);
        }

        public static void exibirAreasVerdes(){
            System.out.println("\nINFORMAÇÕES SOBRE ÁREAS VERDES EM JOINVILLE");
            if (AreaVerde.areasVerdes.isEmpty()) {
                System.out.println("Nenhuma área verde cadastrada.");
            } else {
                for (AreaVerde areaVerde : AreaVerde.areasVerdes) {
                    areaVerde.exibirInformacoes();
                    System.out.println();
                }
            }
        }

        public static void cadastroColetaResiduo(Scanner scan){
            System.out.println("\nCADASTRO DE COLETA DE RESÍDUOS");
            System.out.print("Tipo de resíduo: ");
            String tipo = scan.nextLine();
            System.out.print("Quantidade (kg): ");
            double quantidade = scan.nextDouble();
            scan.nextLine(); // Consumir a quebra de linha
            System.out.print("Data da coleta (DD/MM/AAAA): ");
            String data = scan.nextLine();

            new MonitoramentoResiduos(tipo, quantidade, data);
            System.out.println("Coleta cadastrada com sucesso!");
        }

        public static void exibirColetasSolicitas(){
            System.out.println("\nLISTA DE COLETAS SOLICITADAS");
            if (MonitoramentoResiduos.monitResiduos.isEmpty()) {
                System.out.println("Nenhuma coleta cadastrada.");
            } else {
                for (MonitoramentoResiduos coleta : MonitoramentoResiduos.monitResiduos) {
                    coleta.exibirInformacoes();
                    System.out.println();
                }
            }
        }
    }

