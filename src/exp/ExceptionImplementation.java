package exp;

public class ExceptionImplementation implements ExceptionInterface {
	public void exceptionMethodA() {		
	}

	public void exceptionMethodB() /* method cannot define exception if the overriden method doesn't define one: throws Exception */ {
	}
}