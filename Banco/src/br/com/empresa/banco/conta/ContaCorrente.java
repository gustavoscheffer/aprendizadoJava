package br.com.empresa.banco.conta;

import br.com.empresa.banco.sistema.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {
	
	String tributo;
	
	public ContaCorrente(int num, double valor) {
		super(num,valor);
	}
	public ContaCorrente() {
	
	}
	
	public void atualiza(double valor){
		this.saldo+= valor;
	}
	public double calcularTributos(){
		return this.getSaldo() * 0.1;
	}
	public String getNomeTributo() {
		return "taxinha";
	}
	

}

