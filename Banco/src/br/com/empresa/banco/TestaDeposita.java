package br.com.empresa.banco;

import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ValorInvalidoException;

public class TestaDeposita {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		try {
			cc.deposita(-100);
			System.out.println("Saldo Atual: " + cc.getSaldo());
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}

	}

}
