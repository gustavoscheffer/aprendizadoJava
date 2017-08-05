package br.com.empresa.banco;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import br.com.empresa.banco.conta.ContaPoupanca;

public class TestaOrdenacao {
	public static void main(String[] args) {

		Random numConta = new Random();
		double vmax = 1243;
		double vmin = 1643;

		List<ContaPoupanca> contaP = new LinkedList<>();

		for (int i = 0; i < 10; i++) {

			double ramValor = vmax + (vmax - vmin) * numConta.nextDouble();
			ContaPoupanca contaPoupanca = new ContaPoupanca(numConta.nextInt(50), ramValor);
			contaP.add(contaPoupanca);
		}

		for (ContaPoupanca contaPoupanca : contaP) {
			System.out.println("Numero: " + contaPoupanca.getNumero());
			System.out.format("Saldo : %.2f", contaPoupanca.getSaldo());
			System.out.println("\n--------------------------------------");
		}
		 System.out.println(contaP);
		 Collections.sort(contaP);
	}
}