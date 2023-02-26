package banco;
public class TesteConta {
	public static void main(String[] args) {
		
		var conta = new Conta(123, 150.0);
		System.out.println(conta.calcularSaldo());
		
		var contavip = new ContaVip(123, 150.0, 0);
		System.out.println(contavip.getLimite());
		
		var contacorrente = new ContaCorrente(123, 150.0, 1.20);
		System.out.println(contacorrente.getTarifa());
	}
}
