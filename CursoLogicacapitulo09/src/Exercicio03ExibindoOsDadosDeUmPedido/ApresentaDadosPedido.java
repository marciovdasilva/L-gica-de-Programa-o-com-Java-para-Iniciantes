package Exercicio03ExibindoOsDadosDeUmPedido;

public class ApresentaDadosPedido {

	public static void main(String[] args) {
		Pedido pedido = new Pedido();
		
		pedido.codigo = 1;
		pedido.subtotal = 100.0;
		pedido.desconto = 5.0;
//		pedido.total = 105.0;
		pedido.getTotal();
		
		
		System.out.println("Codigo: " + pedido.getCodigo() + " Subtotal: " + pedido.getSubtotal() + " Desconto: " + pedido.getDesconto() + " Total: " + pedido.getTotal());
		
		System.out.println(pedido.pedido());
	}

}
