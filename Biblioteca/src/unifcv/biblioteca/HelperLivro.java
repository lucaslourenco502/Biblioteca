package unifcv.biblioteca;


import java.util.ArrayList;

public  class HelperLivro extends Livro{
	ArrayList<Livro> lista = new ArrayList<Livro>();
	ArrayList<Livro> livros = new ArrayList<Livro>();
	Livro livro = new Livro();
	
	
	public void cadastraLivro(Livro l1) {
		this.lista.add(l1); 
	}
	
	public void excluirLivro(Livro l1) {
		for (int cont = 0; cont < lista.size(); cont++) 
			if (lista.get(cont).getNomeLivro().equals(nomeLivro))
				lista.remove(cont);
			else 
			System.out.println("Livro não encontrado.");
	}

	
	public void alugarLivro() {
		
	}

	public void devolverLivro() {
		
	}

	
	public void exibirDisp() {
		System.out.println(lista.size());
	}

	public void exibirAlugados() {
		
	}

	
	public void exibirOrd() {
		
	}

	
	public void sair() {
		
	}
}
