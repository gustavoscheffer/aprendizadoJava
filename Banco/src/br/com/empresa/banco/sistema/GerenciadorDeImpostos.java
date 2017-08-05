package br.com.empresa.banco.sistema;

public class GerenciadorDeImpostos {
	private double total;
	
	public void adiciona(Tributavel t){
		System.out.println("Adiciona Tributavel: "+ t.getNomeTributo());
		this.total += t.calcularTributos();
	}
	public double getTotal(){
		return this.total;
	}
}
