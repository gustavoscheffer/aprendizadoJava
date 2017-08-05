
public class TestaConta {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente();
		conta.deposita(99.2);
		System.out.println(conta.getSaldo());		 
	}
}
