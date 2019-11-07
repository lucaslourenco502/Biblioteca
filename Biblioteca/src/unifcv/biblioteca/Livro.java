package unifcv.biblioteca;

public class Livro {
	protected String nomeLivro;
	protected String descricao;
	protected String autor;
	protected String dataLancamento;
	protected boolean alugado;
	
	public String getNomeLivro() {
		return nomeLivro;
	}
	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	public boolean isAlugado() {
		return alugado;
	}
	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}
	
}
