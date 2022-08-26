package ExercicioDeAula;

import java.util.Scanner;

public class Recursividade {
		
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
		/*METODO SEM RECURSIVIDADE*/
		static void iterarEExibirPosicoesDoVetorString(String[] vetor) {
			iterarEExibirPosicoesDoVetorString(vetor, 0);
			//Com for
			/*for(int i = 0; i < vetor.length; i++) {
				imprimir("[" + i + "] " + vetor[i]);
			}*/
		}
		
		/*METODO COM RECURSIVIDADE*/
		static void iterarEExibirPosicoesDoVetorString(String[] vetor, Integer i) {
			
			imprimir("[" + i + "] " + vetor[i]);
			
			if (++i < vetor.length) {
				iterarEExibirPosicoesDoVetorString(vetor,i); 
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
		
		//EX01 imprimirNumero(0);
		
		//EX02
		//String[] alunos = new String[] {"Marcio", "Lucelia", "Gabriel", "Miguel", "Rafael"};
		//iterarNomes(alunos, 0);
		
	//}
	//EX02
	// com for: static void iterarNomes(String[] alunos) {
	/*static void iterarNomes(String[] alunos, Integer i) {	
		
		Com recursividade
		
		System.out.println("Aluno: " + alunos[i]);
		//++i; pode ser feita fora ou dentro do if, mas não no metodo
		if (++i < alunos.length) {
			iterarNomes(alunos, i);
		}
		
		 Com for
		 for (int i = 0; i < alunos.length; i++) {
			System.out.println("Aluno: " + alunos[i]);
		}
	}*/
	
	
	/*EX01 a recursividade funciona com um laço
	static void imprimirNumero(Integer numero) {
		System.out.println("Número: " + numero);
		
		if (numero < 10) {
			imprimirNumero(++numero);			
		}

	}*/
}
