package br.com.empresa.banco;

import java.util.HashSet;
import java.util.Set;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;

public class TestaHashCode {

	public static void main(String[] args) {
		Set<Conta> conta = new HashSet<>();
		
		ContaCorrente conta1 = new ContaCorrente(2, 13.00);
		ContaCorrente conta3 = new ContaCorrente(2, 134.01);
		ContaCorrente conta2 = new ContaCorrente(3, 654.30);
		
		conta.add(conta1);
		conta.add(conta2);
		conta.add(conta3);
		
		for (Conta i : conta) {
			System.out.println(i.toString());
		}
		
		
	}
}
