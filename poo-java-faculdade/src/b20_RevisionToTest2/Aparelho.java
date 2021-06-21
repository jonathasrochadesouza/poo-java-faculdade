package aulas.a20.eletronicos;

import java.util.Objects;

public class Aparelho {

	private String marca;
	private String modelo;

	private boolean ligado = false;

	public Aparelho(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public boolean isLigado() {
		return ligado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(marca, modelo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aparelho other = (Aparelho) obj;

		return Objects.equals(marca, other.marca) && //
				Objects.equals(modelo, other.modelo);

	}

	public void onOff() {
		ligado = !ligado;
		if (ligado) {
			System.out.println("Ligando o aparelho: " + toString());
		} else {
			System.out.println("Desligando o aparelho: " + toString());
		}
	}

	@Override
	public String toString() {
		return marca + "/" + modelo;
	}

}
