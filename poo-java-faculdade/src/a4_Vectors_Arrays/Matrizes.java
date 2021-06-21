package aulas.a04;

import java.util.Arrays;

public class Matrizes {

	public static void main(String[] args) {

		// Declara��o completa de um array bidimensional - uma matriz - em uma �nica
		// linha. Ap�s declarado, n�o � poss�vel alterar o comprimento das dimens�es.

		int[][] m1 = new int[3][4];

		// A propriedade 'length' existe para cada linha e coluna, individualmente.
		// Isso acontece porque um array bidimensional n�o precisa ser retangular.

		for (int lin = 0; lin < m1.length; lin++) {
			for (int col = 0; col < m1[lin].length; col++) {
				m1[lin][col] = (int) (Math.random() * 100);
			}
		}

		System.out.println("Conte�do de m1:");
		System.out.println("--------------------");
		for (int lin = 0; lin < m1.length; lin++) {
			for (int col = 0; col < m1[lin].length; col++) {
				System.out.printf("%5d", m1[lin][col]);
			}
			System.out.println();
		}
		System.out.println();

		// Declara��o de uma matrix 2x2 com elementos pr�-definidos.
		// OS comprimentos n�o s�o declarados explicitamente,
		// pois s�o decorrentes da quantidade de elementos especificados:

		int[][] m2 = { { 1, 2 }, { 4, 3 } };

		System.out.println("Conte�do de m2:");
		System.out.println("--------------------");
		for (int lin = 0; lin < m2.length; lin++) {
			for (int col = 0; col < m2[lin].length; col++) {
				System.out.printf("%5d", m2[lin][col]);
			}
			System.out.println();
		}
		System.out.println();

		// Declara��o de uma matriz irregular,
		// em que nem todas as colunas t�m o mesmo comprimento:

		int[][] m3 = new int[2][]; // aloca��o de 2 linhas
		m3[0] = new int[5]; // aloca��o de 5 colunas na linha 0
		m3[1] = new int[3]; // aloca��o de 3 colunas na linha 1

		for (int i = 0; i < m3.length; i++) {
			for (int j = 0; j < m3[i].length; j++) {
				m3[i][j] = (int) (Math.random() * 100);
			}
		}

		System.out.println("Conte�do de m3:");
		System.out.println("--------------------------");
		for (int lin = 0; lin < m3.length; lin++) {
			for (int col = 0; col < m3[lin].length; col++) {
				System.out.printf("%5d", m3[lin][col]);
			}
			System.out.println();
		}
		System.out.println();

		// A classe "Arrays" tamb�m lida com objetos multidimensionais,
		// por�m o comportamento e os m�todos podem diferir dos unidimensionais:

		// Obtendo um String com os elementos de array multidimensional:
		String texto = Arrays.deepToString(m1);
		System.out.println("Conte�do de m1: " + texto);
		texto = Arrays.deepToString(m2);
		System.out.println("Conte�do de m2: " + texto);
		texto = Arrays.deepToString(m3);
		System.out.println("Conte�do de m3: " + texto);

		// A c�pia deve tratar cada dimens�o individualmente:
		int[][] m4 = Arrays.copyOf(m2, m2.length);
		m4[0] = Arrays.copyOf(m2[0], m2[0].length);
		m4[1] = Arrays.copyOf(m2[1], m2[1].length);
		texto = Arrays.deepToString(m4);
		System.out.println("Conte�do de m4: " + texto);
		
		// A igualdade de conte�do deve utilizar 'deepEquals()':
		System.out.println("m2 e m4 s�o iguais? " + Arrays.deepEquals(m2, m4));
		
		// A classifica��o pode ser feita dimens�es simples:
		Arrays.sort(m4[1]);
		texto = Arrays.deepToString(m4);
		System.out.println("Conte�do de m4: " + texto);

		System.out.println("m2 e m4 s�o iguais? " + Arrays.deepEquals(m2, m4));
		System.out.println(Arrays.equals(m2[0], m4[0]));
		System.out.println(Arrays.equals(m2[1], m4[1]));
	}

}
