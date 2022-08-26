package ExercicioCapitulo6;

/*Faça o mesmo que você fez para o exercício 1, mas agora faça utilizando o laço "while".*/
/*Dada a lista de números abaixo:
 * 
 * Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
 * 
 * ... Itere por essa lista e imprima todos os números que são divisíveis por 3.
 * 
 * Para descobrir se um número é divisível por 3, você pode utilizar o operador módulo. Toda vez que o módulo de um 
 * número por 3 for igual a zero, então esse número e divisível por 3.*/

public class Exercicio02RepitaOExercicioAnteriorComOWhile {

	public static void main(String[] args) {
		Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		
		int i = 0;

		
		while (i < numeros.length) {
			Integer numero = numeros[i];
			Integer numeroDivTres = numeros[i] % 3;
			
			if (numeroDivTres.equals(0)) {
				System.out.println("Número " + numero + " é divisível por 3.");
			}else {
				
			}
			i++;
		}
		
		
	}

}
