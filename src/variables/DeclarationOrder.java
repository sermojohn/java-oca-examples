package variables;

public class DeclarationOrder {
	
	private int x = y = 1;
	private int y;
	private int w = z;
	private static int z = zValue();
	private int f = fValue();

	public DeclarationOrder() {
		System.out.println("called the DeclarationOrder constructor.");
	}

	{
		System.out.println("initialization block.");
	}

	static {
		System.out.println("static initialization block.");
	}

	private int fValue() {
		System.out.println("called the fValue() method.");
		return -1;
	}

	private static int zValue() {
		System.out.println("called the static zValue method.");
		return -2;
	}

	public void printValues() {
		System.out.println("x = "+x+", y = "+y+", w = "+w+", z = "+z+ ", f = "+f);
	}

	@Override
	public void finalize() {
		System.out.println("Wow! Exciting results!!!");
	}

}