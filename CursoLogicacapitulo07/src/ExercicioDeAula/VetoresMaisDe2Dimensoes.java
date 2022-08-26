package ExercicioDeAula;

import java.util.Iterator;

public class VetoresMaisDe2Dimensoes {

	public static void main(String[] args) {
		//Variavel simples
		Double faturamentDoDia = 1000.0;
		
		//Vetor de um dimensao
		Double[] faturamentoDeJaneiro = new Double[] {1500.0, 2000.0, 1700.0};
		Double[] faturamentoDeFevereiro = new Double[] {2500.0, 3000.0, 2700.0};
		Double[] faturamentoDeMarco = new Double[] {3500.0, 4000.0, 3700.0};
		
		Double[][] faturamentoAnual = new Double[][] {faturamentoDeJaneiro, faturamentoDeFevereiro, faturamentoDeMarco};
		
		Double[][][] faturamentoQuinquenal = new Double[][][] {faturamentoAnual};
		
		Double[][][][] faturamentoDaDecada = new Double[][][][] {faturamentoQuinquenal};
		
//		for (int i = 0; i < faturamentoAnual.length; i++) {
//			System.out.println("Mes: " + (i + 1));
//			
//			for (int j = 0; j < faturamentoAnual[i].length; j++) {
//				Double dia = faturamentoAnual[i][j];
//				System.out.println("Dia " + ( j + 1) + ": " + dia);
//				
//			}
//		}
	}

}
