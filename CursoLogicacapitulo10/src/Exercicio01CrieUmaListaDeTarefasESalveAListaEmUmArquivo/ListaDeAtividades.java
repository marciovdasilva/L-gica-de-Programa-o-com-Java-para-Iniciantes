package Exercicio01CrieUmaListaDeTarefasESalveAListaEmUmArquivo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeAtividades {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		Integer contador = 1;
		
		ArrayList<String> linhas = new ArrayList<String>();
		
		System.out.print("LISTA DE ATIVIDADE: \n\n\n");
		
		while (true) {	
			System.out.println("Insira sua atidade ou 'x' para finalizar a lista:");
			System.out.print("[ATIVIDADE " + contador + " ] " );
			String atividas = scanner.nextLine();

			if ("x".equals(atividas)) {
				break;
			}
			
			linhas.add(atividas);
		
			contador = contador + 1;
		}
		
		Path arquivo = Paths.get("C:\\Users\\Márcio\\eclipse-workspace\\CursoLogicacapitulo10\\src\\Exercicio01CrieUmaListaDeTarefasESalveAListaEmUmArquivo\\meu-aquivo-1.txt");
		Files.write(arquivo, linhas);
		
		scanner.close();
		
		System.out.println("Fim...");
	}

}
