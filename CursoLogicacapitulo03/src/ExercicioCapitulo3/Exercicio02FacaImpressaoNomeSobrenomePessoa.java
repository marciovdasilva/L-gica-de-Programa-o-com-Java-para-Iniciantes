package ExercicioCapitulo3;

import java.util.Scanner;

/*Crie um programa que l�, do console, o nome e o sobrenome de uma pessoa e depois imprime o nome completo. 
 * Para isso, voc� vai precisar de duas vari�veis: a primeira voc� pode chamar de "nome" e a segunda de "sobrenome". 
 * Por �ltimo, voc� vai juntar o nome e o sobrenome em uma �nica impress�o.*/

public class Exercicio02FacaImpressaoNomeSobrenomePessoa {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Informe seu sobrenome: ");
		String sobrenome = scanner.nextLine();
		
		String nomeCompleto = nome + " " + sobrenome;
		
		System.out.println(nomeCompleto);
		System.out.println(nome + " " + sobrenome);
		
	}
}
