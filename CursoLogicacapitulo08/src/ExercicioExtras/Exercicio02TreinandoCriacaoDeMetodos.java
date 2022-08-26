//Crie um programa que leia dois números e mostre a soma entre eles.

package ExercicioExtras;

import java.util.Scanner;

public class Exercicio02TreinandoCriacaoDeMetodos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//System.out.print("Informe o valor: ");
		//Double valorUm = scanner.nextDouble();
		Double valorUm = informaValorParaCalculo(scanner,"Informe o primeiro Valor: ");
		
		//System.out.print("Informe o valor: ");
		//Double valorDois = scanner.nextDouble();
		Double valorDois = informaValorParaCalculo(scanner,"Informe o segundo Valor: ");
		
		//Double resutado = valorUm + valorDois;
		Double resultado = resultadoDaConta(valorUm, valorDois);
		
		//System.out.println("O valor da "+valorUm+" + "+valorDois+" = "+ resultado);
		apresentaMensagemDeResultado(valorUm, valorDois, resultado);
		
		scanner.close();
	}
	static double informaValorParaCalculo(Scanner scanner, String texto) {
		System.out.print(texto);
		return scanner.nextDouble();
	}
	static double resultadoDaConta(Double valorUm, Double valorDois) {
		return valorUm + valorDois;
	}
	static void apresentaMensagemDeResultado(Double valorUm, Double valorDois, Double resultado) {
		System.out.println("O valor da "+valorUm+" + "+valorDois+" = "+ resultado);
	}

}
