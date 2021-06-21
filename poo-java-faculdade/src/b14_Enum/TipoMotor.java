package aulas.a15;

public enum TipoMotor {

	// Enumera��es permitem listar as op��es v�lidas para um tipo,
	// semelhante a um agrupamento de constantes.
	// Isso permite restringir os valores poss�veis para uma
	// vari�vel do tipo da enumera��o, contribuindo para a robustez do c�digo.

	COMBUSTAO("Combust�o"),
	ELETRICO("El�trico"),
	HIBRIDO("H�brido");

	private final String nome;

	// O contrutor � privado e pega seus par�metros a partir da
	// declara��o de cada um dos valores v�lidos para a enumera��o.

	private TipoMotor(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return nome;
	}
}
