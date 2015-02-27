package inheritance;

import java.util.*;

public class InheritanceGenerics {

	public void test1() {
		List<Dog> l1 = new ArrayList<Dog>();
		//List<Animal> l2 = new ArrayList<Dog>();
		//List<Object> l3 = new ArrayList<Dog>();
	}

	private class Animal {}

	private class Dog extends Animal {}
	
}