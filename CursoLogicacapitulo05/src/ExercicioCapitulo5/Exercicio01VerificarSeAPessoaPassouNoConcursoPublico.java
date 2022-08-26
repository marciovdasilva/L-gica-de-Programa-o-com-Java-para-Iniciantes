package ExercicioCapitulo5;

import java.util.Scanner;

/*Crie um programa que vai receber as notas que uma pessoa tirou nas duas materias de sua prova. 
 * Serão dois parâmetros para receber um para receber a nota de português e outro para receber as de matemática.
 * 
 * A prova, no total, vale 200 pontos - 100 para cada matéria. A nota mínima total para passar é igual ou maior que 150. 
 * Entretanto, o candidato não pode tirar menos do que 60 pontos em qualquer uma das duas matérias, ou seja, se tirar 59 em 
 * português e 100 em matemática (totalizando uma nota maior do que o total necessário que é 150) ele não conseguirá a vaga.
 * 
 * No final mostre para o candidato se ele conseguiu ou não.*/


public class Exercicio01VerificarSeAPessoaPassouNoConcursoPublico {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe a nota de PORTUGUES: ");
		Double notaDePortugues = scanner.nextDouble();
		
		System.out.print("Informe a nota de MATEMATICA: ");
		Double notaDeMatematica = scanner.nextDouble();
		
		Double notaGeral = notaDePortugues + notaDeMatematica;
		
		
		if (notaGeral <= 200) {
			if (notaDeMatematica <= 100 && notaDePortugues <= 100) {
				if (notaGeral >= 150) {
					System.out.println("Parabens! você foi APROVADO");
				}else {
					System.out.println("Não foi desta vez, continue tentando.");
				}
			}else {
				System.out.println("Nota maxima por materia é de 100.");
			}
		}else {
			System.out.println("Nota geral não pode ser maior que 200.");
		}
		
		
		
		
		
		scanner.close();
		
	}

}
