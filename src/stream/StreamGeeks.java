package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamGeeks {
	// https://www.geeksforgeeks.org/stream-in-java/

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(2, 3, 8, 5, 6, 10);
		List<String> palavras = Arrays.asList("Caixa", "Maça", "Árvore", "Cadeira");

		// map - para cada número da lista (todos eles), multiplica ele por ele mesmo -
		// map(x->x*x)
		List<Integer> quadrado = numeros.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println(quadrado);

		// utiliza o map, semelhante ao de cima, mas o Set não leva em consideração a
		// ordenação dos elementos
		Set<Integer> quadradoSet = numeros.stream().map(x -> x * x).collect(Collectors.toSet());
		System.out.println(quadradoSet);

		// filter - filtra para a nova lista apenas o que estiver de acordo com o filtro
		List<String> comecamComC = palavras.stream().filter(palavra -> palavra.startsWith("C"))
				.collect(Collectors.toList());
		System.out.println(comecamComC);

		//forEach - Imprime um por um
		numeros.stream().map(x -> x + x).forEach(y -> System.out.println(y));
		
		//filtra apenas os numeros que na divisão por 2 retornam 0, e depois com estes filtrados, soma eles.
		int even = numeros.stream().filter(x -> x%2==0).reduce(0,(ans,i)-> ans+i);
		System.out.println(even);

	}
}
