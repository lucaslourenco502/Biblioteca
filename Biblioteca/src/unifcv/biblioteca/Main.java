package unifcv.biblioteca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Livro l1 = new Livro();
		HelperLivro hl = new HelperLivro();
	    Scanner entrada = new Scanner(System.in);
	    String remove;
		boolean laco = true;
	   
	    do { 
	    	System.out.println("        SISTEMA BIBLIOTECA");
	    	System.out.println("------------------------------------");
	    	System.out.println("1- Cadastrar Livro");
	    	System.out.println("2- Excluir Livro");
		    System.out.println("3- Alugar Livro");
		    System.out.println("4- Devolver Livro");
		    System.out.println("5- Exibir todos os livros disponíveis");
		    System.out.println("6- Exibir todos os livros alugados");
		    System.out.println("7- Exibir os livros de forma ordenada");
		    System.out.println("8- Sair");
		    System.out.println("--------------------------------------");
		    System.out.print("Insira a operação que deseja realizar: ");
		    System.out.println("\n");
		    Scanner op  = new Scanner(System.in);
	    	
	          switch (op.nextInt()) {
	            case 1: 
	                    System.out.print("Insira o nome do Livro: ");
	                    l1.setNomeLivro (entrada.nextLine());
	                    System.out.print("Insira a descrição do livro: ");
	                    l1.setDescricao (entrada.nextLine());
	                    System.out.print("Insira o autor: ");
	                    l1.setAutor (entrada.nextLine());
	                    System.out.print("Insira a data de lançamento: ");
	                    l1.setDataLancamento (entrada.nextLine());
	                    
	                    hl.cadastraLivro(l1);
	                    System.out.println("Livro cadastrado com sucesso!");
	                    System.out.println("\n");
	                    break;
	            case 2: 
	                    System.out.print("Insira o nome do livro que deseja remover: ");
	                    remove = entrada.nextLine();
	                    hl.excluirLivro(l1);
	                    System.out.println("Livro excluido com sucesso!");
	                    break;                
	            case 3: 	                  
	            case 4: 
	            case 5: 	                    	                
	            case 6: 
	                    hl.exibirDisp();
	                    break;
	            case 7:         
	            case 8: 
	                    laco=false; 
	                    break;   
	          default: 
	                   System.out.println("Opção inválida.");
	                   break; }
	        }while(laco == true); 
	    System.out.println("Programa encerrado.");
	}

}
