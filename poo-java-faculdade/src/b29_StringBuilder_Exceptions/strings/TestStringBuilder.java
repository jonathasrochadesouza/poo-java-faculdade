package aulas.a33.strings;

public class TestStringBuilder {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder(); // conte�do vazio, 16 caracteres de capacidade
		StringBuilder sb2 = new StringBuilder(10); // conte�do vazio, 10 caracteres de capacidade
		StringBuilder sb3 = new StringBuilder("Conte�do textual"); // conte�do + 16 caracteres de capacidade

		System.out.printf("sb1: capacidade = %d, tamanho = %d.%n", sb1.capacity(), sb1.length());
		System.out.printf("sb2: capacidade = %d, tamanho = %d.%n", sb2.capacity(), sb2.length());
		System.out.printf("sb3: capacidade = %d, tamanho = %d.%n", sb3.capacity(), sb3.length());

		System.out.println("Conte�do de sb3: [" + sb3 + "]");
		sb3.setLength(5);
		System.out.println("Conte�do de sb3: [" + sb3 + "]");
		System.out.printf("sb3: capacidade = %d, tamanho = %d.%n", sb3.capacity(), sb3.length());
		sb3.ensureCapacity(256);
		System.out.printf("sb3: capacidade = %d, tamanho = %d.%n", sb3.capacity(), sb3.length());
		sb3.setLength(15); // Aumentando o tamanho al�m do conte�do de texto,
							// s�o adicionados caracteres nulos.
		System.out.println("Conte�do de sb3: [" + sb3 + "]");
		System.out.printf("sb3: capacidade = %d, tamanho = %d.%n", sb3.capacity(), sb3.length());
		sb3.reverse();
		System.out.println("Conte�do de sb3: [" + sb3 + "]");

		String s = new String("Feliz Anivers�rio!");

		System.out.println("Conte�do de sb1: [" + sb1 + "]");
		sb1.append("Algum texto");
		System.out.println("Conte�do de sb1: [" + sb1 + "]");
		sb1.append(' ').append(1000).append(s);
		System.out.println("Conte�do de sb1: [" + sb1 + "]");
		sb1.insert(16, " ** ");
		System.out.println("Conte�do de sb1: [" + sb1 + "]");
		sb1.deleteCharAt(18);
		System.out.println("Conte�do de sb1: [" + sb1 + "]");
		sb1.delete(11, 16);
		System.out.println("Conte�do de sb1: [" + sb1 + "]");

		StringBuilder sbx = new StringBuilder("algoritmos");
		StringBuilder sby = new StringBuilder("algoritmos");
		System.out.println(sbx.equals(sby)); // StringBuilder n�o sobrescreve equals()
		System.out.println(sbx.toString().equals(sby.toString()));
		
		// Compara��o de Performance StrinBuilder X String

		long inicio;
		double duracao;
		long tamanho = 200_000;
		double BILHAO = 1_000_000_000.0;

		// Concatena��o de Strings

		inicio = System.nanoTime();
		String st = "";
		for (int x = 0; x < tamanho; x++) {
			st = st + " ";
		}
		duracao = (System.nanoTime() - inicio) / BILHAO;
		System.out.println("Tempo String: " + duracao);

		// Concatena��o de StringBuilder

		inicio = System.nanoTime();
		StringBuilder sb = new StringBuilder("");
		for (int x = 0; x < tamanho; x++) {
			sb.append(" ");
		}
		duracao = (System.nanoTime() - inicio) / BILHAO;
		System.out.println("Tempo StringBuilder: " + duracao);
	}

}
