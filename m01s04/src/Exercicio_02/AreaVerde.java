package Exercicio_02;

public class AreaVerde {

        //Atributos
        String nome;
        String localizacao;
        double tamanho; // Em metros quadrados
        String statusConservacao;
        String responsavel;


        public String details(){
            return String.format("----- INFORMAÇÕES DA ÁREA VERDE -------" +
                    "\nNOME: %s"+
                    "\nLOCALIZAÇÃO: %s"+
                    "\nTAMANHO: %.2f m²"+
                    "\nSTATUS CONSERVAÇÃO: %s"+
                    "\nRESPONSÁVEL: %s"+
                    "\n---------------------------------------------------", nome, localizacao, tamanho, statusConservacao, responsavel);
        }
}

