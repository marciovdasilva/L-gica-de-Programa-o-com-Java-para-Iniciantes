package ExercicioCapitulo3;

import java.util.Scanner;

/*Volte no exercício 03 desse capítulo e transforme o valor 70 em uma constante.*/

public class Exercicio05Constantes {
	
	/*Primeira modo de criar a constante*/
	static final Double NOTA_MINIMA_PARA_PASSAR_DE_ANO = 7.0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/*Segundo modo de criar a constante*/
		//final Double notaMinimaParaPassarDeAno = 7.0;
		
		System.out.print("Informe sua nota para saber se passou de ano: ");
		Double nota = scanner.nextDouble();
		
		Boolean notaFinal = nota >= NOTA_MINIMA_PARA_PASSAR_DE_ANO;
		
		if (notaFinal) {
			System.out.println("O aluno foi aprovado, com a nota "+ nota +".");
		}else {
			System.out.println("O aluno reprovou, com a nota "+ nota +".");
		}
		
		
		
		
	}
}
