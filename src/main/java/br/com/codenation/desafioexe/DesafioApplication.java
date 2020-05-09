package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class DesafioApplication {

    public static List<Integer> fibonacci() {

       /*
       public static Boolean isFibonacci(Integer a) {
		return fibonacci().contains(a);
	}

	public static Integer fibonacci(int number) {
		return (number == 0 || number == 1)
				? number
				: fibonacci(number - 1) + fibonacci(number - 2);
	}

	public static List<Integer> fibonacci() {
		return IntStream.range(0, 15).mapToObj(DesafioApplication::fibonacci).collect(Collectors.toList());
	}
	------------------------------------------------
	outra maneira
        List<Integer> lista = new ArrayList<>();
        lista.add(0,0);
        lista.add(1,1);
        for (int i = 2; i < 15; i++) {lista.add((lista.get(i - 2)) + (lista.get(i - 1)));}*/
        return   Stream
                .iterate(new int[]{0,1},a->new int[]{a[1],a[0]+a[1]})
                .limit(15)
                .map(n->n[0])
                .collect(toList());
    }

    public static Boolean isFibonacci(Integer a) {
        List<Integer> lista = fibonacci();
        for (int n : lista)
          { if (n == a) {return true;} }
        return false;}
}
