package ExercicioCapitulo4;

import java.util.Scanner;

/*Crie um programa que receba o valor de um produto e exiba o valor final da compra. 
 * Esse valor final será o valor do produto mais o valor do frete - use o valor do frete como R$15,00. 
 * Uma compra de, por exemplo, R$80,00, teria um valor final de R$95,00.
 * 
 * Agora, caso a compra seja maior ou igual a R$100,00, então não cobre o frete.*/

public class Exercicio02DescontoDeFreteEmComprasAcimaDe100 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o valor do produto: ");
		Double valorDoProduto = scanner.nextDouble();
		
		if (valorDoProduto < 100.00) {
			Double valorFinal = valorDoProduto + 15.00;
			System.out.println("Valor final do produto mais frete: R$"+valorFinal);
		}else {
			System.out.println("Valor final do produto(Frete Gratis): R$"+valorDoProduto);
		}
		
		scanner.close();
	}
}
