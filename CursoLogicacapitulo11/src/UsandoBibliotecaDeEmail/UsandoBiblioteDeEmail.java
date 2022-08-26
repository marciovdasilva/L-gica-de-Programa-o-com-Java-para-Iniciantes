package UsandoBibliotecaDeEmail;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.commons.mail.EmailException;

public class UsandoBiblioteDeEmail {
	
	public static void main(String[] args) throws IOException, EmailException {
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
			contador++;
			
		}
		
		String tarefas = "";
		
		for (int iteracao = 0; iteracao < linhas.size(); iteracao++) {
			tarefas += linhas.get(iteracao) + "\n"; // Repare aqui a quebra de linha.
		}

		String mensagem = "Suas tarefas: \n" + tarefas; // Aqui também tem uma quebra de linha. Essa é a variável que vai ser enviada como o texto do e-mail.
		
		System.out.print("Digite seu e-mail: ");
		String para = scanner.next(); 
				
		Carteiro.enviar(para, "Sua lista de tarefas", mensagem);
		
		System.out.println("Fim...");
	}
		
}
