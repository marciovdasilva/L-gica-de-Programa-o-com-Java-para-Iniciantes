package ExercicioCapitulo8;

import java.util.Scanner;

public class Exercicio02IdentifiqueUmNovoPadraoNoAlgoritmoDaAulaPassada {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avan�ado"};
		
		imprimir("Escolha dentre os cursos abaixo:");
		
		iterarEExibirPosicoesDoVetorString(cursos);

		imprimirEContinuarNaMesmaLinha("O curso que voc� deseja � o: ");
		Integer posicaoCursoEscolhido = scanner.nextInt();
		
		Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length; 
		
		if (!posicaoValida) {
			posicaoValidaDoCurso();
		}
		
		imprimirTraco();
		
		String[] formasPagamento = new String[] {"Cart�o", "Boleto"};
		
		imprimir("Escolha dentre as formas de pagamento abaixo: ");
		
		iterarEExibirPosicoesDoVetorString(formasPagamento);

		imprimirEContinuarNaMesmaLinha("Sua forma de pagamento escolhida �: ");
		Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();
		
		posicaoValida = posicaoFormaPagamentoEscolhida >= 0 
				&& posicaoFormaPagamentoEscolhida < formasPagamento.length; 
		
		if (!posicaoValida) {
			posicaoValidaDoCurso();
		}
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimirTraco();
		
		imprimir("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento � " + formaPagamentoEscolhida);
		
		scanner.close();
	}
	
	static void imprimirTraco() {
		imprimir("----------------------------------------------");
	}
	static void posicaoValidaDoCurso(){
		imprimir("Posi��o inv�lida!");
		System.exit(1);
	}
	static void iterarEExibirPosicoesDoVetorString(String[] vetor) {
		for(int i = 0; i < vetor.length; i++) {
			imprimir("[" + i + "] " + vetor[i]);
		}
	}
	static void imprimir(String texto) {
		System.out.println(texto);
	}
	static void imprimirEContinuarNaMesmaLinha(String texto) {
		System.out.print(texto);
	}
}
