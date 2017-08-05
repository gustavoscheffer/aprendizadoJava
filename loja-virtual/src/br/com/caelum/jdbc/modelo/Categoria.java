package br.com.caelum.jdbc.modelo;

import java.util.ArrayList;
import java.util.List;

public class Categoria {

	private final List<Produto> listaDeProdutos = new ArrayList<>();

	/**
	 * @param id
	 * @param nome
	 */
	public Categoria(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	private Integer id;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Produto> getListaDeProdutos() {
		return listaDeProdutos;
	}

	public void setListaDeProdutos(Produto produto) {
		this.listaDeProdutos.add(produto);
	}

	private String nome;
}
