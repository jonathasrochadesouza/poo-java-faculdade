package aulas.a13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class IteradoresReferenciasOverride {

	public static void main(String[] args) {

		final int QT_APOSTAS = 100;

		System.out.printf("Simulando um concurso com %d apostas:%n%n", QT_APOSTAS);

		int qt;
		ALAposta ap;
		Random rd = new Random();

		// lista contendo todas as apostas simuladas:
		ArrayList<ALAposta> apostas = new ArrayList<>(QT_APOSTAS);
		for (int i = 0; i < QT_APOSTAS; i++) {
			qt = 6 + rd.nextInt(10);
			ap = new ALAposta("Aposta " + i + "/" + qt, qt);
			apostas.add(ap);
		}

		// Sorteia e exibe o resultado oficial do concurso:
		System.out.println("N�meros sorteados: " + ALConcurso.numerosSorteados());
		System.out.println();

		int[] resumo = new int[3]; // Totais por quantidade de acertos

		// Utilizando um Iterator para percorrer a lista de apostas.
		// Iterator � uma classe com recursos para navegar em uma cole��o de elementos.
		// O m�todo hasNext() nos diz se ainda existem elementos n�o lidos na cole��o.
		// O m�todo next() retorna o pr�ximo elemento n�o lido.

		Iterator<ALAposta> it = apostas.iterator();
		while (it.hasNext()) {
			ap = it.next();
			qt = ALConcurso.quantidadeAcertos(ap);
			if (qt >= 4) {
				System.out.println("" + qt + " acertos: " + ap);
				resumo[qt - 4]++;
			}
		}
		System.out.println();
		System.out.println("4 acertos: " + resumo[0] + " apostadores.");
		System.out.println("5 acertos: " + resumo[1] + " apostadores.");
		System.out.println("6 acertos: " + resumo[2] + " apostadores.");

		// O 'for' utilizado abaixo faz a mesma coisa que o iterator acima.
		// Esse tipo de for, quando aplicado em cole��es, tamb�m utiliza
		// um Iterator, por�m faz isso internamente, sem precisarmos declar�-lo.
		// N�o � poss�vel, por�m, usando esse 'for', alterar estruturalmente a cole��o.
		// Opera��es como add() e remove() provocam um erro no la�o.

		System.out.println();
		Arrays.fill(resumo, 0);
		for (ALAposta a : apostas) {
			qt = ALConcurso.quantidadeAcertos(a);
			if (qt >= 4) {
				System.out.println("" + qt + " acertos: " + a);
				resumo[qt - 4]++;
			}
			// apostas.remove(0); // provoca erro na pr�xima itera��o.
		}
		System.out.println();
		System.out.println("4 acertos: " + resumo[0] + " apostadores.");
		System.out.println("5 acertos: " + resumo[1] + " apostadores.");
		System.out.println("6 acertos: " + resumo[2] + " apostadores.");

		// Um Iterator permite alterar a cole��o enquanto a percorre.
		// O exemplo abaixo elimina da lista todas as apostas que tiveram
		// menos do que 4 acertos, deixando somente as que t�m direito � premia��o:

		Arrays.fill(resumo, 0);

		// Um Iterator n�o pode ser reutilizado. Para percorrer novamente
		// a cole��o, � necess�rio solicitar uma nova inst�ncia do iterador.
		it = apostas.iterator();
		while (it.hasNext()) {
			qt = ALConcurso.quantidadeAcertos(it.next());
			if (qt >= 4) {
				resumo[qt - 4]++;
			} else {
				it.remove();
			}
		}
		System.out.println();
		// exibindo conte�do restante da lista de apostas:
		System.out.println(apostas);

		System.out.println();
		System.out.println("4 acertos: " + resumo[0] + " apostadores.");
		System.out.println("5 acertos: " + resumo[1] + " apostadores.");
		System.out.println("6 acertos: " + resumo[2] + " apostadores.");

		System.out.println();
		// Imprimindo cada aposta vencedora:
		for (ALAposta a : apostas) {
			System.out.println(a); // chamada autom�tica de a.toString();
		}

		// Quando temos acesso � refer�ncia de um objeto,
		// podemos acessar qualquer um de seus m�todos p�blicos:
		System.out.println();
		ap = new ALAposta("Uma Aposta", 6);
		System.out.println(ap);
		ArrayList<Integer> nums = ap.getNumeros(); // refer�ncia da lista interna de n�meros
		nums.set(0, 99); // altera��o de um elemento da lista
		System.out.println(ap);
		ap.getNumeros().add(999); // inclus�o de um elemento na lista
		System.out.println(ap);

		System.out.println();
		ap = new ALAposta("Outra Aposta", 6);
		System.out.println(ap);
		nums = ap.getNumerosApostados(); // refer�ncia a uma c�pia da lista
		nums.set(0, 123);
		System.out.println(nums);
		System.out.println(ap); // as altera��es n�o s�o feitas internamente.
		ap.getNumerosApostados().add(1111);
		System.out.println(ap);

	}

}
