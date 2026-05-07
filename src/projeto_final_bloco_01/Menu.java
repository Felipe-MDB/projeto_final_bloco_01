package projeto_final_bloco_01;

import java.util.InputMismatchException;
import java.util.Scanner;

import projeto_final_bloco_01.controller.DoceController;
import projeto_final_bloco_01.model.DoceArtesanal;

public class Menu {

		private static  Scanner leia = new Scanner(System.in);
		private static final DoceController doceController = new DoceController();
		
		public static void main(String[] args) {
		
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

		    
		    try {
				opcao = leia.nextInt();
				leia.nextLine();
			} catch (InputMismatchException e) {
				opcao = -1;
				System.out.println("\nDigite um número inteiro!");
				leia.nextLine();
			}
		
		    
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
                    cadastrarDoce();
                    
                    keyPress();
                    break;
                    
                case 2:
                    System.out.println("Listar Todos os Doces\n\n");
                    listarTodos();
                    
                    keyPress();
                    break;
                    
                case 3:
                    System.out.println("Atualizar Produto\n\n");
                    
                    keyPress();
                    break;
                    
                case 4:
                    System.out.println("Deletar Produto\n\n");
                    
                    keyPress();
                    break;
                    
                default:
                    System.out.println("\nOpção Inválida!\n");
                    break;
            }
		}
	}
	
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Felipe Marques ");
		System.out.println("https://github.com/Felipe-MDB/projeto_final_bloco_01.git");
		System.out.println("*********************************************************");
	}
	
	
	public static void keyPress() {
		System.out.println("\n\nPressione Enter para Continuar...");
		leia.nextLine();
	}
	
	private static void listarTodos() {
		
		doceController.listarTodos();
	}
	
	private static void cadastrarDoce() {
	    System.out.println("Cadastrar Produto");
	    
	    System.out.print("ID do Produto: ");
	    int id = leia.nextInt();
	    leia.nextLine(); // Limpar buffer

	    System.out.print("Nome do Produto: ");
	    String nome = leia.nextLine();

	    System.out.print("Preço: ");
	    float preco = leia.nextFloat();
	    leia.nextLine();

	    
	    // Cria o objeto e envia para a Controller
	    doceController.cadastrar(new DoceArtesanal(id, nome, 1, preco));
	}
}
