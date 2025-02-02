package Exercicio02UseNossaBiblioteca;

import cosole.Interacao;

/* 11.6. Exerc�cio 02: Use nossa biblioteca
 * Sua tarefa agora � pegar a classe CalcularValorTroco do cap�tulo 2 e utilizar a nossa biblioteca 
 * AlgaWorksConsole ao inv�s da classe Scanner diretamente.*/

public class CalcularValorTroco {
	
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
		Interacao interacao = new Interacao();
		
//		System.out.print("Digite o valor do produto: ");
//		Double valorProduto = scanner.nextDouble();
		Double valorProduto = interacao.lerDecimal("Digite o valor do produto: ");
		
//		System.out.print("Digite quantidade passada pelo cliente: ");
//		Double valorPassadoPeloCliente = scanner.nextDouble();
		Double valorPassadoPeloCliente = interacao.lerDecimal("Digite quantidade passada pelo cliente: ");
		
		if (valorPassadoPeloCliente < valorProduto) {
//			System.err.print("FALTANDO DINHEIRO!!");
			interacao.erro("FALTANDO DINHEIRO!!");
		}
		else {
			Double resultado = valorPassadoPeloCliente - valorProduto;
			
//			System.out.println("Valor do troco � R$" + resultado);		
			interacao.imprimir("Valor do troco � R$" + resultado);
		}
		
//		scanner.close();
		interacao.fechar();
		
	}
}