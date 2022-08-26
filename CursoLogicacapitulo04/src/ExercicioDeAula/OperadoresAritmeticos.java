package ExercicioDeAula;


/*Ordem de Precedencia:
 * Primeiro multiplicacao, divisao  e modulo. Havendo mais de um eles serão avaliados da esquerda para direita.
 * Por ultimo, adicao e subtracao. Tambem, havendo mais de um, eles serao avaliados da esquerda para a direita.*/

public class OperadoresAritmeticos {
	public static void main(String[] args) {
		Integer adicao = 1 + 1;
		System.out.println("Adicao: "+ adicao);
		
		Integer subtracao = 1 - 1;
		System.out.println("Subtracao:"+ subtracao);
		
		Integer multiplicacao = 2 * 2;
		System.out.println("Multiplicacao: "+ multiplicacao);
		
		Integer divisao = 4 / 2;
		System.out.println("Divisao:"+ divisao);
		
		Integer modulo = 7 % 4;
		System.out.println("Modulo:"+ modulo);
		
		Integer precedenciaUm = 1 + 1 * 5;
		System.out.println("Precedencia Um: "+ precedenciaUm);
		
		Integer precedenciaDois = (1 + 1) * 5;
		System.out.println("Precedencia Dois: "+ precedenciaDois);

		Integer precedenciaTres = 5 * (1 + 1);
		System.out.println("Precedencia Tres: "+ precedenciaTres);
		
		Integer precedenciaQuatro = 5 * (1 + 1) + 2;
		System.out.println("Precedencia Quatro: "+ precedenciaQuatro);
		
		Integer precedenciaCinco = 5 * ((1 + 1) + 2);
		System.out.println("Precedencia Cinco: "+ precedenciaCinco);
		
		Integer cinco = 5;
		Integer um = 1;
		Integer precedenciaVariaveis = cinco * (um + um);		
		System.out.println("Precedencia com Variaveis: "+ precedenciaVariaveis);
	}
}
