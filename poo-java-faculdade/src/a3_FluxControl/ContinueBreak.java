package aulas.a03;

public class ContinueBreak {

	public static void main(String[] args) {

		int cont;

		for (cont = 1; cont <= 10; cont++) {
			if (cont == 5) {
				break; // encerra o la�o quando o contador chegar em 5
			}
			System.out.printf("%d ", cont);
		}
		System.out.printf("%nQuebrou o FOR no contador = %d%n", cont);

		
		for (cont = 1; cont <= 10; cont++) {
			if (cont == 5) {
				continue; // n�o executa as instru��es abaixo caso contador = 5
			}
			System.out.printf("%d ", cont);
		}

		System.out.printf("%nUsamos 'continue' para n�o exibir o n�mero 5%n");
	}

}
