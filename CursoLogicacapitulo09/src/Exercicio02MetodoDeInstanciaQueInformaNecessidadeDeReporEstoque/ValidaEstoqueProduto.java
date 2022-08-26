package Exercicio02MetodoDeInstanciaQueInformaNecessidadeDeReporEstoque;

public class ValidaEstoqueProduto {

	public static void main(String[] args) {
		Produto produto = new Produto();
		
		produto.nome = "Monitore Game";
		produto.quantidadeEstoque = 9;
		
		System.out.println("Necessario repor estoque do produto " + produto.nome + "? " + (produto.ValidaEstoqueMinimo() ? "Sim - produto abaixo de 10 unidades" : "Não"));
		
	}

}
