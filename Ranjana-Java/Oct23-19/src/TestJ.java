
public  class TestJ extends TestH {
	public static void main(String[] args) {
		TestH h=new TestJ();
		h.color();
		h.shape();
	}

	@Override
	void shape() {
	   System.out.println("circle");
		
	}

	@Override
	void color() {
		System.out.println("red");
		
	}

}
