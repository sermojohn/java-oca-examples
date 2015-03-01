package exp;

class ExceptionMain {
	
	// the exception MUST be declared to be throw or CAUGHT
	public static void main(String... args) throws Exception {
		System.out.println("start..");
		methodThatThrowsException();
		System.out.println("end..");
	}

	// the exception MUST be declared to be thrown
	private static void methodThatThrowsException() throws Exception {
		throw new Exception("Exception!");
	}

}