package ExercicioCapitulo4;

import java.util.Scanner;

/*Crie um programa que receba a idade de uma pessoa e a quantidade de tempo que essa pessoa contribuiu com a previd�ncia, 
 * depois verifique se ela pode aposentar ou n�o.
 * 
 * Nas regras desse programa a pessoa vai precisar ter, pelo menos, 55 anos e ter contribu�do com, pelo menos, 25 anos. 
 * Se ela passar nessas duas condi��es, ent�o mostre pra ela uma mensagem dizendo que ela pode aposentar.*/

public class Exercicio04VerificacaoDaPossibilidadeDeAposentadoria {
	
	static final Integer IDADE_MINIMA_PARA_APOSENTAR = 55;
	static final Integer CONTRIBUICAO_MINIMA = 25;
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Informe sua Idade: ");
	Integer idade = scanner.nextInt();
	
	System.out.print("Informe quantos anos de Contribuicao: ");
	Integer contribuicao = scanner.nextInt();
	
	
	Boolean tempoParaAposentar = idade >= IDADE_MINIMA_PARA_APOSENTAR; 
	
	Boolean tempoDeContribuicao = contribuicao >= CONTRIBUICAO_MINIMA;

	Boolean podeAposentar = tempoParaAposentar && tempoDeContribuicao;
	
	if (podeAposentar) { //tempoParaAposentar && tempoDeContribuicao na condicao
		System.out.print("Parabens! Voce pode se aposentar.");
	}else {
		System.out.print("Desculpe! Voce ainda n�o pode se aposentar.");
	}
		
		
	scanner.close();	
	}
}
