package accessmodifiers;

public class B {

	/**
	 * If an empty constructor is defined, this will be called by default from deriving classes' constructors.
	 * If a constructor is defined, but there is no empty constructor, then on each subclass constructor, you
	 * need to call the parent class constructor explicitly, as the first statement of the constructor.
	 */
	/*B() {	}*/

	B(String name) {
		System.out.println("An instance of class B has been created with name:"+name);
	}

	public void run() {
		System.out.println("running..");
	}

	class BInner {
		public BInner() {
			System.out.println("Created a BInner class instance.");
		}
	}

}