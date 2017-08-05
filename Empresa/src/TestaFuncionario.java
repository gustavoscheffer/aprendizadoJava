class TestaFuncionario{
	public static void main(String[] args){
		
		Funcionario f1 = new Funcionario();
		f1.setDataEntrada(new DataEntrada(30,3,1212));
		f1.setNomeFuncionario("Maria");
		f1.setSalario(1200);
		f1.mostraFuncionario();			
	}
}
