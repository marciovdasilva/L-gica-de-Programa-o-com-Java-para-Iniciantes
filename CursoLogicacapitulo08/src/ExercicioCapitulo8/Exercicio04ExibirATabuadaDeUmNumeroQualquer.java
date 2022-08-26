package ExercicioCapitulo8;

import java.util.Scanner;

public class Exercicio04ExibirATabuadaDeUmNumeroQualquer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o multiplicando para gerar a tabuada: ");
		Integer multiplicando = scanner.nextInt();

		imprimeTraco();

		//Esqueci de passar ZERO no parâmetro multiplicador.
		imprimirTabuada(multiplicando, 0);
		
		scanner.close();
	}
	
	static void imprimirTabuada(Integer multiplicando, Integer multiplicador) {
		//Integer resultado = multiplicando * multiplicador;
		//System.out.println("* " + multiplicando + " X " + multiplicador + " = " + resultado);
		System.out.println("* " + multiplicando + " X " + multiplicador + " = " + (multiplicando*multiplicador));
		
		if (++multiplicador <= 10) {
			imprimirTabuada(multiplicando, multiplicador);
		}
		
		++multiplicador;
	}
	static void imprimeTraco() {
		System.out.println("----------------------------------");
	}
	
}
