package br.com.empresa.banco;

import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ContaPoupanca;
import br.com.empresa.banco.sistema.Banco;

public class TestaBanco {

	public static void main(String[] args) {

		ContaCorrente cc1 = new ContaCorrente(1,500.0);
		cc1.setNome("Gustavo Santos");
		ContaCorrente cc2 = new ContaCorrente(1,60.0);
		cc2.setNome("Naides Leao");
		ContaCorrente cc3 = new ContaCorrente(3,705.0);
		cc2.setNome("Naides Leao");
		
		ContaPoupanca cp1 =new ContaPoupanca(1, 250.1);
		cp1.setNome("Mainar Leao");
		ContaPoupanca cp3 =new ContaPoupanca(4, 5550.1);
		cp3.setNome("Cerena Aldinha");
		ContaPoupanca cp4 =new ContaPoupanca(8, 1320.54);
		cp4.setNome("Thais Cristina");
		
		
		
		Banco banco = new Banco();
		
		banco.adiciona(cc1);
		banco.adiciona(cc2);
		banco.adiciona(cc3);
		
		banco.adiciona(cp1);
		banco.adiciona(cp4);
		banco.adiciona(cp3);
		
		//System.out.println("Quantidade de Contas: " + banco.pegaQantidadeDeContas());
		
		//for (int i = 0; i < banco.pegaQantidadeDeContas(); i++) {
			//System.out.println(banco.pega(i));
		//}
		System.out.println(banco.buscaPorNome("Cerena Aldinha"));
		
		System.out.println(banco.pega(0).equals(cc2));
		
	}
}
