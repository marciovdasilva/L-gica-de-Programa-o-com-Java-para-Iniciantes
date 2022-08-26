package ExercicioCapitulo5;

/*Crie um programa que vai receber um número que será referente ao dia da semana (de 1 até 7). 
 * Dependendo do número informado você deve imprimir o nome desse dia.
 * 
 * Se o número 1 for informado, então deverá ser impresso "domingo", se 2, então "segunda-feira" e por ai vai.*/

import java.util.Scanner;

public class Exercicio03ImprimaONomeDoDiaDaSemanaDomingoSegundaFeiraEtc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe um numero de 1 a 7: ");
		Integer diaDaSemana = scanner.nextInt();
		
		switch (diaDaSemana) {
		case 1: 
			System.out.println("Domingo");
			break;
		case 2: 
			System.out.println("Segunda-Feira");
			break;
		case 3: 
			System.out.println("Terça-Feira");
			break;
		case 4: 
			System.out.println("Quarta-Feira");
			break;
		case 5: 
			System.out.println("Quinta-Feira");
			break;
		case 6:
			System.out.println("Sexta-Feira");
			break;
		case 7: 
			System.out.println("Sabado");
			break;
		default:
			System.out.println("Numero invalido");
			System.exit(1);
		}
		
		scanner.close();
	}

}
