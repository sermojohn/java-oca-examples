package exp;

public class ExceptionDemo {
	
	public void method1() {
		/*for(int i=0;i<10;) {
			System.out.println("No exception!");
		}*/
		// int bang = 1;
		// do while(true)
		// System.out.println("");

		boolean flag = false;
		for(;flag=!flag;) {
			System.out.println("test");
		}

		int a = 10;
		while(a>100){
			System.out.println("test2");
		}

		/*while(false) {
			System.out.println("test3");
		}*/
	}

	public void method2() {
		int bang = 1;
		do {
			{
				System.out.println("testsssss");
			}
		}
		while (bang < 1);
		System.out.println("bang is "+bang);
	}
}