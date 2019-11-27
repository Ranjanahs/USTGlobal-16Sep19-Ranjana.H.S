
public class TestA {
	public static int add(int a,int b) {
		System.out.println("add(int a,int b) method");
		return a+b;
	}
	public static long add(long a,int b) {
		System.out.println("add(long a,int b) method");
		return a+b;
	}
	public static void add(int a,byte b) {
		System.out.println("add(int a,byte b) method");
	}
	public int multiply(int a,int b) {
		System.out.println("mul(int a,int b) method");
		return a+b;
	}
	public int multiply(byte a,int b) {
		System.out.println("mul(byte a,int b) method");
		return a+b;
	}
	public static void main(String[] args) {
		System.out.println("main(String[] args)");
		main(10);
		add(10, 20);
		add(112, 20);
		add(20, 30);
		TestA t = new TestA();
		t.multiply(12, 10);
		t.multiply(5, 4);
		
	}
	public static void main(int a) {
		System.out.println("main(int a) method ovrload");
	}
}
