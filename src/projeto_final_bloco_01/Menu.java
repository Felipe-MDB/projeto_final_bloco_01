package projeto_final_bloco_01;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		// Laço de Repetição
		while (true) {

		    System.out.println("=====================================================");
		    System.out.println("                                                     ");
		    System.out.println("                GABY DOCES                           ");
		    System.out.println("                                                     ");
		    System.out.println("=====================================================");
		    System.out.println("                                                     ");
		    System.out.println("            1 - Cadastrar Produto                    ");
		    System.out.println("            2 - Listar Todos os Doces                ");
		    System.out.println("            3 - Atualizar Produto                    ");
		    System.out.println("            4 - Deletar Produto                      ");
		    System.out.println("            0 - Sair                                 ");
		    System.out.println("                                                     ");
		    System.out.println("=====================================================");
		    System.out.println("Entre com a opção desejada:                          ");
		    System.out.println("                                                     ");

		    opcao = leia.nextInt();
		
		    
		    // Laço Condicional (Sair do sistema)
            if (opcao == 0) {
                System.out.println("\nGABY DOCES - Agradecemos a preferência!");
                leia.close();
                System.exit(0);
            }

            // Laço Condicional (Processamento das opções)
            switch (opcao) {
                case 1:
                    System.out.println("Cadastrar Produto\n\n");
                    break;
                    
                case 2:
                    System.out.println("Listar Todos os Doces\n\n");
                    break;
                    
                case 3:
                    System.out.println("Atualizar Produto\n\n");
                    break;
                    
                case 4:
                    System.out.println("Deletar Produto\n\n");
                    break;
                    
                default:
                    System.out.println("\nOpção Inválida!\n");
                    break;
            }
		}
	}
}
