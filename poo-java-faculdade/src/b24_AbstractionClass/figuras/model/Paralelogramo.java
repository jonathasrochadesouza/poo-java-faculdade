package aulas.a26.figuras.model;

public abstract class Paralelogramo extends Figura2d {
	private double ladoA;
	private double ladoB;

	public Paralelogramo(String nome, double ladoA, double ladoB) {
		super(nome);
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}
	
	@Override
	public final double getPerimetro() {
		return 2 * (ladoA + ladoB);
	}
	
	@Override
	public final double getArea() {
		return ladoA * ladoB;
	}
	
	final double getLadoA() {
		return ladoA;
	}

	final double getLadoB() {
		return ladoB;
	}
	
}
