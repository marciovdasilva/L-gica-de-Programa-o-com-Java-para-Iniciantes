package ExercicioDeAula;

import java.util.Iterator;

public class IteracaoFor {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + ": Uma Frase Qualquer");			
		}
		
		Double [] carrinhoDeCompras = new Double[]{50.0, 50.0, 50.0};
		Double total = 0.0;
		
		for (int i = 0; i < carrinhoDeCompras.length; i++) {//length o numero de itens do array 
			total = total + carrinhoDeCompras[i];
			System.out.println("SubTotal: "+total);
		}
		System.out.println("Total: "+total);	
		
		
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				System.out.println("Parou");
				break;
			}else {
				System.out.println("Iteracao"+ i);
			}
			
		}

		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				System.out.println("Vai continuar");
				continue;
			}else {
				System.out.println("Iteracao"+ i);
			}
			
		}

		Integer[] produtos = new Integer[] {100, 225, 300};
		
		for (int i = 0; i < produtos.length; i++) {
			Integer produto = produtos[i];
			
			System.out.println("Produto de codigo: "+produto);
			
			if (produto.equals(225)) {
				System.out.println("Produto encontrado!");
				break;
			}
		}
		
	}

}
