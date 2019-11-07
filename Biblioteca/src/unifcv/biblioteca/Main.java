package unifcv.biblioteca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String r;
		boolean laco = true;
		Livro l1 = new Livro();
		HelperLivro hl = new HelperLivro();
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
	    Scanner op  = new Scanner(System.in);
	   
	   
	   
	    do {    
	          switch (op.nextInt()) {
	            case 1: 
	                    System.out.print("Insira o nome do Livro: ");
	                    l1.setNomeLivro (op.nextLine());
	                    System.out.print("Insira a descrição do livro: ");
	                    l1.setDescricao (op.nextLine());
	                    System.out.print("Insira o autor: ");
	                    l1.setAutor (op.nextLine());
	                    System.out.print("Insira a data de lançamento: ");
	                    l1.setDataLancamento (op.nextLine());
	                    
	                    hl.cadastraLivro(livro);
	                    break;
	            case 2: 
	                    System.out.print("Insira o nome do livro que deseja remover: ");
	                    r = op.nextLine();
;	                    hl.excluirLivro(r);
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
	        }while(laco=true);  
	}

}
