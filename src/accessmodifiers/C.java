package accessmodifiers;

public class C extends B {
	
	public C() {
		super(null);
		System.out.println("Created instance of class C!");
	}

	public C(String name){
		super(name);
		System.out.println("Created instance of class C with name:"+name);	
	}

	public C(int order) {
		super(null);
 	}

 	public class CInner extends BInner {
 		public CInner() {
 			System.out.println("Created a CInner class instance.");
 		}
 	}

 	public static class CNested {
 		static {
 			System.out.println("Hello from CNested class.");
 		}
 		public static void helloWorld() {

 		}
 	}

}