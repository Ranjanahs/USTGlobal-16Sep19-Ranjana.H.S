
public class Person {
     String name;
     int age;
     Person(String pname,int page) {
    	 name = pname;
    	 age = page;
       }
     void printDetails() {
 		System.out.println("person name is="+name);
 		System.out.println("person age is="+age);
 	}
     public static void main(String[] args) {
		Person p = new Person("Ranjana",22);
		p.printDetails();
		Person p1 = new Person("Tms",21);
		p1.printDetails();
		Person p2 = new Person("Lavi",23);
		p2.printDetails();
	}
     
}
