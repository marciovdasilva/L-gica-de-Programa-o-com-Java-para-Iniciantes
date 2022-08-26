//Faça um programa que leia um número Inteiro e mostre na tela o seu sucessor e seu antecessor.
package ExercicioExtras;

import java.util.Scanner;

public class Exercicio03TreinandoCriacaoDeMetodos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//System.out.print("Informe um valor: ");
		//Integer valor = scanner.nextInt();
		Integer valor = informaValor(scanner);
		
		//Integer anterior = valor -1;
		//Integer posterior = valor +1;
		Integer anterior = retornaValorAnterior(valor);
		Integer posterior = retornaValorPosterior(valor);
		
		//System.out.println("Anterior = " + anterior + " Valor = "+ valor+ " Posterior = "+posterior);
		apresentaMensagemComResultado(anterior, valor, posterior);
		
		scanner.close();
	}
	static Integer informaValor(Scanner scanner) {
		System.out.print("Informe um valor: ");
		return scanner.nextInt();		
	}
	static Integer retornaValorAnterior(Integer valor) {
		return valor -1;
	}
	static Integer retornaValorPosterior(Integer valor) {
		return valor +1;
	}
	static void apresentaMensagemComResultado(Integer anterior, Integer valor, Integer posterior) {
		System.out.println("Anterior = " + anterior + " Valor = "+ valor+ " Posterior = "+posterior);
	}

}
