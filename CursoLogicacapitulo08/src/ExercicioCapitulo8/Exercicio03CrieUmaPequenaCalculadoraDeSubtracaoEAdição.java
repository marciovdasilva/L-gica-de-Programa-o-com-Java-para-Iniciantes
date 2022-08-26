package ExercicioCapitulo8;

import java.util.Scanner;

public class Exercicio03CrieUmaPequenaCalculadoraDeSubtracaoEAdi��o {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Double primeiroNumero = informeNumero(scanner); 
		
		imprimirTraco();
		
		Integer operacao = escolhaOOperadorMatematico(scanner);
		
		validaOperador();
		
		imprimirTraco();
		
		Double segundoNumero = informeNumero(scanner); 

		imprimirTraco();
		
		Double resultado = realizarCalculo(operacao, primeiroNumero, segundoNumero);
		
		System.out.println("O resultado �: " + resultado);

		
		scanner.close();
	}
	/*posso passar a formula com o return*/
	static Double adicao(Double posicaoUm, Double posicaDois) {
		return posicaoUm + posicaDois;
	}
	static Double subtracao(Double posicaoUm, Double posicaDois) {
		return posicaoUm - posicaDois;
	}
	static Double multiplicacao(Double posicaoUm, Double posicaDois) {
		return posicaoUm * posicaDois;
	}
	static Double divisao(Double posicaoUm, Double posicaDois) {
		return posicaoUm / posicaDois;
	}

	static Double realizarCalculo(Integer operacao, Double primeiroNumero, Double segundoNumero) {
		Double resultado = null;
		
		switch (operacao) {

		case 0:
			/*para atribuir o valor na variavel resultado, passar o metodo e os parametro*/
			resultado = adicao(primeiroNumero, segundoNumero);
			break;
		case 1:
			resultado = subtracao(primeiroNumero, segundoNumero);
			break;
		case 2:
			resultado = multiplicacao(primeiroNumero, segundoNumero);
			break;
		case 3:
			if (segundoNumero != 0) {
				resultado = divisao(primeiroNumero, segundoNumero);
				break;
			} 
			else {
				System.err.println("N�o existe divis�o por ZERO.");
				
				break;
			}
		default:
			System.err.println("Opera��o inv�lida!");
		}
		return resultado;
	}
	
	static Integer escolhaOOperadorMatematico(Scanner scanner) {
		
		System.out.println("Escolha o operador do seu calculo:");
		
		String[] operadoresMatematico = new String[] {"Adicao", "Subtracao", "Multiplicacao", "divisao"};
		
		for (int i = 0; i < operadoresMatematico.length; i++) {
			System.out.println("[" + i + "]" + operadoresMatematico[i]);
		}
		
		System.out.print("Digite a opera��o: ");
		
		return scanner.nextInt();
	}
	
	static Double informeNumero(Scanner scanner) {
		System.out.print("Informe o numero: ");
		return scanner.nextDouble(); 
	}
	
	static void imprimirTraco() {
		System.out.println("----------------------------------------------");
	}
	static void validaOperador(){
		System.err.println("Posi��o inv�lida!");
		System.exit(1);
	}
	
}
