package ExercicioDeAula;

public class OperadoresAtribuicao {
	public static void main(String[] args) {
		Integer numeroA = 7;
		Integer numeroB = 7;
		Integer numeroC = 7;
		Integer numeroD = 7;
		Double numeroE = 7.00;
		Double numeroF = 7.00;
		
		numeroA = numeroA + 4;
		System.out.println("Numero + 4: "+numeroA);
		
		numeroB += 4;
		System.out.println("Numero += 4: "+numeroB);
		
		numeroC -= 4;
		System.out.println("Numero -= 4: "+numeroC);
		
		numeroD *= 4;
		System.out.println("Numero *= 4: "+numeroD);
		
		numeroE /= 4;
		System.out.println("Numero /= 4: "+numeroE);
		
		numeroF %= 4;
		System.out.println("Numero %= 4: "+numeroF);
	}
}
