package scopes;

public class ScopeA {
	
	String name;
	//public static String name = "myname"; // cannot define another variable with the same name (even static)

	public ScopeA() {
	}
	
	public ScopeA(String name) {
		this.name = name;
	}

	public void printName(String name) {
		System.out.println("Method parameter name:"+name);
		System.out.println("Instance name:"+this.name);
	}


}