package accessmodifiers;

public class A {

	public A() {
		System.out.println("Created instance of class A!");
	}

	public static class ANested {
		{
			System.out.println("Hello from ANested class instance.");
		}
		public static void helloWorld() {

		}
	}
	
}