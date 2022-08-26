//Crie um algoritmo que leia um número e mostre o seu dobro, triplo e raiz quadrada.

package ExercicioExtras;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04TreinandoCriacaoDeMetodos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		System.out.print("Informe um valor para ver o DOBRO, TRIPLO e sua RAIZ QUADRADA: ");
//		Double valor = scanner.nextDouble();
		Double valor = infomeOValorParaOCalculo(scanner);
		
//		Double dobro = valor * 2;
//		Double triplo = valor * 3;
//		Double raizQuadrada = Math.sqrt(valor);
		Double dobro = calculaODobro(valor);
		Double triplo = calculaOTriplo(valor);
		Double raizQuadrada = calculaARaizQuadrada(valor);

//		System.out.println("Valor informado foi: " + valor + "\nO Dobro é: " + dobro + "\nO Triplo é: " + triplo + "\nA Raiz Quadrada é: " + raizQuadrada);
		apresentaResultado(valor, dobro, triplo, raizQuadrada);
		
		scanner.close();
	}
	static double infomeOValorParaOCalculo(Scanner scanner) {
		System.out.print("Informe um valor para ver o DOBRO, TRIPLO e sua RAIZ QUADRADA: ");
		return scanner.nextDouble();		
	}
	static double calculaODobro(Double valor) {
		return valor * 2;
	}
	static double calculaOTriplo(Double valor) {
		return valor * 3;
	}
	static double calculaARaizQuadrada(Double valor) {
		return Math.sqrt(valor);
	}
	static void apresentaResultado(Double valor, Double dobro, Double triplo, Double raizQuadrada) {
		System.out.println("Valor informado foi: " + valor + "\nO Dobro é: " + dobro + "\nO Triplo é: " + triplo + "\nA Raiz Quadrada é: " + new DecimalFormat("#,###00").format(raizQuadrada));
	}

	
}
