package ExercicioCapitulo4;

import java.util.Scanner;

/*Para criar uma calculadora simples você vai precisar receber três informações pelo console. 
 * São os dois números que participarão da operação e também a operação que será realizada.
 * 
 * Você vai receber o primeiro número, depois vai receber qual é a operação e, por último, o segundo número.
 * 
 * Para os números que você vai receber pelo console, pode utilizar a mesma funcionalidade que já utilizamos aqui no curso - o *Scanner*. 
 * Para receber a operação você pode receber também um número que vai indicar a mesma. Por exemplo, o número 1 será adição, o 2 subtração, 
 * o 3 multiplicação e o 4 divisão.
 * 
 * Com esses três valores - os dois números e qual será a operação - você pode utilizar a estrutura de decisão if para só realizar a 
 * operação que o usuário escolheu. Se estiver com dúvidas, então volte a aula onde falamos sobre alteração do valor de uma variável - 
 * aula 3.10.*/

public class Exercicio01CalculadoraSimples {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o primeiro valor: ");		
		Double valorUm = scanner.nextDouble();

		System.out.print("Operação [1 = + | 2 = - | 3 = * | 4 = /]: ");
		Integer operadorAritmetico = scanner.nextInt();

		System.out.print("Informe o segundo valor: ");		
		Double valorDois = scanner.nextDouble();
		
		Double resultado = 0.00;
		
		if (operadorAritmetico.equals(1)) {
			resultado = valorUm + valorDois;
		}if (operadorAritmetico.equals(2)) {
			resultado = valorUm - valorDois;
		}if (operadorAritmetico.equals(3)) {
			resultado = valorUm * valorDois;
		}if (operadorAritmetico.equals(4)){
			resultado = valorUm / valorDois;
		}
		System.out.println("Resultado: " + resultado);
		
		scanner.close();
	}
}
