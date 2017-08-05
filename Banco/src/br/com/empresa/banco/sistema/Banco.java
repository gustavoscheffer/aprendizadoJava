package br.com.empresa.banco.sistema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.empresa.banco.conta.Conta;

public class Banco {

	private List<Conta> conta = new ArrayList<>();
	private Map<String, Conta> mapa = new HashMap<>();
	

	public void adiciona(Conta c) {
		this.conta.add(c);
		this.mapa.put(c.getNome(), c);
	}

	public Conta pega(int index) {
		return this.conta.get(index);
	}

	public int pegaQantidadeDeContas() {
		return this.conta.size();

	}
	public Conta buscaPorNome(String nome){
		return this.mapa.get(nome);
		
	}
}
