//Desenvolva um programa que leia as duas notas de um aluno, calcule e mostre a sua média.

package ExercicioExtras;

import java.util.Scanner;

public class Exercicio05TreinandoCriacaoDeMetodos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		System.out.print("Informe a nota: ");
//		Double notaUm = scanner.nextDouble();
		Double notaUm = informaNota(scanner);
		
//		if (notaUm < 0.00 || notaUm > 10.01) {
//			System.err.println("Nota fora da faixa valida.");
//			System.exit(0);
//		}
		validaNotaInformada(notaUm);
		
//		System.out.print("Informe a nota: ");
//		Double notaDois = scanner.nextDouble();
		Double notaDois = informaNota(scanner);
		
//		if (notaDois < 0.00 || notaDois > 10.01) {
//			System.err.println("Nota fora da faixa valida.");
//			System.exit(0);
//		}
		validaNotaInformada(notaDois);
		
//		Double media = (notaUm + notaDois) / 2;
//		
//		if (media <= 3.99) {
//			System.out.printf("Você reprovou :( sua nota foi %.2f.",media);
//		} 
//		else if (media >= 4.00 && media < 7.00) {
//			System.out.printf("Você esta de recuperação :| sua nota foi %.2f.",media);
//		}
//		else if (media >= 7.00 && media <= 10.0) {
//			System.out.printf("Parabens você passou de ano :) sua nota foi %.2f.",media);
//		}
//		
//		else {
//			System.err.print("Valor informado invalido!");
//		}
		calculoEApresentaAMediaDoAluno(notaUm, notaDois);
		
		scanner.close();
	}
	static double informaNota(Scanner scanner) {
		System.out.print("Informe a nota: ");
		return scanner.nextDouble();
	}
	static void validaNotaInformada(Double nota) {
		if (nota < 0.00 || nota > 10.01) {
			System.err.println("Nota fora da faixa valida.");
			System.exit(0);
		}
	}
	static void calculoEApresentaAMediaDoAluno(Double notaUm, Double notaDois) {
		Double media = (notaUm + notaDois) / 2;
		
		if (media <= 3.99) {
			System.out.printf("Você reprovou :( sua nota foi %.2f.",media);
		} 
		else if (media >= 4.00 && media < 7.00) {
			System.out.printf("Você esta de recuperação :| sua nota foi %.2f.",media);
		}
		else if (media >= 7.00 && media <= 10.0) {
			System.out.printf("Parabens você passou de ano :) sua nota foi %.2f.",media);
		}
		
		else {
			System.err.print("Valor informado invalido!");
		}
	}

}
