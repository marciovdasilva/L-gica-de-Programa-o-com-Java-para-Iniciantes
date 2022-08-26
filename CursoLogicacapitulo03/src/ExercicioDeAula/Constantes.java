package ExercicioDeAula;

import java.util.Scanner;

public class Constantes {
	
	static final Integer IDADE_MINIMA_PARA_TIRAR_CARTEIRA = 18; //constante static
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//final Integer idadeMinimaParaTirarCarteira = 18; 
		//para declarar um constante deve ser informado o final no inicio.
		
		System.out.print("Idade :");
		Integer idade = scanner.nextInt();
		
		Boolean podeTirarCarteira = idade >= IDADE_MINIMA_PARA_TIRAR_CARTEIRA; //idadeMinimaParaTirarCarteira
		
		if(podeTirarCarteira) {
			System.out.println("Sim! Ele(a) pode tirar CNH.");
		}else {
			System.out.println("Não! Ele(a) não pode tirar CNH.");
		}
		
		
		scanner.close();
		
	}
}
