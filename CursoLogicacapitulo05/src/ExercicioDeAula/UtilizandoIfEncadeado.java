package ExercicioDeAula;

import java.util.Scanner;

public class UtilizandoIfEncadeado {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o peso: ");
		Double peso = scanner.nextDouble();
		
		Boolean pesoLeve = (peso <= 60) && (peso > 0);
		Boolean pesoMedio = (peso > 60) && (peso <= 90);
		Boolean pesoPesado = peso > 90;
		
		if (pesoLeve) {
			System.out.println("O lutador(a) e peso leve. "+peso);
		}if (pesoMedio) {
			System.out.println("O lutador(a) e peso medio. "+peso);			
		}if (pesoPesado) {
			System.out.println("O lutador(a) e peso pesado. "+peso);
		}
		
		if (pesoLeve) {
			System.out.println("O lutador(a) e peso leve. "+peso);
		}else if (pesoMedio) {
			System.out.println("O lutador(a) e peso medio. "+peso);			
		}else if (pesoPesado) {
			System.out.println("O lutador(a) e peso pesado. "+peso);
		}else {
			System.out.println("O lutador(a) não se encaixa em categoria alguma. ");
		}
		
		scanner.close();
	}

}
