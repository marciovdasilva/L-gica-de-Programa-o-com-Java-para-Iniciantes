package bibliotecapropria;

import cosole.Interacao;

public class BibliotecaPropria {

	public static void main(String[] args) {
		Interacao interacao = new Interacao();
		
		Integer numero = interacao.lerNumero("Digite um numero: ");
		interacao.imprimir("Numero: " + numero);
		
		Double decimal = interacao.lerDecimal("Digite um numero decimal");
		interacao.imprimir("Decimal: " + decimal);
		
		interacao.erro("Essa é uma mensagem de erro!!");
		
		interacao.fechar();
		
	}

}
