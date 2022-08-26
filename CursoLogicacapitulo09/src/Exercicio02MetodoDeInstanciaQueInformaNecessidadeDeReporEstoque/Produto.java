package Exercicio02MetodoDeInstanciaQueInformaNecessidadeDeReporEstoque;

public class Produto {
	
	static final Integer QUANTIDADE_MINIMA_ESTOQUE = 10;
	
	String nome;
	Integer quantidadeEstoque;
	
	Boolean ValidaEstoqueMinimo() {
		if (quantidadeEstoque < QUANTIDADE_MINIMA_ESTOQUE) {
			return true;
		} else {
			return false;
		}
	}
}
