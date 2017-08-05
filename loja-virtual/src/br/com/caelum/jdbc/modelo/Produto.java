package br.com.caelum.jdbc.modelo;

public class Produto {

	private int id;
	private String nome;
	private String descricao;
	/**
	 * @param nome
	 * @param descricao
	 */
	public Produto(String nome, String descricao) {
		super();
		this.nome = nome;
		this.descricao = descricao;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}
	public void setId(int id) {
		this.id = id;
		
	}	
	@Override
	public String toString() {
		return String.format("[Produto: %d,  %s,  %s]",this.id, this.nome, this.descricao);
	}
	
	
	
	
}
