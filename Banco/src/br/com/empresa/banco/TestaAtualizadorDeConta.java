package br.com.empresa.banco;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ContaPoupanca;
import br.com.empresa.banco.sistema.AtualizadorDeContas;

public class TestaAtualizadorDeConta {

	public static void main(String[] args) {

		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();

		AtualizadorDeContas adc = new AtualizadorDeContas(12.0);

		cc.deposita(100);
		cp.deposita(100);

		adc.roda(cc);
		adc.roda(cp);

		System.out.println(adc.getSaldoTotal());

	}

}
