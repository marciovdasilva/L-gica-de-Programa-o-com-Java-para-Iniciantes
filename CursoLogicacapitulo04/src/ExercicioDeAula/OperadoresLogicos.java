package ExercicioDeAula;

public class OperadoresLogicos {

	public static void main(String[] args) {
		Boolean carrinhoMaiorQue100 = false;
		Boolean periodoDePromocao = false;
		Boolean jaFezCompraNaLoja = true;
		
		Boolean aplicarDescontoA = carrinhoMaiorQue100 && periodoDePromocao && jaFezCompraNaLoja;
		
		if (aplicarDescontoA) {
			System.out.println("&& Sim! Aplique o desconto.");
		}else {
			System.out.println("&& Nao aplique o desconto.");
		}
		
		Boolean aplicarDescontoB = carrinhoMaiorQue100 || periodoDePromocao || jaFezCompraNaLoja;
		
		if (aplicarDescontoB) {
			System.out.println("|| Sim! Aplique o desconto.");
		}else {
			System.out.println("|| Nao aplique o desconto.");
		}
		
		Boolean aplicarDescontoC = carrinhoMaiorQue100 && (periodoDePromocao || jaFezCompraNaLoja);
		
		if (aplicarDescontoC) {
			System.out.println("&&|| Sim! Aplique o desconto.");
		}else {
			System.out.println("&&|| Nao aplique o desconto.");
		}
		
		
	}

}
