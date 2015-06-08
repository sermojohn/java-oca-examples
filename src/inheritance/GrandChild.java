package inheritance;

public class GrandChild {

	private int age;

	/*
	This constructor causes an error!
	public GrandChild() {
		super();
		this(0);
	}
	*/

	public GrandChild(int age) {
		this.age = age;
	}
	
}