package aulas.a03;

import java.util.Scanner;

public class CondicionalIf {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe um n�mero maior do que 0: ");
		int n = entrada.nextInt();

		if (n <= 0) {
			System.out.println("O n�mero informado n�o � maior do que ZERO.");
		}

		if (n % 2 == 0) {
			System.out.println("O n�mero informado � par.");
		} else {
			System.out.println("O n�mero informado � impar.");
		}

		if (n < 0) {
			System.out.println("O n�mero informado � negativo.");
		} else if (n <= 50) {
			System.out.println("O n�mero informado est� entre 0 e 50.");
		} else if (n <= 150) {
			System.out.println("O n�mero informado est� entre 51 e 150.");
		} else {
			System.out.println("O n�mero informado � maior que 150.");
		}

	}

}
