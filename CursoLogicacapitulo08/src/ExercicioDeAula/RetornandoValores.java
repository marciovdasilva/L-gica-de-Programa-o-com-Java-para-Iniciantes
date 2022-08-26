package ExercicioDeAula;

import java.util.Scanner;

public class RetornandoValores {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"};
		
		imprimir("Escolha dentre os cursos abaixo:");
		
		iterarEExibirPosicoesDoVetorString(cursos);

		Integer posicaoCursoEscolhido = receberNumeroInteiroDoUsuario("O curso que você deseja é o: ", scanner);
		
		Boolean posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoCursoEscolhido, cursos);
		
		if (!posicaoValida) {
			posicaoValidaDoCurso();
		}
		
		imprimirTraco();
		
		String[] formasPagamento = new String[] {"Cartão", "Boleto"};
		
		imprimir("Escolha dentre as formas de pagamento abaixo: ");
		
		iterarEExibirPosicoesDoVetorString(formasPagamento);

		Integer posicaoFormaPagamentoEscolhida = receberNumeroInteiroDoUsuario("Sua forma de pagamento escolhida é: ", scanner);
		
		posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoFormaPagamentoEscolhida, formasPagamento);
		
		if (!posicaoValida) {
			posicaoValidaDoCurso();
		}
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimirTraco();
		
		imprimir("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);
		
		scanner.close();
	}
	
	static void imprimirTraco() {
		imprimir("----------------------------------------------");
	}
	static void posicaoValidaDoCurso(){
		System.err.println("Posição inválida!");
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
	static Boolean verificarPosicaoEscolhidaPeloUsuario(Integer posicao, String[] vetor) {
		Boolean valida = posicao >= 0 && posicao < vetor.length;
		return valida;
	}
	static Integer receberNumeroInteiroDoUsuario(String texto, Scanner scanner) {
		imprimirEContinuarNaMesmaLinha(texto);
		Integer numero = scanner.nextInt();
		
		return numero;
	}
	
	
	/*
	public static void main(String[] args) {
		Double[] premissaInicial = new Double[] {1.0, 100.0};
		Double proporcao = 20.0;
		
		Double resultoFinal = regraDeTres(premissaInicial, proporcao);
		
		
		System.out.println("Resultado: " + resultoFinal);
	}
	
	static Double regraDeTres(Double[] premissa, Double proporcao) {
		Double resultado = (premissa[0] * proporcao) / premissa[1];
		return resultado;
	}
	
   ------------------------------------------------------------------
	public static void main(String[] args) {
		Integer numeroQualquer = numeroAleatorio();
		System.out.println("Numero: " + numeroQualquer);
	}
	static Integer numeroAleatorio() {
		Integer numero = 1;
		return 1;
	}*/

}
