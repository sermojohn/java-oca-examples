import accessmodifiers.*;

public class Main {

	public static void main(String... args) {
		testAccessModifiers();
	}

	private static void testAccessModifiers() {
		System.out.println("-----------START------------");
		// instantiate C class
 		C c = new C("test");
 		// call member method run derived from class B
		c.run();
		// create C inner class
		c.new CInner();

		// directly call static methods of A and C nested classes
		A.ANested.helloWorld();
		C.CNested.helloWorld();

		// instantiate A static nested class
		new A.ANested();
		System.out.println("------------END-------------");
	}
	
}