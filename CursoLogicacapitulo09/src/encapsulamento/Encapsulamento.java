package encapsulamento;

public class Encapsulamento {

	public static void main(String[] args) {
//		Cliente cliente = new Cliente();
//		
//		
//		cliente.nome = "Joaquim Gabriel";
//		cliente.telefone = "45988465246";
//		
//		System.out.println("Nome do Cliente: " +cliente.nome);
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("Marcio Silva");
		cliente.setTelefone("4561654595");
		
		System.out.println("Nome do cliente: " + cliente.getNome() + "\nTelefone: " + cliente.getTelefone());
		
		System.out.println("\nPrimeiro nome: " + cliente.getPrimeiroNome());
		System.out.println("Segundo nome: " + cliente.getUltimoNome());
	}

}
