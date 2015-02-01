package inheritance;

public class ClassA {

	public String name;

	public ClassA() {}

	public ClassA(String name) {
		this.name = name;
	}

	public void getName() {
		System.out.println("ClassA name:"+name);
	}

}