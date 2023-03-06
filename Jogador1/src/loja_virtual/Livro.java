package loja_virtual;

import java.math.BigDecimal;

public class Livro extends Produto{

	public String autor;
	
	
	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public Livro(String nome, BigDecimal preco, String autor) {
		super(nome, preco);
		this.autor = autor;
		}
	 
	@Override
	public String converterParaTexto() {
		return converterParaTexto() + autor;
//		return getNome() + " R$" + getPreco() + autor; 
		 
	 }
}
