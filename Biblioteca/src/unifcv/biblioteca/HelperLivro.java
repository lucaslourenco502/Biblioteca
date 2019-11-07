package unifcv.biblioteca;


import java.util.ArrayList;

public  class HelperLivro extends Livro{
	ArrayList<Livro> lista = new ArrayList<Livro>();
	ArrayList<Livro> livros = new ArrayList<Livro>();
	Livro livro = new Livro();
	
	
	public void cadastraLivro(Livro livro) {
		this.lista.add(livro); 
	}
	
	public void excluirLivro(String r) {
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
