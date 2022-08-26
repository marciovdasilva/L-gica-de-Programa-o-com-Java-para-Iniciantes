package ExercicioCapitulo3;

import java.util.Scanner;

/*O seu programa deve receber a nota do aluno pelo console e depois você vai fazer uma operação lógica para saber se a 
 * nota do aluno é maior que 70. O resultado dessa operação lógica deve ser atribuido a uma variável do tipo Boolean. Por último, 
 * você deve utilizar a variável do tipo Boolean com a estrutura de decisão if para imprimir, no console, uma mensagem que vai 
 * dizer se o aluno passou ou não passou.*/

public class Exercicio03ProgramaQueInformaSeOAalunoPassouDeAno {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe sua nota para saber se passou de ano: ");
		Double nota = scanner.nextDouble();
		
		Boolean notaFinal = nota >= 7.0;
		
		if (notaFinal) {
			System.out.println("O aluno foi aprovado, com a nota "+ nota +".");
		}else {
			System.out.println("O aluno reprovou, com a nota "+ nota +".");
		}
		
		
		
		
	}
}
