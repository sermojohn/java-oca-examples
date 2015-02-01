package arrays;

public class ArrayA {
	
	private int[] intArray;

	private String objectArray[];

	private double multidimArray[][] = {
			{1d, 2d},
			{10d, 20d}
		};

	private byte[][] asymetricArray;

	public ArrayA() {
		intArray = new int[10];
		objectArray = new String[10];
		
		asymetricArray = new byte[][]{
			{1},
			{1,2},
			{1,2,3}
		};		
	}

	public void performChecks() {

		for(int i=0, length=intArray.length; i<length; i++) {
			assert intArray[i] == 0;
		}

		for(int i=0, length=objectArray.length; i<length; i++) {
			assert objectArray[i] == null;
		}

		assert multidimArray.length == 2;
		assert multidimArray[0].length == 1;

		assert asymetricArray[0][3] == 0;
		System.out.println("Asymetric array first length:"+asymetricArray[0].length+",element 2 is:"+asymetricArray[1][1]);

		System.out.println("Performed successfully array checks!");

	}
}