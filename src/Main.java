import accessmodifiers.*;
import scopes.*;
import arrays.*;
import dicisionconstructs.*;
import inheritance.*;
import exp.*;
import strings.*;
import lambdas.*;
import variables.*;

import java.io.*;

public class Main {

	public static void main(String... args) throws IOException {
		// testAccessModifiers();
		// testScopes();
		// testArrays();
		// testDecisionConstracts();
		testInheritance();
		// testExceptions();
		// testStrings();
		// testLambdas();
		// testDeclarations();
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

	private static void testScopes() {
		System.out.println("-----------START------------");
		ScopeA a = new ScopeA("instance");
		a.printName("method");

		ScopeB b = new ScopeB("BInstance");


		System.out.println("------------END-------------");	
	}

	private static void testArrays() {
		System.out.println("-----------START------------");
		
		//ArrayA a = new ArrayA();
		//a.performChecks();

		ArrayClassShowcase b = new ArrayClassShowcase();
		b.methodA();

		System.out.println("------------END-------------");	
	}

	private static void testDecisionConstracts() {
		System.out.println("-----------START------------");
		
		DecisionA a = new DecisionA();
		//a.testSwitch("1");
		//a.testFor();
		// a.testForWithArrays();
		a.testSwitchWithDefault();

		System.out.println("------------END-------------");	
	}
	
	private static void testInheritance() {
		// compare output of overriden method getName()
		/*ClassA classA = new ClassA("Giannis");
		classA.getName();
		ClassA classB = new ClassB("Giannis");
		classB.getName();

		// and a minor string equality check using ==
		System.out.println("Names should be equal:"+(classA.name == classB.name));*/

		// interfaces test
		new TestInterfaces().show();

		new InheritanceGenerics().test1();

		new GrandChild();
	}

	private static void testExceptions() {
		ExceptionDemo exDemo = new ExceptionDemo();
		exDemo.method1();
		exDemo.method2();

		//interface defines method that throws exception, but implementation doesn't
		ExceptionImplementation impl1 = new ExceptionImplementation();
		impl1.exceptionMethodA();
		try {
			ExceptionInterface impl2 = new ExceptionImplementation();
			impl2.exceptionMethodA();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		ExceptionImplementation impl2 = new ExceptionImplementation();
		impl2.exceptionMethodB();
	}

	private static void testStrings() {
		new StringTest().method1();
	}

	private static void testLambdas() {
		new LambdasTest().method1();
	}

	private static void testDeclarations() {
		new DeclarationOrder().printValues();
	}
}