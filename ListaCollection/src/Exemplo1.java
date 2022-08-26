import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Exemplo1 {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Jose");
		nomes.add("Maria");
		nomes.add("Antonio");
		
		//nomes.remove(0);
		//nomes.remove("Maria");
		
		System.out.println(nomes);
		
		/*Primeira forma*/
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println("Nome 1: " + nomes.get(i));
			
		}
		
		/*Segunda forma*/
		for (String nome : nomes) {
			System.out.println("Nome 2: " + nome);
		}
		
		/*Terceira forma*/
		nomes.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println("Nome 3: " + t);
				
			}
		
		});
		
		/*Quarta forma*/
		nomes.forEach(nome -> {
			System.out.println("Nome 4: "+ nome);
		});
		
		/*Quinta forma - mais facil*/
		nomes.forEach(System.out::println);
		
		
	}
}
