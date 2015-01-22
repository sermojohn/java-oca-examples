package scopes;

public class ScopeB extends ScopeA {

	private String name;

	public ScopeB(String name) {
		super();

		printName();
		assertName(null, null, null);
		
		this.name = name;
		printName();
		assertName(name, name, null);

		super.name = name;
		printName();
		assertName(name, name, name);
	}

	private void printName() {
		System.out.println("Constructor param:"+name);
		System.out.println("Instance param:"+this.name);
		System.out.println("Parent clas name:"+super.name);
	}

	private void assertName(String methodName, String instanceName, String parentName) {
		assert name == methodName;
		assert this.name == instanceName;
		assert super.name == parentName;
		System.out.println("Assertions passed!");
	}


	
}