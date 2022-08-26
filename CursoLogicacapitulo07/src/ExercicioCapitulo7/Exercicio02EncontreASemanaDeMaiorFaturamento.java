package ExercicioCapitulo7;

import java.util.Iterator;

/*Repare nos vetores abaixo:
 * Double[] semanaUm = new Double[]{ 1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0 };
 * Double[] semanaDois = new Double[]{ 1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0 };
 * Double[] semanaTres = new Double[]{ 1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0 };
 * Double[] semanaQuatro = new Double[]{ 2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0 };
 * 
 * Double[][] mes = new Double[][] { semanaUm, semanaDois, semanaTres, semanaQuatro };
 * 
 * Os quatro primeiros vetores estão guardando o faturamento diário de cada semana e o último vetor, que é de 2 dimensões, 
 * guarda o faturamento mensal separado por semanas.
 * 
 * Crie um algoritmo que encontre qual a semana teve o maior faturamento. No final mostre qual foi essa semana e de quanto 
 * foi esse faturamento.*/

public class Exercicio02EncontreASemanaDeMaiorFaturamento {

	public static void main(String[] args) {
		
		Double[] semanaUm = new Double[]{ 1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0 };
		Double[] semanaDois = new Double[]{ 1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0 };
		Double[] semanaTres = new Double[]{ 500.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0 };
		Double[] semanaQuatro = new Double[]{ 100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0 };

		Double[][] mes = new Double[][] { semanaUm, semanaDois, semanaTres, semanaQuatro };
		
		Double maiorFaturamento = 0.0;                // Variavel sera usada para validar o maior fat, e armazenar o valor da semana ganhadora. 
		Integer semanaComMaiorFaturamentDoMes = null; // Variavel que guardara o valor da semana ganhadora.
		
		for (int i = 0; i < mes.length; i++) {        // For para varrer o vetor de duas posissoes.
			Double[] semana = mes[i];                 // Vetor que ira guardar os valores da semana.
			
			Double faturamentoSemana = 0.0;           // Valor total da semana.
			
			for (int j = 0; j < semana.length; j++) { // For para varrer o vetor de um posissão.
				faturamentoSemana += semana[j];       // Variavel que ira guardar o faturamento da semana do vetor. 
			}
			
			Boolean esteFaturamentoEMaior = faturamentoSemana > maiorFaturamento; // Variavel que ira validar o maior faturamento.
			
			if (esteFaturamentoEMaior) {              
				maiorFaturamento = faturamentoSemana;  // Variavel que ira armazenar o valor da semana com maior faturamento ao sair do for.
				semanaComMaiorFaturamentDoMes = i + 1; // Variavel apresentar o index da semana com maior faturamneto, porem com acrescimo de 1 para nao apresetar a semana zero.
			}
			
		}
		System.out.println("A semana " + semanaComMaiorFaturamentDoMes + " teve o maior faturamento e foi de " + maiorFaturamento);
		

	}

}
