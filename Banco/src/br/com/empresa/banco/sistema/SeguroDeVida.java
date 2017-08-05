package br.com.empresa.banco.sistema;

public class SeguroDeVida implements Tributavel {

	@Override
	public double calcularTributos() {
		return 42;
	}

	@Override
	public String getNomeTributo() {
		return "Seguro De Vida";
	}
	
}
