package aulas.a13;

import java.util.ArrayList;
import java.util.Random;

public class ALAposta {

	private String nome;
	private ArrayList<Integer> numeros;

	public ALAposta(String nome, int tamanho) {
		this.nome = nome;
		// Inst�ncia preparada para a quantidade necess�ria de n�meros:
		this.numeros = new ArrayList<>(tamanho);

		Random rnd = new Random();
		int num;
		for (int i = 0; i < tamanho; i++) {
			do {
				num = 1 + rnd.nextInt(60); // Sortear um n�mero para a aposta ...
			} while (this.numeros.contains(num)); // ...at� n�o encontr�-lo na lista, ...
			this.numeros.add(num); // ...para somente ent�o inclu�-lo.
		}
	}

	public String getNome() {
		return nome;
	}

	// Retorna uma refer�ncia para a lista interna,
	// o que permite manipula��o externa do conte�do.
	// Ou seja, permite que os n�meros da aposta sejam alterados,
	// o que vai contra as regras do jogo.
	public ArrayList<Integer> getNumeros() {
		return numeros;
	}

	// Retorna uma refer�ncia para uma nova lista, que � uma c�pia da lista interna.
	// Qualquer altera��o externa feita nessa lista n�o vai refletir internamente.
	// Assim, o p�blico tem acesso aos n�meros, mas n�o consegue alterar a aposta.
	public ArrayList<Integer> getNumerosApostados() {
		return new ArrayList<Integer>(numeros);
	}

	// Sobrescrevendo o m�todo toString, herdado da classe Object:	
	@Override
	public String toString() {
		return nome + " " + numeros;
	}

}
