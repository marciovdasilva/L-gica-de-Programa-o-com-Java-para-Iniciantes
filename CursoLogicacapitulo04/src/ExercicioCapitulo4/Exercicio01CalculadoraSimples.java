package ExercicioCapitulo4;

import java.util.Scanner;

/*Para criar uma calculadora simples voc� vai precisar receber tr�s informa��es pelo console. 
 * S�o os dois n�meros que participar�o da opera��o e tamb�m a opera��o que ser� realizada.
 * 
 * Voc� vai receber o primeiro n�mero, depois vai receber qual � a opera��o e, por �ltimo, o segundo n�mero.
 * 
 * Para os n�meros que voc� vai receber pelo console, pode utilizar a mesma funcionalidade que j� utilizamos aqui no curso - o *Scanner*. 
 * Para receber a opera��o voc� pode receber tamb�m um n�mero que vai indicar a mesma. Por exemplo, o n�mero 1 ser� adi��o, o 2 subtra��o, 
 * o 3 multiplica��o e o 4 divis�o.
 * 
 * Com esses tr�s valores - os dois n�meros e qual ser� a opera��o - voc� pode utilizar a estrutura de decis�o if para s� realizar a 
 * opera��o que o usu�rio escolheu. Se estiver com d�vidas, ent�o volte a aula onde falamos sobre altera��o do valor de uma vari�vel - 
 * aula 3.10.*/

public class Exercicio01CalculadoraSimples {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o primeiro valor: ");		
		Double valorUm = scanner.nextDouble();

		System.out.print("Opera��o [1 = + | 2 = - | 3 = * | 4 = /]: ");
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
