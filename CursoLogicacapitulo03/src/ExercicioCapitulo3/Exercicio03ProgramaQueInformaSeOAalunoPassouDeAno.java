package ExercicioCapitulo3;

import java.util.Scanner;

/*O seu programa deve receber a nota do aluno pelo console e depois voc� vai fazer uma opera��o l�gica para saber se a 
 * nota do aluno � maior que 70. O resultado dessa opera��o l�gica deve ser atribuido a uma vari�vel do tipo Boolean. Por �ltimo, 
 * voc� deve utilizar a vari�vel do tipo Boolean com a estrutura de decis�o if para imprimir, no console, uma mensagem que vai 
 * dizer se o aluno passou ou n�o passou.*/

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
