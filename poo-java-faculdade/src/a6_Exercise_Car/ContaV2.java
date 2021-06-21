package aulas.a06;

// Cada classe p�blica deve ser declarada em
// um arquivo .java com o mesmo nome da classe.

public class ContaV2 {

	// Em geral, atributos s�o privados:

	private String titular;

	// � poss�vel inicializar uma propriedade automaticamente:
	private double saldo = 0.0;

	// Os m�todos p�blicos oferecem formas de intera��o com o objeto.
	// Manter os atributos privados, portanto, fornece uma maneira
	// controlada de acesso e manipula��o do estado interno de um objeto.

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	// O saldo nunca � modificado diretamente, apenas atrav�s de m�todos
	// que aumentam ou diminuem seu valor, conforme a opera��o realizada:

	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
	}

	public void sacar(double valor) {
		if (valor > 0) {
			this.saldo -= valor;
		}
	}

}
