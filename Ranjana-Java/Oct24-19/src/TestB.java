
public class TestB {
    static int b;
    int a;
    {
    	a=10;
    	b=20;
    	System.out.println("non-static block 1");
    }
    public static void main(String[] args) {
		System.out.println("main started");
		TestB t=new TestB();
		TestB t1=new TestB();
		System.out.println("main ended");
	}
    //how many times object is created,tht much times non static block gets executed.//
    //iib gets executed wn the objct is created//
}

