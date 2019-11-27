
public class TestB {
public static void main(String[] args) {
	Cow c = new Cow();
	c.name="Kamadenu";
	c.color="brown";
	System.out.println("cow name="+c.name);
	System.out.println("cow color="+c.color);
	c.eat();
	c.sleep();
	
	System.out.println("*************************************");
	
	Cow c1 = new Cow();
	c1.name="Punyakoti";
	c1.color="white";
	System.out.println("cow name="+c1.name);
	System.out.println("cow color="+c1.color);
	c1.eat();
	c1.sleep();
}
}
