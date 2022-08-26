package ExercicioDeAula;

import java.util.Iterator;
import java.util.Scanner;

public class Verores1Dimensao {

	public static void main(String[] args) {
		String[] cardapio = new String[] {"Calabresa", "Atum", "Queijo", "Presunto"}; 

		System.out.println("Escolha o sabor: ");
		
		for (int i = 0; i < cardapio.length; i++) {
			System.out.println("[" + i + "]" + cardapio[i]);
			
		}
		
		Scanner scanner = new Scanner(System.in);
			
		
		System.out.print("Digite o numero referente ao sabor: ");
		Integer saborEscolhido = scanner.nextInt();
		
		System.out.println("Sabor escolhido foi: " + cardapio[saborEscolhido]);
		
		scanner.close();
		
		
		
//		//Alterar o valor de um index
//		String[] cardapiox = new String[] {"Calabresa", "Atum", "Queijo", "Presunto"}; 
//		cardapio[3] = "Frango";
//		
//		for (int i = 0; i < cardapiox.length; i++) {
//			System.out.println("[" + i + "]" + cardapiox[i]);
//			
//		}
		
		
		//Incluir valor depois
//		String[] cardapioa = new String[4]; 
//		cardapio[0] = "Calabresa";
//		cardapio[1] = "Atum";
//		cardapio[2] = "Queijo";
//		cardapio[3] = "Presunto";
//		
//		for (int i = 0; i < cardapioa.length; i++) {
//			System.out.println("[" + i + "]" + cardapioa[i]);
//		
//		}
		
	}

}
