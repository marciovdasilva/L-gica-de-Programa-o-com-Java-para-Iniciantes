package ExercicioCapitulo2;

import java.text.DecimalFormat;
import java.util.Scanner;

/*O índice de massa corporal, mais conhecido pela sigla IMC, é um índice adotado pela OMS (Organização Mundial de Saúde), 
 * que é usado para o diagnóstico do sobrepeso e da obesidade. O IMC pode ser facilmente calculado a partir de dois simples dados: 
 * peso e altura.
 * A fórmula para o seu cálculo eu vou passar aqui pra você e sua missão é criar um pequeno programa que faça esse cálculo automaticamente. 
 * Veja aqui a fórmula:
 * IMC = PESO / (ALTURA * ALTURA) Lembrando que o peso é em quilogramas e a altura é em metros.
 * A primeira coisa a se fazer é declarar duas variáveis que vão receber o peso e a altura, respectivamente. 
 * Esses dois valores serão informados pelo usuário - da mesma forma como fizemos na aula anterior.
 * Depois dessas duas variáveis, vai ser preciso declarar uma terceira que vai guardar o resultado da multiplicação da 
 * altura por ela mesma (é a parte "ALTURA * ALTURA" da fórmula acima).
 * Agora basta dividir o peso pela multiplicação que foi feita. O resultado dessa divisão já será o final. 
 * Guarde o resultado dessa divisão em uma quarta variável que será utilizada para exibir para o usuário.*/

public class Exercicio02CalculoIMC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe sua Altura(ex: 1,75): ");
		Double altura = scanner.nextDouble();
		
		System.out.print("Informe seu Peso(ex: 75,00): ");
		Double peso = scanner.nextDouble();
		
		Double resultado = peso / (altura * altura);
		
		System.out.print("Seu IMC é: " + new DecimalFormat("#,##0.00").format(resultado));
		
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
