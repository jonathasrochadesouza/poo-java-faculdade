package objectsOrientation.b17_Equals_HashCode.pessoaV5;

import java.util.Objects;

public class Pessoa {

	private String nome;
	private int idade;

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public Pessoa(String nome, int idade) {
		this(nome);
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getIdade() {
		return this.idade;
	}

	public void oi() {
		System.out.println("Ol�, eu me chamo " + nome + " e tenho " + idade + " anos.");
	}

	// O m�todo equals() cont�m a implementa��o padr�o da linguagem para 
	// verificar se dois objetos s�o iguais. Essa implementa��o faz uma
	// compara��o de igualdade de refer�ncias, com o operador ==.
	
	// Para que possamos definir nossas pr�prias regras de compara��o
	// a fim de verificar se dois objetos devem ser considerados iguais,
	// precisamos sobrescrever o m�todo equals() nas classes necess�rias.
	
	// Aten��o para as regras 1, 2 e 3, do exemplo a seguir, pois elas
	// sempre devem ser seguidas em uma implementa��o do m�todo equals().

	@Override
	public boolean equals(Object outraPessoa) {

		// 1 - Um objeto comparado com null n�o pode resultar em igualdade.
		if (outraPessoa == null) {
			return false;
		}

		// 2 - Um objeto comparado consigo mesmo deve ser considerado igual.
		if (this == outraPessoa) {
			return true;
		}

		// 3 - Objetos de classes diferentes n�o s�o considerados iguais.
		if (this.getClass() != outraPessoa.getClass()) {
			return false;
		}

		Pessoa p = (Pessoa) outraPessoa;
		return Objects.equals(this.getNome(), p.getNome()) && //
				this.getIdade() == p.getIdade();
	}

	// De forma geral, sempre que sobrescrevemos o m�todo equals()
	// devemos tamb�m sobrescrever o m�todo hashCode() utilizando os mesmos
	// atributos que foram considerados na compara��o de igualdade.

	// Por defini��o da linguagem, dois objetos considerados iguais pelo equals()
	// deveriam retornar o mesmo valor ao chamar seus respectivos hashCode().

	// O contr�rio, por�m, n�o � obrigat�rio. � poss�vel que objetos considerados
	// "n�o iguais" retornem o mesmo hashCode().

	@Override
	public int hashCode() {
		return Objects.hash(this.getNome(), this.getIdade());
	}

}
