package ExercicioCapitulo4;

import java.util.Scanner;

public class Exercicio03CalculoDeGastosFamiliar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Double gastoTotalDoMes = 0.00;
		
		System.out.print("Informe o valor da conta de Luz: ");
		//Double valorDaContaDeLuz = scanner.nextDouble();
		gastoTotalDoMes += scanner.nextDouble();
		
		System.out.print("Informe o valor da conta de Agua: ");
		//Double valorDaContaDeAgua = scanner.nextDouble();
		gastoTotalDoMes += scanner.nextDouble();
		
		System.out.print("Informe o valor da conta de Telefone: ");
		//Double valorDaContaDeTelefone = scanner.nextDouble();
		gastoTotalDoMes += scanner.nextDouble();
		
		System.out.print("Informe o valor da mensalidade Escolar: ");
		//Double valorDaMensalidadeEscolar = scanner.nextDouble();
		gastoTotalDoMes += scanner.nextDouble();
		
		System.out.print("Informe o valor da fatura do Cartao: ");
		//Double valorDaFaturaDoCartao = scanner.nextDouble();
		gastoTotalDoMes += scanner.nextDouble();
		
		System.out.print("Informe o gasto com Supermercado: ");
		//Double valorGastoComSupermercado = scanner.nextDouble();
		gastoTotalDoMes += scanner.nextDouble();
		
		//Double gastoTotalDoMes = valorDaContaDeLuz + valorDaContaDeAgua + valorDaContaDeTelefone + 
		//valorDaMensalidadeEscolar + valorDaFaturaDoCartao + valorGastoComSupermercado;
		System.out.println("Gasto total do mes: "+gastoTotalDoMes);
		
		scanner.close();
	}
}
