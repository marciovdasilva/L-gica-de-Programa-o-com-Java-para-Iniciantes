package metodoInstancia;

public class MetodoInstacia {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.primeiroNome = "Marcio";
		cliente.ultimoNome = "Da Silva";
		cliente.telefone = "45999678459";
		cliente.email = "marciosilva@email.co";
		
		Cliente cliente2 = new Cliente();
		cliente2.primeiroNome = "Luiz";
		cliente2.ultimoNome = "Da Silva";
		cliente2.telefone = "43984645646";
		cliente2.email = "luizdasilva@email.co";
		
		
		System.out.println("Nome Cliente: "+cliente.primeiroNome+" "+cliente.ultimoNome);
		
		/*Com metodo estatico*/
		System.out.println("Nome Cliente: "+obterNomeCompleto(cliente));
		
		/*Com metodo instanciado*/
		System.out.println("Nome Cliente: "+cliente.obterNomeCompleto()+ ", DDD: "+cliente.obterDDD());
		
		System.out.println("Nome Cliente: "+cliente2.obterNomeCompleto()+ ", DDD: "+cliente2.obterDDD());
	}
	static String obterNomeCompleto(Cliente cliente) {
		String nomeCompleto = cliente.primeiroNome+" "+cliente.ultimoNome;
		
		return nomeCompleto;
	}

}
