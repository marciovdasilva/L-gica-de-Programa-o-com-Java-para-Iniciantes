package ExercicioCapitulo7;

import java.util.Iterator;

/*Crie um sistema onde o usuário vai cadastrar, utilizando o console, as 5 tarefas mais importantes do dia dele. 
 * Armazene cada uma dessas tarefas em um vetor e, no final, imprima as tarefas novamente.*/

import java.util.Scanner;

public class Exercicio01CadastrandoAsTarefasDoDia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] tarefas = new String[6];
		
		for (int i = 1; i < tarefas.length; i++) {
			
			System.out.print("Informe sua tarefa N: "+ i + "/5: ");
			tarefas[i] = scanner.nextLine();
			
			//Não tinha conseguido fazer jogar direto para o vetor
			//String materia = scanner.nextLine();
			//tarefas[i] = materia;
		}
		
		System.out.println("\n-----------------------");
		System.out.println("----Lista de tarefas---\n");
		
		for (int i = 1; i < tarefas.length; i++) {
			System.out.println("[" + i + "]" + tarefas[i]);
			
		}
		
		scanner.close();

	}

}
