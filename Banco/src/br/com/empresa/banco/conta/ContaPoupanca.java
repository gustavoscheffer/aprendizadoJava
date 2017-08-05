package br.com.empresa.banco.conta;

public class ContaPoupanca extends Conta {


	public ContaPoupanca(int numero, double valor) {
		super(numero, valor);
	}

	public ContaPoupanca() {

	}

	public void atualiza(double valor) {
		this.saldo += valor;
	}
	

	

}
