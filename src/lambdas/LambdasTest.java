package lambdas;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdasTest {

	public void method1() {
		Predicate<Integer> p = i -> i%2 == 0;

		List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		printList(input);

		List<Integer> output = filterList(input, p);
		System.out.println("\n"+output);
	}


	private void printList(List<Integer> list) {
		list.stream().forEach(i -> System.out.print(i+","));
	}

	private List<Integer> filterList(List<Integer> list, Predicate<Integer> p) {
		return list.stream().filter(p).collect(Collectors.toList());
	}
	
}