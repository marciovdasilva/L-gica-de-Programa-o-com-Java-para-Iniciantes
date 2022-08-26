package ExercicioDeAula;

public class TiposLogicos {
	public static void main(String[] args) {
		Boolean variavelVerdadeira = true;
		System.out.println("Variável verdadeira: "+variavelVerdadeira);
		
		Boolean variavelFalsa = false;
		System.out.println("Variável falsa: "+variavelFalsa);
		
		
		System.out.println("---------------------------------------------");
		
		Integer idade = 17;
		
		// System.out.println("Pode tirar CNH? "+ podeTirarCarteira);
		
		Boolean podeTirarCarteira = idade >= 18;
		
		if(podeTirarCarteira) {
			System.out.println("Sim! Ele(a) pode tirar CNH.");
		}else {
			System.out.println("Não! Ele(a) não pode tirar CNH.");
		}
		
		
		
		
	}
}
