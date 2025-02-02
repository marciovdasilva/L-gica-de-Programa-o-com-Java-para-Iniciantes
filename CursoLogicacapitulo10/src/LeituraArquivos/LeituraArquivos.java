package LeituraArquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class LeituraArquivos {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		Path arquivo = Paths.get("C:\\Users\\M�rcio\\eclipse-workspace\\CursoLogicacapitulo10\\src\\Exercicio01CrieUmaListaDeTarefasESalveAListaEmUmArquivo\\meu-aquivo-1.txt");
		
		List<String> linhas = Files.readAllLines(arquivo);
		
		System.out.println("Lista de atividade: \n");
		
		for (int i = 0; i < linhas.size(); i++) {
			String atividade = linhas.get(i);
			
			System.out.println("Atividade " + i +": "+ atividade);
		} 
		
		scanner.close();
	}
}
