
public class TestaString {

	public int converStringInt(String txt) {
		int valor;
		int valorf = 0;

		for (int i = 0; i < txt.length(); i++) {
			valor = (int) ((txt.charAt(i) - '0') * Math.pow(10, txt.length() - i - 1));
			valorf = valorf + valor;
		}
		return valorf;
	}

	public static void main(String[] args) {
		TestaString ts = new TestaString();
		System.out.println(ts.converStringInt("890") + 1);
	}

}
