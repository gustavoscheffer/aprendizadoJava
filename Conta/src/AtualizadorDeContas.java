
public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	public void roda(Conta conta) {
		System.out.println("==============================");
		System.out.println("SALDO ANTERIOR: " + conta.getSaldo());
		conta.atualiza(selic);
		System.out.println("SALDO FINAL: " + conta.getSaldo());
		this.saldoTotal += conta.getSaldo();
	}

	public double getSaldoTotal() {
		return saldoTotal;
	}

}
