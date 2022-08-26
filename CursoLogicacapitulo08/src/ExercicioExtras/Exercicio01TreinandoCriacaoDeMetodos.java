//Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas-vindas.

package ExercicioExtras;

import java.util.Scanner;

public class Exercicio01TreinandoCriacaoDeMetodos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//System.out.print("Informe seu nome: ");
		//String nome = scanner.next();
		String nome = solicitaNome(scanner);
		
		//System.out.println("Seja muito bem vindo "+ nome+"!!!");
		imprimeMensagem(nome);
		
		scanner.close();
	}
	static void imprimeMensagem(String texto) {
		System.out.println("Seja muito bem vindo "+ texto+"!!!");
	}
	static String solicitaNome(Scanner scanner) {
		System.out.print("Informe seu nome: ");
		return scanner.nextLine();
		
		//String next() - retorna uma cadeia de caracteres simples, ou seja, que não usa o caractere espaço em branco;
		//String nextLine() - retorna uma cadeia de caracteres, por exemplo: “DevMedia - Canal Java”;

	}
}
