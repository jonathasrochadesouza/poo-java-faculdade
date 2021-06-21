package aulas.a03;

public class ForLoop {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(Math.random());
		}

		// leitura dos par�metros de entrada do m�todo main():
		for (String s : args) {
			System.out.println(s);
		}
		
		// a constru��o acima � equivalente a:
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}

}
