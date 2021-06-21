package aulas.a25.aparelhos.app;

import java.util.ArrayList;

import aulas.a25.aparelhos.modelagem.Aparelho;
import aulas.a25.aparelhos.modelagem.BluRay;
import aulas.a25.aparelhos.modelagem.Televisor;

public class AppMain {

	public static void main(String[] args) {

		// Ap�s declarar uma classe como abstrata,
		// n�o � mais poss�vel instanci�-la.
		// Descomentar a linha abaixo gera erro de compila��o:

		// Aparelho aaa = new Aparelho("Aparelho","abstrato");

		// Polimorfismo � a capacidade de a linguagem
		// lidar com objetos de classes diferentes
		// como se fossem da mesma classe.

		// Para isso, tais objetos devem possuir caracter�sticas
		// em comum a partir de algum tipo de heran�a.

		// Nestes exemplos, tanto o Televisor quanto
		// o Bluray s�o subclasses de Aparelho, o que
		// permite que ambos sejam tratados como a superclasse.
		// Dessa forma, � poss�vel armazenar refer�ncias a
		// objetos "subclasse" em vari�veis "superclasse":

		Aparelho ap1 = new Televisor("tv a", "mod a1", 33);
		Aparelho ap2 = new BluRay("bluray b", "mod br1");

		// Ao tratar objetos atrav�s de polimorfismo, ficam
		// dispon�veis apenas os m�todos comuns � classe que cont�m
		// as refer�ncias. Neste caso, os m�todos da classe Aparelho:

		System.out.println("ap1 = " + ap1.getMarca() + " - " + ap1.getModelo());
		System.out.println("ap2 = " + ap2.getMarca() + " - " + ap2.getModelo());

		ap1.onOff();

		// Apesar de armazenados em uma vari�vel de classe diferente daquela
		// em que foram criados, cada objeto sabe a qual classe pertence:

		System.out.println("Classe de ap1: " + ap1.getClass().getSimpleName());
		System.out.println("Classe de ap2: " + ap2.getClass().getSimpleName());

		// Por conhecerem as classes a que pertencem, os objetos
		// respondem corretamente ao m�todo equals():

		System.out.println("ap1 � equivalente ao ap2? --> " + ap1.equals(ap2));

		// Para poder acessar os m�todos do objetos que est�o
		// definidos em sua classe original, � necess�rio fazer
		// um 'cast' para o tipo correto, semelhante aos tipos num�ricos.

		// O operador instanceof verifica se uma refer�ncia �
		// compat�vel com uma determinada classe:

		if (ap1 instanceof Televisor) {
			Televisor ap3 = (Televisor) ap1;
			System.out.println("Classe de ap3: " + ap3.getClass().getSimpleName());
			ap3.canalMais();
			System.out.println("A TV est� no canal " + ap3.getCanal());
			ap3.onOff();
		}

		if (ap2 instanceof BluRay) {
			BluRay ap4 = (BluRay) ap2;
			System.out.println("Classe de ap4: " + ap4.getClass().getSimpleName());
			ap4.eject();
		}

		// A atribui��o direta de uma refer�ncia de superclasse
		// para uma vari�vel de subclasse n�o � permitida e
		// gera um erro de compila��o:

		// Televisor umaTV = ap1;

		// Fazer cast para um tipo incompat�vel n�o gera erro de compila��o,
		// mas gera uma exce��o ao tentar chamar um m�todo:

		// BluRay umBR = (BluRay) ap1;
		// umBR.onOff(); // ClassCastException

		// Um uso comum de polimorfismo � o armazenamento
		// de objetos de diferentes tipos em cole��es
		// de tipos compat�veis:

		ArrayList<Aparelho> lista = new ArrayList<>();

		Televisor tv;
		BluRay br;

		tv = new Televisor("Sony", "Bravia", 40);
		lista.add(tv);

		tv = new Televisor("LG", "LXX", 50);
		lista.add(tv);

		br = new BluRay("Philips", "BR-400");
		lista.add(br);

		br = new BluRay("Philco", "P900");
		lista.add(br);

		// � poss�vel percorrer a lista de aparelhos e ligar
		// todos eles, independentemente do tipo original,
		// pois o m�todo onOff() est� na classe Aparelho:

		for (Aparelho aa : lista) {
			aa.onOff();
		}

		// Tamb�m � poss�vel verificar o tipo de cada aparelho
		// e chamar m�todos espec�ficos:

		for (Aparelho aa : lista) {
			if (aa instanceof Televisor) {
				tv = (Televisor) aa; // Podemos fazer o cast para uma vari�vel...
				tv.setCanal(123);
			} else if (aa instanceof BluRay) {
				((BluRay) aa).eject(); // ...ou anonimamente (sem vari�vel).
			}
			aa.onOff();
		}

	}

}
