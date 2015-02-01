package inheritance;

public class ClassB extends ClassA {

	public ClassB(String name) {
		this.name = name;
	}

	public void getName() {
		System.out.println("ClassB name:"+name);
	}
	
}