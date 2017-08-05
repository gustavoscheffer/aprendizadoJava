package br.com.empresa.banco;

import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.sistema.Tributavel;

public class TestaTributavel {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(200);
		System.out.printf("Tributos: %.2f\n", cc.calcularTributos());
		
		Tributavel t = cc;
		System.out.printf("Tributos: %.2f", t.calcularTributos());
		
		
	}


}
