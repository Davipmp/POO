package loja_virtual;

public class LojaVirtual {

	private String marca;
	private String modelo;
	public double valor;
	public double desconto;
	public double valorAtualizado;

	public LojaVirtual() {

	}

	public double getValor() {
		this.valor = valor;
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public LojaVirtual(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
		this.valor = valor;
	}

	public double getValoAtualizado() {
		this.desconto = valor * 0.1;
		valor -= desconto;
		return valor;
	}

	public double getDesconto() {
		this.valor = desconto;
		return valor;
	}

}
