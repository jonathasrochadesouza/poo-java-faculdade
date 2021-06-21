package aulas.a03;

public class CondicionalTernario {

	public static void main(String[] args) {

		int x = 175;
		String aux = "";

		// resultado = condi��o ? valor Verdadeiro : valor Falso;
		aux = x >= 0 ? "positivo" : "negativo";
		System.out.println("x � " + aux);

		// Outra forma (bem menos leg�vel) de escrever:
		System.out.println("x � " + ((x >= 0) ? "positivo" : "negativo"));

		// A opera��o tern�ria acima � equivalente a:
		if (x >= 0) {
			aux = "positivo";
		} else {
			aux = "negativo";
		}

		aux = x % 2 == 0 ? "par" : "�mpar";
		System.out.println("x � " + aux);

		// A opera��o tern�ria acima � equivalente a:
		if (x % 2 == 0) {
			aux = "par";
		} else {
			aux = "�mpar";
		}

		int y = x > 100 ? 1000 : 0;
		System.out.println("y = " + y);
	}

}
