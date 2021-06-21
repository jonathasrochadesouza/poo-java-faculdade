package aulas.a25.aparelhos.modelagem;

public class BluRay extends Aparelho {

	private String titulo;
	private int status = PARADO;

	private static final int PARADO = 0;
	private static final int EM_PAUSA = 1;
	private static final int TOCANDO = 2;

	public BluRay(String marca, String modelo) {
		super(marca, modelo);
	}

	public void inserirDisco(String titulo) {
		if (!isLigado()) {
			System.out.println("O aparelho est� desligado!");
			return;
		}
		if (this.titulo != null) {
			System.out.println("J� h� um disco no aparelho!");
			return;
		}
		if (titulo == null) {
			System.out.println("N�o h� disco para inserir!");
			return;
		}
		this.titulo = titulo;
		System.out.println("Disco inserido: " + titulo);
	}

	public void play() {
		if (!isLigado()) {
			System.out.println("O aparelho est� desligado!");
			return;
		}
		if (titulo == null) {
			System.out.println("N�o h� disco para reproduzir!");
			return;
		}
		if (status == TOCANDO) {
			System.out.println("O disco j� est� sendo reproduzido!");
		} else if (status == EM_PAUSA) {
			System.out.println("Continuando a reprodu��o do disco.");
		} else {
			System.out.println("Iniciando a reprodu��o do t�tulo " + titulo);
			status = TOCANDO;
		}
	}

	public void pause() {
		if (!isLigado()) {
			System.out.println("O aparelho est� desligado!");
			return;
		}
		if (titulo == null) {
			System.out.println("N�o h� disco no aparelho!");
			return;
		}
		if (status == TOCANDO) {
			System.out.println("Colocando o disco em pausa!");
			status = EM_PAUSA;
		} else if (status == EM_PAUSA) {
			System.out.println("Continuando a reprodu��o do disco.");
			status = TOCANDO;
		} else {
			System.out.println("O disco est� parado!");
		}
	}

	public void stop() {
		if (!isLigado()) {
			System.out.println("O aparelho est� desligado!");
			return;
		}
		if (titulo == null) {
			System.out.println("N�o h� disco no aparelho!");
			return;
		}
		if (status == TOCANDO || status == EM_PAUSA) {
			System.out.println("Interrompendo a reprodu��o do disco!");
			status = PARADO;
		} else {
			System.out.println("O disco est� parado!");
		}
	}

	public void eject() {
		if (isLigado()) {
			if (titulo == null) {
				System.out.println("N�o h� disco para ejetar!");
			} else {
				System.out.println("Ejetando o disco: " + titulo);
				status = PARADO;
				titulo = null;
			}
		} else {
			System.out.println("O aparelho est� desligado!");
		}
	}
}
