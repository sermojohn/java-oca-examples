package arrays;

import java.lang.reflect.Array;

public class ArrayClassShowcase {

	public void methodA() {
		Integer[] sar = (Integer[]) Array.newInstance(Integer.class, 10);
		System.out.println(sar + " size="+sar.length);
		assert sar.length == 10;
	}	

}