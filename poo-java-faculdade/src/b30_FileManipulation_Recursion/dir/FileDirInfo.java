package aulas.a34.dir;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileDirInfo {

	public static void main(String[] args) throws IOException {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Informe o nome do arquivo ou diret�rio:");

		// cria um objeto Path baseado na entrada
		Path path = Paths.get(input.nextLine());

		if (Files.exists(path)) { // se o path existe, exibe as informa��es
			System.out.printf("%n%s existe%n", path.getFileName());
			System.out.printf("%s um diret�rio%n", Files.isDirectory(path) ? "�" : "N�o �");
			System.out.printf("%s um caminho absoluto%n", path.isAbsolute() ? "�" : "N�o �");
			System.out.printf("�ltima modifica��o: %s%n", Files.getLastModifiedTime(path));
			System.out.printf("Tamanho: %s%n", Files.size(path));
			System.out.printf("Caminho: %s%n", path);
			System.out.printf("Caminho absoluto: %s%n", path.toAbsolutePath());

			if (Files.isDirectory(path)) { // lista o conte�do caso seja um diret�rio
				System.out.printf("%nConte�do do diret�rio:%n");

				// objeto para iterar no conte�do
				DirectoryStream<Path> ds = Files.newDirectoryStream(path);
				
				for (Path p : ds) {
					System.out.println(p);
				}
			}
		} else {
			System.out.printf("%s n�o existe%n", path);
		}

	}

}
