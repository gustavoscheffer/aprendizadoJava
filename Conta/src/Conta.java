
public abstract class Conta {

	protected double saldo;
	protected int numero;

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public abstract void atualiza(double taxa);

	public void deposita(double valor) {
		this.saldo += valor;
	}
	
}
