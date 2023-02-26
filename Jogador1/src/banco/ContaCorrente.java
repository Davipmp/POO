package banco;

public class ContaCorrente extends Conta {
		
	
	private double tarifa;
	
	public ContaCorrente (int numero, double saldo, double tarifa) {
		super(numero, saldo);
		this.tarifa = tarifa;
	}
	
	public double calcularTarifa() {
		return saldo - tarifa;
	}
	
	public double getTarifa() {
		this.tarifa = saldo - 1.20;
		return tarifa;
	}
}
