package loja_virtual;

public class DescontoPrimeiraCompra extends LojaVirtual {

	private double desconto;
	private double valorAtualizado;

	public double CalcularDesconto(String marca, String modelo, double desconto) {
		this.desconto = valor;
		return valor;
	}

	public double getDesconto() {
		this.valor = desconto;
		return valor;
	}

	public double getValoAtualizado() {
		this.desconto = valor * 0.1;
		valor -= desconto;
		return valor;
	}
}
