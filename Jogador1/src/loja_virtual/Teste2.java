package loja_virtual;

import java.math.BigDecimal;

public class Teste2 {

	public static void main(String[] args) {

		var produto1 = new Produto("iPhone", new BigDecimal(1000.50));

		var livro = new Livro("Java", new BigDecimal(100), "Eric Evans");

		var eletronico = new Eletronico("Tv", new BigDecimal(4000), "LG", "A21");

		System.out.println(produto1);
		System.out.println(livro);
		System.out.println(eletronico);
	}

}
