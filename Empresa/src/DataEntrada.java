class DataEntrada{
	
	private int dia;
	private int mes;
	private int ano;

// construtor padrão	
	public DataEntrada(int dia, int mes, int ano){ 
		this.verificaData(dia, mes, ano);		
	}
		
	
// metodo privado para verificar a data e usado pelo construtor	
	private void verificaData(int dia, int mes, int ano){
		if(dia > 29 && mes == 2){
		
		}else{			
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
			}
		
	}	
	
//getters and setters	
	public int getDia(){
		return this.dia;
	}
	public void setDia(int dia){
		this.dia = dia;
	} 
	public int getMes(){
		return this.mes;
	}
	public void setMes(int mes){
		this.mes = mes;
	} 
	public int getAno(){
		return this.ano;
	}	
	public void setAno(int ano){
		this.ano = ano;
	} 
	
	

//Methods 	
	String getFormataData(){
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
	void preencheData(int dia, int mes, int ano){ // construtor que recebe dia mes e ano
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
		

}

