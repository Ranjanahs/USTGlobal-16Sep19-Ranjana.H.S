
public class TestA {
	public static void main(String[] args) {
		Pen p = new Pen();
		p.cost = 100;
		p.color = "black";
		p.brand = "cello";
		System.out.println("Cost is " +p.cost);
		System.out.println("Color is " +p.color);
		System.out.println("Brand is "+p.brand);
		
		p.write();	
		
		System.out.println("*************************************************************");
		
		Van v = new Van();
		v.cost = 500000;
		v.color = "Silver";
		System.out.println("Cost is "+v.cost);
		System.out.println("Color is "+v.color);
	
	    Van v1 = new Van();
	    v1.cost= 2300000;
	    v1.color="Red";
	    System.out.println("Cost is "+v1.cost);
	    System.out.println("Color is "+v1.color);
	}
	
}
