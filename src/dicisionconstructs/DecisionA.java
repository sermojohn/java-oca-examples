package dicisionconstructs;

import java.util.*;

public class DecisionA {
	
	public void testSwitch(String param) {

		//case with string value (new on Java 7)
		switch(param) {
			case "1": System.out.println("case 1"); break;
			case "2": System.out.println("case 2"); break;
			case "3": System.out.println("case 3"); break;
			//case null: break; -- this won't compile 
		}

		//case should be compile-time constant
		/*switch(value) {
			case param1: System.out.println("variable case"); break;
		}*/

		//case should be a constant
		final String value = "1";
		switch(param) {
			case value: System.out.println("constant value"); break;
		}
	}

	/**
	 * Notes:
	 * - Default labelled block runs even if a match is found, but not break is used. This is prevented when the default is defined before the matching case.
	 * - First a match is queried, and if none the default case will run. If break is not used after the matching case, the subsequenct cases will also run.
	 * - Only assignable values can be checked for equality using the case labels
	 */
	public void testSwitchWithDefault() {
		String s = "prod";
		switch(s) {
			default: System.out.println("default configuration.");
			case "prod": System.out.println("production configuration."); break;
		}

		String s2 = new String("develop");
		switch(s2) {
			case "develop": System.out.println("development configuration."); break;
			default: System.out.println("default configuration."); break;
		}
	}

	public void testFor() {

		for(int i=0; i<=5; ++i,printHello(i, "for"));

		for(int i: new int[]{1,2,3,4,5}) {
			printHello(i, "enhanced for");
		}

		Arrays.asList(1,2,3,4,5).stream().forEach(i -> printHello(i, "stream"));
 	}

 	public void testForWithArrays() {

 		List<String> intList = new ArrayList<>();
 		intList.addAll(Arrays.asList("1","2","3","4","5"));
 		System.out.println(intList+" elements of class:"+intList.getClass());

 		for(int i=0; i<intList.size(); i++) {
 			if(intList.get(i) == "1") {
 				System.out.println("can remove list element: "+intList.remove(intList.get(i)));
 			}
 		}

 		// Will raise ConcurrentModificationException due to using Iteration internally
 		/*for(String i: intList) {
 			if(i == "3") {
 				System.out.println("cannot remove list element: "+intList.remove(i));
 			}
 		}*/

 		System.out.println(intList);
 	}

	private static void printHello(int iter, String loopType) {
		System.out.println("Hello! "+iter+", using:"+loopType);
	}
	
}