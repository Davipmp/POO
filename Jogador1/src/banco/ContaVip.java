package banco;
public class ContaVip extends Conta {
	
	private double limite;
	
	public ContaVip(int numero, double saldo, double tarifa) {
		super(numero, saldo);
	}
	public double calcularSaldo() {
		return saldo + limite;
	}
	
	public double getLimite() {
		this.limite = saldo + 50; 
		return limite;
	}
}
