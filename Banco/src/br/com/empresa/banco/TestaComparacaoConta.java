package br.com.empresa.banco;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;

public class TestaComparacaoConta {
	public static void main(String[] args) {
		
		ContaCorrente contaCorrente1 = new ContaCorrente(50, 200);
		contaCorrente1.setNome("Gustavo Luis Scheffer");
		ContaCorrente contaCorrente2 = new ContaCorrente(10, 5500);
		contaCorrente2.setNome("Naides Soares");
		ContaCorrente contaCorrente3 = new ContaCorrente(20, 3400);
		contaCorrente3.setNome("Gladis Leao");
		ContaCorrente contaCorrente4 = new ContaCorrente(20, 3400);
		contaCorrente4.setNome("Aline Silva");
		
		List<Conta> contas = new LinkedList<>();
		contas.add(contaCorrente1);
		contas.add(contaCorrente2);
		contas.add(contaCorrente3);
		contas.add(contaCorrente4);
		
		Collections.sort(contas);
		
		for (Conta conta : contas) {
			System.out.println(conta.getNome());
		}

	}

}
