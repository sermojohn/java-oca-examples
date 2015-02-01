package inheritance;

public class TestInterfaces { 

	public void show() {
		Person p1 = new Person(10);
		p1.play();
		try {
			p1.work();
		} catch (Exception e) {
			System.err.println("Exception cought:"+e.toString());
		}

		Person p2 = new Person(22);
		p2.work();
		try {
			p2.play();
		} catch (Exception e) {
			System.out.println("Exception cought:"+e.toString());
		}
	}

}