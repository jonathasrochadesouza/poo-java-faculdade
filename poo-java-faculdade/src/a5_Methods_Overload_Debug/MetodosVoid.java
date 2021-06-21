package aulas.a05;

public class MetodosVoid {

	public static void main(String[] args) {
		mostrarMenu();
		
		String palavra = "Palavra";
		maiusculas(palavra);
		System.out.println(palavra);

		int x = 5;
		triplicar(x);
		System.out.println(x);
	}

	// M�todos do tipo 'void' n�o retornam valores para o ponto de chamada.

	// A instru��o 'return' interrompe a execu��o do m�todo imediatamente,
	// devolvendo a execu��o para o ponto de chamada.
	
	private static void mostrarMenu() {
		String menu =
				"**************************\n" +
				"1 - Fazer alguma coisa\n" +
				"2 - N�o fazer coisa alguma\n" +
				"3 - Fazer outra coisa\n" +
				"0 - Fim!\n" +
				"**************************\n";
		System.out.println(menu);
		return;
	}
	
	// A passagem de par�metros em Java acontece por valor.
	// Os m�todos recebem c�pias dos par�metros, ou seja,
	// as altera��es feitas nos par�metros dentro do m�todo
	// n�o s�o levadas para contextos externos.
	
	private static void maiusculas(String txt) {
		txt = txt.toUpperCase();
		System.out.println(txt);
	}
	
	private static void triplicar(int numero) {
		numero = numero * 3;
		System.out.println(numero);
	}
	
	

}
