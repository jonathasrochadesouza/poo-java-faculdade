package aulas.a06;

// Cada classe p�blica deve ser declarada em
// um arquivo .java com o mesmo nome da classe.

public class ContaV3 {

	// Em geral, atributos s�o privados:

	private String titular;

	// � poss�vel inicializar uma propriedade automaticamente:
	private double saldo = 0.0;

	// Construtor da classe, inicializando o nome do titular:
	public ContaV3(String titular) {
		this.titular = titular;
	}

	// Construtor da classe, inicializando titular e saldo:
	public ContaV3(String titular, double saldo) {
		this.titular = titular;
		if (saldo > 0) {
			this.saldo = saldo;
		}
	}

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
