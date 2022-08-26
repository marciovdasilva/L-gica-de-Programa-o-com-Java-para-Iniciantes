package ExercicioDeAula;

import java.util.Scanner;

public class TipoTexto {
	public static void main(String[] args) {
		System.out.print("Informe seu nome: ");
		Scanner scanner = new Scanner(System.in);
		String nome = scanner.nextLine();
		
		//System.out.println(mensagemSaudacao);
		System.out.println("Olá " + nome +"!" );
		
		scanner.close();
		
		
		Character variavelChar = 'M';
		
	}
}
