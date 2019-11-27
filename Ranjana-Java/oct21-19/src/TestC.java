
public class TestC {
	public static void main(String[] args) {
		Person.color="white";
		Person.sleep();
		System.out.println("person color="+Person.color);
		
		Person p=new Person();
		p.name="Ranjana";
		p.age=23;
		System.out.println("person name is="+p.name);
		System.out.println("person age is="+p.age);
		System.out.println("person color is="+Person.color);
		p.color="black";
		p.sleep();
		p.eat();
		p.walk();
		
		Person p1=new Person();
		p1.name="Anjana";
		p1.age=31;
		System.out.println("person name is="+p1.name);
		System.out.println("person age is="+p1.age);
		p1.color="white";
		System.out.println("person color is="+p1.color);
		
	}

}
