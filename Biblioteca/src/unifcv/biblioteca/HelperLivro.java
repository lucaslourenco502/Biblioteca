package unifcv.biblioteca;

public abstract class HelperLivro  extends Livro {
	List<Livro> lista = new ArrayList<>();
	Livro livro = new Livro();
	
	
	public void cadastraLivro(Livro livro) {
		this.lista.add(livro); 
	}
	
	public void excluirLivro(Livro livro) {
		for (int cont = 0; cont < lista.size(); cont++) 
			if (lista.get(cont).getNomeLivro().equals(nomeLivro))
				lista.remove(cont);
			else 
			System.out.println("nao encont");
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
