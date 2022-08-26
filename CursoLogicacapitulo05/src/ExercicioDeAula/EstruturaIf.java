package ExercicioDeAula;

import java.util.Scanner;

public class EstruturaIf {

	public static void main(String[] args) {
		Double emprestimo = 4000.0;
		Double movimentacaoMedia = 2000.0;
		
		Boolean movimentaPelaMenosMetadeDoValor = (movimentacaoMedia *2) >= emprestimo;
		Boolean aContaTemTempoSuficienteDeAbertura = true;
		Boolean temNomeLimpo = true;
		
		Boolean liberarEmprestimo = movimentaPelaMenosMetadeDoValor 
				&& aContaTemTempoSuficienteDeAbertura && temNomeLimpo;
		
		
		if (liberarEmprestimo) {
			System.out.println("Sim! Pode liberar emprestimo.");			
		}else {
			System.out.println("Nao pode liberar emprestimo.");			
		}
		
		

		
	}

}
