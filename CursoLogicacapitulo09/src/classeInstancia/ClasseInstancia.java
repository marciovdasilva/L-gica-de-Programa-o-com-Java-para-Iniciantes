package classeInstancia;

public class ClasseInstancia {

	public static void main(String[] args) {
		//1
		System.out.println("Quantidade minima estoque: "+ Produto.quantidadeMinimaEstoque);
		
		//Instancia = new Produto; a instacia esta alimentando a variavel produto.
		Produto produto = new Produto();
		//produto.quantidadeMinimaEstoque = 10;
		produto.nome = "Caneca";

		Produto.quantidadeMinimaEstoque = 11;
		
		//2
		System.out.println("Quantidade minima estoque: "+ produto.quantidadeMinimaEstoque);
		
		Produto produto2 = new Produto();
		produto2.nome = "Carteira";
		
		//3
		System.out.println("Quantidade minima estoque: "+ produto2.quantidadeMinimaEstoque);

	
		System.out.println("Produto 1: " + produto.nome);
		System.out.println("Produto 2: " + produto2.nome);
		
		
		Impressao.infromacao("Produto 1: " + produto.nome);
		Impressao.infromacao("Produto 2: " + produto2.nome);
		
		Impressao.erro("Produto 1: " + produto.nome);
		Impressao.erro("Produto 2: " + produto2.nome);
		
		
	}

}
