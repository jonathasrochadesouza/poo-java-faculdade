package aulas.a12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class VetorXArrayList {

	public static void main(String[] args) {

		Random rd = new Random();

		// Declara��o e preenchimento de um vetor de 10 inteiros.
		// O vetor ter� sempre o mesmo tamanho, n�o h� como redimensionar.

		int[] vetor = new int[10];
		System.out.println("Vetor = " + Arrays.toString(vetor));
		System.out.println("Comprimento do vetor = " + vetor.length);
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = rd.nextInt(100);
		}
		System.out.println("Vetor = " + Arrays.toString(vetor));
		System.out.println("Comprimento do vetor = " + vetor.length);

		// Uma lista � uma cole��o de elementos em sequ�ncia, que
		// pode conter itens duplicados e ser redimensionada.

		// Declara��o e preenchimento de um ArrayList do tipo Integer.
		// Listas n�o aceitam tipos primitivos, portanto devemos
		// utilizar a classe equivalente ao int.
		// Nos pr�ximos coment�rios, sempre que se falar em 'lista',
		// entenda-se como qualquer ArrayList.

		ArrayList<Integer> lista = new ArrayList<Integer>();
		System.out.println("\nLista = " + lista);
		System.out.println("Tamanho da Lista = " + lista.size());

		// O m�todo add() insere um elemento no final da lista.
		for (int i = 0; i < vetor.length; i++) {
			lista.add(vetor[i]);
		}
		System.out.println("\nLista = " + lista);
		System.out.println("Tamanho da Lista = " + lista.size());

		// Ao contr�rio do vetor, o tamanho da lista muda
		// conforme os elementos s�o inseridos nela.
		// A lista � redimensionada conforme necess�rio para
		// acomodar novos elementos.

		for (int i = 0; i < 5; i++) {
			lista.add(rd.nextInt(80));
		}
		System.out.println("\nLista = " + lista);
		System.out.println("Tamanho da Lista = " + lista.size());

		// De forma similar ao vetor, os elementos da lista tamb�m
		// podem ser acessados pelos seus �ndices, atrav�s do m�todo get().
		// O primeiro elemento de um lista tem �ndice ZERO e seu
		// tamanho total � obtido pelo m�todo size().
		for (int i = 0; i < lista.size(); i++) {
			int num = lista.get(i);
			System.out.printf("%d ", num);
		}
		System.out.println();

		// Tamb�m como um vetor, podemos usar o for otimizado para ler
		// os elementos da lista, quando o �ndice n�o for relevante.
		for (int x : lista) {
			System.out.printf("%d ", x);
		}
		System.out.println();

		// � poss�vel inserir um elemento em qualquer posi��o dispon�vel
		// na lista, o que provoca o deslocamento dos demais elementos.

		// Inserindo o elemento 999 na posi��o 0:
		lista.add(0, 999);
		System.out.println("\nLista = " + lista);
		System.out.println("Tamanho da Lista = " + lista.size());
		// Inserindo o elemento 888 na posi��o 5:
		lista.add(5, 888);
		System.out.println("\nLista = " + lista);
		System.out.println("Tamanho da Lista = " + lista.size());

		// Assim como � poss�vel inserir, tamb�m podemos remover
		// posicionalmente um elemento da lista, o que novamente
		// provoca o reposicionamento dos itens restantes.

		// Removendo o elemento da posi��o 0 e retornando-o em uma vari�vel:
		int removido = lista.remove(0);
		System.out.println("\nLista = " + lista);
		System.out.println("Elemento removido = " + removido);
		System.out.println("Tamanho da Lista = " + lista.size());

		// Al�m de remover um elemento de uma posi��o espec�fica,
		// � poss�vel remover a primeira ocorr�ncia de um elemento
		// que contenha um determinado VALOR:
		if (lista.remove(Integer.valueOf(888))) {
			System.out.println("\nLista = " + lista);
			System.out.println("Tamanho da Lista = " + lista.size());
		}

		if (!lista.remove(Integer.valueOf(123456))) {
			System.out.println("\nElemento 123456 n�o foi localizado para remo��o.");
		}

		// � poss�vel alterar um elemento da lista, indicando a
		// posi��o a alterar e o valor, com o m�todo set().

		// Alterando a posi��o 2 para o valor 5000:
		lista.set(2, 5000);
		System.out.println("\nLista = " + lista);
		System.out.println("Tamanho da Lista = " + lista.size());

		// Pode-se perguntar para a lista se ela cont�m um
		// determinado valor, atrav�s do m�todo contains():
		if (lista.contains(55)) {
			System.out.println("\nO elemento 55 foi localizado na lista.");
		} else {
			System.out.println("\nO elemento 55 n�o foi localizado na lista.");
		}

		// Tamb�m podemos descobrir a posi��o da primeira ocorr�ncia de um
		// elemento que contenha o valor procurado, com o m�todo indexOf():
		int pos = lista.indexOf(55);
		if (pos >= 0) {
			System.out.println("O valor 55 est� na posi��o " + pos);
		}

		// Uma lista pode ser facilmente ordenada de forma ascendente
		// ou descendente usando o m�todo sort() da classe Collections:
		Collections.sort(lista);
		System.out.println("\nLista crescente = " + lista);

		Collections.sort(lista, Collections.reverseOrder());
		System.out.println("Lista decrescente = " + lista);

		// Para eliminar todos os elementos da lista,
		// utiliza-se o m�todo clear():
		lista.clear();
		System.out.println("\nLista = " + lista);
		System.out.println("Tamanho da Lista = " + lista.size());

		if (lista.isEmpty()) {
			System.out.println("A lista n�o cont�m elemento algum.");
		}

		// Quando nada � especificado no construtos, os ArrayLists s�o
		// criados com a capacidade default de 10 elementos.
		// Quando tentarmos adicionar o 11� elemento, a estrutura interna
		// de armazenamento ser� redimensionada para se adequar � necessidade.

		// Quando sabemos previamente o tamanho da lista, podemos criar
		// o objeto j� com a capacidade desejada, passando um par�metro
		// para o construtor. Por exemplo, para reservar 35 posi��es:

		lista = new ArrayList<Integer>(35);

		// Dessa forma, a estrutura interna (que na verdade � um Array
		// convencional) ser� redimensionada apenas se forem inseridos
		// mais do que 35 elementos.

	}

}
