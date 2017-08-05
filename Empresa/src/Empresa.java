class Empresa{
	private String nome;
	private String nomeFantasia;
	private String cnpj;
	private Funcionario[] empregados;
	private int livre; //contador de espaços livres no array empregados[].

	//Construtor
	
	public Empresa(int arrayLimite){
		this.empregados = new Funcionario[arrayLimite]; 
	}	
		
	/* Getters and Setters*/
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNomeFantasia(){
		return this.nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia){
		this.nomeFantasia = nomeFantasia;
	}
	
	public String getCnpj(){
		return this.cnpj;
	}
	
	public Funcionario getFuncionario(int posicao){
		return this.empregados[posicao];
	}
	public void setFuncionario(int posicao, Funcionario funcionario){
		this.empregados[posicao] = funcionario;
	}
	
	
	/*Methods*/
	private void adicionaFuncionario(Funcionario func){
		this.empregados[this.livre] = func;
		this.livre++;		
	}
	
	public void mostraEmpregados(){
		for(int i = 0; i < this.livre; i++){
			System.out.println("FUNCIONARIO: " + this.empregados[i].getNomeFuncionario());
			System.out.println("SALARIO: " + this.empregados[i].getSalario());	
		}
		
    }
	public void mostraTodasAsInformacoes(){
	
	for(int x = 0; x < this.livre; x++){
		System.out.println("Funcionario na posicao: " + x);
			this.empregados[x].mostraFuncionario();
		}
	
	}
	public boolean contem(String procuraFunc){
		for(int x = 0; x < this.livre; x++){
			if(procuraFunc == this.empregados[x].getNomeFuncionario()){
				System.out.println("Funcionario na posicao: " + x);
				return true;
			}
		}
		return false;
	}
}

