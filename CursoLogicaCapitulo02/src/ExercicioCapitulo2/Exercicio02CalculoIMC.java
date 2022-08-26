package ExercicioCapitulo2;

import java.text.DecimalFormat;
import java.util.Scanner;

/*O �ndice de massa corporal, mais conhecido pela sigla IMC, � um �ndice adotado pela OMS (Organiza��o Mundial de Sa�de), 
 * que � usado para o diagn�stico do sobrepeso e da obesidade. O IMC pode ser facilmente calculado a partir de dois simples dados: 
 * peso e altura.
 * A f�rmula para o seu c�lculo eu vou passar aqui pra voc� e sua miss�o � criar um pequeno programa que fa�a esse c�lculo automaticamente. 
 * Veja aqui a f�rmula:
 * IMC = PESO / (ALTURA * ALTURA) Lembrando que o peso � em quilogramas e a altura � em metros.
 * A primeira coisa a se fazer � declarar duas vari�veis que v�o receber o peso e a altura, respectivamente. 
 * Esses dois valores ser�o informados pelo usu�rio - da mesma forma como fizemos na aula anterior.
 * Depois dessas duas vari�veis, vai ser preciso declarar uma terceira que vai guardar o resultado da multiplica��o da 
 * altura por ela mesma (� a parte "ALTURA * ALTURA" da f�rmula acima).
 * Agora basta dividir o peso pela multiplica��o que foi feita. O resultado dessa divis�o j� ser� o final. 
 * Guarde o resultado dessa divis�o em uma quarta vari�vel que ser� utilizada para exibir para o usu�rio.*/

public class Exercicio02CalculoIMC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe sua Altura(ex: 1,75): ");
		Double altura = scanner.nextDouble();
		
		System.out.print("Informe seu Peso(ex: 75,00): ");
		Double peso = scanner.nextDouble();
		
		Double resultado = peso / (altura * altura);
		
		System.out.print("Seu IMC �: " + new DecimalFormat("#,##0.00").format(resultado));
		
		if (resultado < 18.5) {
			System.out.println(" Magreza( Imc < 18.5, Peso < 74 Kg)\n");
		}else if (resultado >= 18.5 & resultado < 24.9) {
			System.out.println(" Normal(Imc 18.5 a 24.9, Peso 74 a 99.6 Kg)\n");
		}else if (resultado >= 24.9 & resultado < 30.0) {
			System.out.println(" Sobrepeso(Imc 24.9 a 30, Peso 99.6 a 120 Kg)\n");
		}else {
			System.out.println(" Obesidade(Imc > 30, Peso > 120 Kg)");
		}
		scanner.close();
	}
}
