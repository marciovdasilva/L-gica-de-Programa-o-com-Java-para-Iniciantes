package Exercicio01MetodoQueInformaNecessidadeDeReporEstoque;

public class ValidaEstoqueProduto {

	public static void main(String[] args) {
		Produto produto = new Produto();
		
		produto.nome = "Monitore Game";
		produto.quantidadeEstoque = 1;
		
		//ValidaEstoqueMinimo(produto);
		//System.out.println(ValidaEstoqueMinimo(produto));
		
		System.out.println("Necessario repor estoque do produto " + produto.nome + "? " + (ValidaEstoqueMinimo(produto) ? "Sim - produto abaixo de 10 unidades" : "Não"));
		
	}
	static boolean ValidaEstoqueMinimo(Produto produto) {
		if (produto.quantidadeEstoque < Produto.QUANTIDADE_MINIMA_ESTOQUE) {
			return true;
		} else {
			return false;
		}
		
	}

}
