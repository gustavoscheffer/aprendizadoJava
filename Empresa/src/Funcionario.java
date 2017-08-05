public class Funcionario{
	
	private String nomeFuncionario;
	private String departamento;
	private double salario;
	private DataEntrada dataEntrada;
	private String rg;

	
	//Construtor
	
	public Funcionario(String nomeFuncionario){
		this.nomeFuncionario = nomeFuncionario;	
	}
	
	public Funcionario(){
		
	}
	
//Getters and Setters 	
	public String getNomeFuncionario(){
		return this.nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario){
		this.nomeFuncionario = nomeFuncionario;
		
	}
	public String getDepartamento(){
		return this.departamento;
	}
	public void setDepartamento(String departamento){
		this.departamento = departamento;
		
	}
	public double getSalario(){
		return this.salario;
	}
	
	public void setSalario(double salario){
		this.salario = salario;
	
	}
	public DataEntrada getDataEntrada(){
		return this.dataEntrada;
	}
	public void setDataEntrada(DataEntrada dataEntrada){
		this.dataEntrada = dataEntrada;
	}
	public String getRg(){
		return this.rg;
	}


	
	public void recebeAumento(double valorAcrecido){
		this.salario += valorAcrecido;
	}
	
	public double getGanhoAnual(){
		return this.salario * 12;
	}
	
	public void mostraFuncionario(){
		System.out.println("Nome: " + this.getNomeFuncionario());
		System.out.println("Departamento: " + this.getDepartamento());
		System.out.println("Salario: " + this.getSalario());
		System.out.println("RG: " + this.getRg());
		System.out.println("salario Anual: " + this.getGanhoAnual());
		//System.out.println("Dia: " + this.dataEntrada.dia);
        //System.out.println("Mês: " + this.dataEntrada.mes);
        //System.out.println("Ano: " + this.dataEntrada.ano);
        System.out.println("Data: " + this.dataEntrada.getFormataData());
		System.out.println("");
	}
}
