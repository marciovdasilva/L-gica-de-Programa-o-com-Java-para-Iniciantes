package ExercicioCapitulo5;

import java.util.Scanner;

/*Crie um programa que vai receber as notas que uma pessoa tirou nas duas materias de sua prova. 
 * Ser�o dois par�metros para receber um para receber a nota de portugu�s e outro para receber as de matem�tica.
 * 
 * A prova, no total, vale 200 pontos - 100 para cada mat�ria. A nota m�nima total para passar � igual ou maior que 150. 
 * Entretanto, o candidato n�o pode tirar menos do que 60 pontos em qualquer uma das duas mat�rias, ou seja, se tirar 59 em 
 * portugu�s e 100 em matem�tica (totalizando uma nota maior do que o total necess�rio que � 150) ele n�o conseguir� a vaga.
 * 
 * No final mostre para o candidato se ele conseguiu ou n�o.*/


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
					System.out.println("Parabens! voc� foi APROVADO");
				}else {
					System.out.println("N�o foi desta vez, continue tentando.");
				}
			}else {
				System.out.println("Nota maxima por materia � de 100.");
			}
		}else {
			System.out.println("Nota geral n�o pode ser maior que 200.");
		}
		
		
		
		
		
		scanner.close();
		
	}

}
