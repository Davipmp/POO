package loja_virtual;

import loja_virtual.DescontoPrimeiraCompra;
import loja_virtual.LojaVirtual;

public class TesteLoja {

	public static void main(String[] args) {

		LojaVirtual lv = new LojaVirtual("Canon", "PowerShot SX420 IS"); // "Canon", "Canon PowerShot SX420 IS"

		System.out.println(lv.getMarca());
		System.out.println(lv.getModelo());

		lv.setValor(200.0);

		System.out.println("O valor do produto e: " + lv.getValor());
		System.out.println("Valor atualiazado com desconto e: " + lv.getValoAtualizado());
		System.out.println("Desconto da primeira compra (10%): " + lv.getDesconto());
	}
}
