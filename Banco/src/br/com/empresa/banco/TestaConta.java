package br.com.empresa.banco;

import br.com.empresa.banco.conta.ContaCorrente;

public class TestaConta {
	public static void main(String[] args) {
		/*
		 * Conta conta = new ContaCorrente(); conta.deposita(99.2);
		 * System.out.println(conta.getSaldo());
		 */

		ContaCorrente contaCorrente = new ContaCorrente(2,4.32);
		System.out.println(contaCorrente);
	}
}
