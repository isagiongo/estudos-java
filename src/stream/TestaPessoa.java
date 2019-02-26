package stream;

import java.util.Arrays;
import java.util.List;

//http://www.matera.com/blog/post/entendendo-a-stream-api-do-java-8
public class TestaPessoa {

	public static void main(String[] args) {
		List<Pessoa> pessoas = Arrays.asList(
				new Pessoa("Isadora Giongo", 26), 
				new Pessoa("Veronica Torres", 29),
				new Pessoa("Pupy Giongo", 10), 
				new Pessoa("Teddy Torres", 10));

		//filtra pessoas maiores de 20 anos e que começam o nome com "I", pega a idade de todas as filtradas e soma
		Integer somaIdades = pessoas.stream()
				.filter(p -> p.getIdade() > 20)
				.filter(p -> p.getNome().startsWith("I"))
				.mapToInt(p -> p.getIdade())
				.sum();
		System.out.println(somaIdades);

	}
}
