package EscritaArquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EscritaArquivos {
	
// Criação do arquivo incluindo o conteudo via inicialização do array(linhas.add("Linha Um");) 
//	public static void main(String[] args) throws IOException {
//		
//		ArrayList<String> linhas = new ArrayList<String>();
//		linhas.add("Linha Um");
//		
//		Path arquivo = Paths.get("C:\\Users\\Márcio\\eclipse-workspace\\CursoLogicacapitulo10\\src\\EscritaArquivos\\meu-aquivo.txt");
//		Files.write(arquivo, linhas);
//		
//		
//		System.out.println("Fim do programa....");
//		
//		
//	}
	
	//
	
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> linhas = new ArrayList<String>();
		
		for (int i = 1; i < 6; i++) {
			System.out.print("Jogador " + i + ": ");
			
			String nome = scanner.nextLine();
			linhas.add(nome);
		}
		
		Path arquivo = Paths.get("C:\\Users\\Márcio\\eclipse-workspace\\CursoLogicacapitulo10\\src\\EscritaArquivos\\meu-aquivo-2.txt");
		Files.write(arquivo, linhas);
		

		scanner.close();
		System.out.println("Fim do programa....");
	}
}
