package aulas.a05;

public class MetodosTipados {

	public static void main(String[] args) {
		int num = 120;
		System.out.printf("%d %s", num, "� par? ");
		System.out.println(numeroPar(num) ? "Sim" : "N�o");

		int a = 1500;
		int b = 1492;
		int c = 1888;
		System.out.printf("%n%s %d, %d e %d: ", "Maior entre ", a, b, c);
		long d = maiorDeTres(a, b, c);
		System.out.println(d);
		
		System.out.println("\nVari�veis de ambiente: " + variaveisAmbiente());
	}

	// O tipo de retorno de um m�todo deve ser
	// identificado imediatamente antes do nome deste.

	// Todo m�todo que n�o seja 'void' deve ter pelo menos
	// uma instru��o 'return' v�lida e compat�vel com
	// o tipo definido para o m�todo.

	private static boolean numeroPar(long n) {
		if (n % 2 == 0) {
			return true;
		} else {
			return false;
		}
		// outra forma de escrever:
		// return n % 2 == 0;
	}
	
	private static long maiorDeTres(long n1, long n2, long n3) {
		long tmp = Math.max(n1, n2);
		return Math.max(tmp, n3);
		// Ou ainda:
		// return Math.max(Math.max(n1, n2), n3);
	}

	private static String variaveisAmbiente() {
		return System.getenv().toString();
	}
}
