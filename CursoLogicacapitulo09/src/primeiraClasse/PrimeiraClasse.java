package primeiraClasse;

public class PrimeiraClasse {

	public static void main(String[] args) {
		Produto produto = new Produto();
		
		produto.nome = "Smartphone";
		produto.precoUnitario = 500.0;
		produto.quantidade = 15;
		
		exibirQuantidadeEmEstouque(produto);
	}
	static void exibirQuantidadeEmEstouque(Produto produto) {
		//System.out.println("Quantidade em estoque: " + produto.quantidade);
 		System.out.println("Quantidade em estoque do produto " +produto.nome + " é de " +produto.quantidade+" unidade(s)");
	}

}
