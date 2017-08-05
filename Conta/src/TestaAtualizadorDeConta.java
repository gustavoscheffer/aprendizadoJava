
public class TestaAtualizadorDeConta {

	public static void main(String[] args) {
		//Conta c = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		AtualizadorDeContas adc = new AtualizadorDeContas(12.0);
		
		//c.deposita(100);
		cc.deposita(100);
		cp.deposita(100);
		
		//adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);
		
		System.out.println(adc.getSaldoTotal());

	}

}
