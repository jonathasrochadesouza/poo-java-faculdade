package aulas.a06;

// Cada classe p�blica deve ser declarada em
// um arquivo .java com o mesmo nome da classe.

public class ContaV1 {

	// Em geral, atributos s�o privados:
	private String titular;

	// Os m�todos p�blicos oferecem formas de intera��o com o objeto.
	// Manter os atributos privados, portanto, fornece uma maneira
	// controlada de acesso e manipula��o do estado interno de um objeto.

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

}
