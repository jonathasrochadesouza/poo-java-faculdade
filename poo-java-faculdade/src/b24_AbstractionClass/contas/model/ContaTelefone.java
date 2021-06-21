package aulas.a25.contas.model;

import java.util.Objects;

public class ContaTelefone extends Conta {

	private int minutosLocais;
	private int minutosLongaDistancia;

	public ContaTelefone(Consumidor consumidor, double valorDevido, int minutosLocais, int minutosLongaDistancia) {
		super(consumidor, valorDevido);
		this.minutosLocais = minutosLocais;
		this.minutosLongaDistancia = minutosLongaDistancia;
	}

	@Override
	public void imprimir() {
		System.out.println("Conta Telef�nica");
		System.out.println("Consumidor: " + this.getConsumidor().getNome());
		System.out.println("Minutos em liga��es locais: " + this.minutosLocais);
		System.out.println("Minutos em liga��es de longa dist�ncia: " + this.minutosLongaDistancia);
		System.out.println("Valor a pagar: R$ " + this.getValorDevido());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getConsumidor(), minutosLocais, minutosLongaDistancia);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		ContaTelefone outraConta = (ContaTelefone) obj;
		return minutosLocais == outraConta.minutosLocais && //
				minutosLongaDistancia == outraConta.minutosLongaDistancia && //
				getValorDevido() == outraConta.getValorDevido() && //
				Objects.equals(getConsumidor(), outraConta.getConsumidor());
	}

}
