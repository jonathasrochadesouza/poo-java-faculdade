package aulas.a04;

import java.util.Arrays;

public class Vetores {

	public static void main(String[] args) {

		// Declara��o completa de um array unidimensional - um vetor - em uma �nica
		// linha. Ap�s declarado, n�o � poss�vel alterar o comprimento de um array.

		int[] v1 = new int[8]; // criando um array do tipo int, com 8 posi��es.

		// Arrays s�o objetos e como tais possuem m�todos e propriedades,
		// diferentemente de vari�veis primitivas, que guardam apenas seus pr�prios
		// valores.

		// Todo array possui uma propriedade chamada 'length',
		// que nos fornece o seu comprimento (quantidade de posi��es).

		System.out.println("O array v1 possui " + v1.length + " posi��es:");

		// Arrays s�o indexados a partir de zero e devem ser acessados dentro do limite
		// de seu tamanho. Qualquer acesso fora desses limites gera um erro de execu��o.

		// O acesso ao um elemento, tanto para ler quanto para atribuir um valor,
		// � feito pela indexa��o direta da posi��o desejada, isto �, "vetor[�ndice]".

		// Preenchimento com n�meros aleat�rios entre 0 e 99:
		for (int i = 0; i < v1.length; i++) {
			v1[i] = (int) (Math.random() * 100);
		}

		System.out.printf("%6s%8s%n", "�ndice", "Valor");

		for (int i = 0; i < v1.length; i++) {
			System.out.printf("%6d%8d%n", i, v1[i]);
		}

		// Declara��o de uma constante com o comprimento do array:

		final int TAMANHO_VETOR = 15;

		// A declara��o de um array pode ser feita em linhas separadas:

		int[] v2;
		v2 = new int[TAMANHO_VETOR];

		System.out.print("\nConte�do de v2: ");
		for (int i = 0; i < TAMANHO_VETOR; i++) {
			v2[i] = (int) (Math.random() * 100);
			System.out.print(v2[i] + " ");
		}
		System.out.println();

		// Calculando a soma dos elementos de um array
		// atrav�s de um 'for' tradicional, com vari�vel de controle:

		int total = 0;
		for (int i = 0; i < TAMANHO_VETOR; i++) {
			total += v2[i];
		}
		System.out.printf("a) Total dos elementos em v2: %8d%n", total);

		// Calculando a soma dos elementos de um array
		// atrav�s de um la�o 'for' otimizado para uso em listas.

		// S� pode ser usado para obter valores, n�o para modificar,
		// pois o �ndice de cada elemento n�o � conhecido na itera��o.

		total = 0;
		for (int n : v2) {
			total += n;
		}
		System.out.printf("b) Total dos elementos em v2: %8d%n", total);

		// Um array tamb�m pode ser declarado e inicializado
		// sob a forma de uma lista contendo seus elementos.

		// Neste caso, o comprimento n�o � declarado explicitamente,
		// pois � decorrente da quantidade de elementos especificados:

		int[] v3 = { 99, 66, 75, 44, 21, 3, 58 };

		// A linguagem Java possui uma classe chamada "Arrays", que cont�m
		// diversos m�todos utilit�rios para manipula��o desse tipo de objeto.

		// Obtendo um String com os elementos do array:
		String texto = Arrays.toString(v3);
		System.out.println("\nConte�do de v3: " + texto);

		// Copiando o conte�do de um array para outro:
		int[] v4 = Arrays.copyOf(v3, v3.length);
		System.out.println("Conte�do de v4: " + Arrays.toString(v4));

		// Verificando se dois arrays s�o iguais, ou seja,
		// se possuem a mesma quantidade de elementos, nas mesmas posi��es:
		System.out.print("Os arrays v3 e v4 s�o iguais? ");
		if (Arrays.equals(v3, v4)) {
			texto = "Sim!";
		} else {
			texto = "N�o!";
		}
		System.out.println(texto);
		
		// Classificando o conte�do de um array:
		Arrays.sort(v4);
		texto = Arrays.toString(v4);
		System.out.println("\nConte�do de v4 COM ordena��o: " + texto);
		texto = Arrays.toString(v3);
		System.out.println("Conte�do de v3 SEM ordena��o: " + texto);

		System.out.print("Os arrays v3 e v4 s�o iguais? ");
		texto = Arrays.equals(v3, v4) ? "Sim!" : "N�o!";
		System.out.println(texto);
		
		// Preenchendo um array com um determinado valor:
		Arrays.fill(v4, 123);
		texto = Arrays.toString(v4);
		System.out.println("\nConte�do de v4: " + texto);

	}

}
