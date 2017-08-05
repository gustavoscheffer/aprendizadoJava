package br.com.empresa.banco.conta;

public abstract class Conta implements Comparable<Conta> {

	protected double saldo;
	protected int numero;
	private String nome;

	/**
	 * Este método serve para colocar o número da conta.
	 * 
	 * @param numero
	 */

	public Conta(int numero, double valor) {
		this.saldo = valor;
		this.numero = numero;
	}

	public Conta() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public abstract void atualiza(double taxa);

	/**
	 * Método utilizado para depositar o dinheiro na conta do cliente.
	 * 
	 * @param valor
	 */
	public void deposita(double valor) {
		if (valor < 0) {
			throw new ValorInvalidoException(valor);
		} else {
			this.saldo += valor;
		}
	}
	@Override
	public String toString() {
		
		return "Este objeto e uma conta de num: " + this.getNumero()+ " que possui o saldo de: R$"+ this.getSaldo();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}
	@Override
	public int compareTo(Conta other) {
		return this.nome.compareTo(other.nome);		 
	}
	
	
	
}