package br.com.empresa.banco;

import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.sistema.GerenciadorDeImpostos;
import br.com.empresa.banco.sistema.SeguroDeVida;

public class TestaGerenciadorDeImpostos {
	public static void main(String[] args) {
		
		GerenciadorDeImpostos gdi = new GerenciadorDeImpostos();
		
		ContaCorrente c = new ContaCorrente();
		c.deposita(300);
		gdi.adiciona(c);
		
		SeguroDeVida sdv = new SeguroDeVida();
		gdi.adiciona(sdv);
		
		System.out.printf("O saldo é: %.2f", gdi.getTotal());
		
		
		
	}
}

