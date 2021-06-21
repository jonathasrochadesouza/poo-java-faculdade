package aulas.a05;

public class MetodosSobrecarregados {

	// T�cnica de OVERLOADING (sobrecarga):
	// � poss�vel declarar m�todos com o mesmo nome, por�m eles
	// devem conter listas distintas de par�metros.

	// O m�todo usado ser� aquele com a lista de
	// par�metros correspondentes � chamada.

	public static void main(String[] args) {

		int x = 515;
		int y = triploDe(x); // chamada com par�metro INT
		System.out.println(y);

		x = 9967;
		long z = triploDe(x); // chamada com par�metro INT
		System.out.println(z);

		z = triploDe(z); // chamada com par�metro LONG
		System.out.println(z);

		double w = triploDe(z); // chamada com par�metro LONG
		System.out.println(w);

		w = triploDe(w); // chamada com par�metro DOUBLE
		System.out.println(w);

		String s = triploDe("Java!"); // chamada com par�metro STRING
		System.out.println(s);
		
	}

	// A instru��o 'return' devolve o controle ao ponto de chamada,
	// retornando o valor especificado.

	private static int triploDe(int numero) {
		System.out.println("\nChamada para o m�todo que retorna INT:");
		return numero * 3;
	}

	private static long triploDe(long numero) {
		System.out.println("\nChamada para o m�todo que retorna LONG:");
		return numero * 3;
	}

	private static double triploDe(double numero) {
		System.out.println("\nChamada para o m�todo que retorna DOUBLE:");
		return numero * 3;
	}

	private static String triploDe(String texto) {
		System.out.println("\nChamada para o m�todo que retorna STRING:");
		return texto.repeat(3);
	}

}
