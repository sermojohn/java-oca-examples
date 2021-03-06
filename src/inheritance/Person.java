package inheritance;

public class Person implements Adult, Child {
	
	private int age;

	public Person(int age) {
		this.age=age;
	}

	public void play() {
		if(age >= Child.minAge && age < Adult.minAge) {
			System.out.println("I am a child and I can play!");
		} else {
			throw new UnsupportedOperationException();
		}
	}

	public void work() {
		// NOTE: will cause an exception due to trying to assign a value to a final variable
		// Adult.minAge += 1;
		if(age >= Adult.minAge) {
			System.out.println("I am an adult so I can go to work!");
		} else {
			throw new UnsupportedOperationException();
		}
	}



}