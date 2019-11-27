
public class Student {
	int id;
	int age;
	String name;
	String stream;
	int marks;

	Student(int id,int age,String name,String stream,int marks){
		this.id=id;
		this.age=age;
		this.name=name;
		this.stream=stream;
		this.marks=marks;
	}
	void display()
	{
		System.out.println("id is="+id);
		System.out.println("age is="+age);
		System.out.println("name is="+name);
		System.out.println("stream is="+stream);
		System.out.println("marks is="+marks);
	}
   public static void main(String[] args) {
	Student s1 = new Student(1,20,"Ashwini","CS",90);
	s1.display();
	System.out.println("-----------------------------");
	Student s2 = new Student(2,22,"Ranjana","CS",90);
	s2.display();
	System.out.println("-----------------------------");
	Student s3 = new Student(3,23,"Kavitha","CS",85);
	s3.display();
	System.out.println("-----------------------------");
	Student s4 = new Student(4,24,"Pallavi","CS",90);
	s4.display();
	System.out.println("-----------------------------");
	Student s5 = new Student(5,25,"Pragya","IS",97);
	s5.display();
	System.out.println("-----------------------------");
	Student s6 = new Student(6,26,"Siri","CS",70);
	s6.display();
	System.out.println("-----------------------------");
	Student s7 = new Student(7,27,"Varsha","EC",92);
	s7.display();
	System.out.println("-----------------------------");
	Student s8 = new Student(8,28,"Teju","CV",85);
	s8.display();
	System.out.println("-----------------------------");
	Student s9 = new Student(9,29,"Hemanth","CV",95);
	s9.display();
	System.out.println("-----------------------------");
	Student s10 = new Student(10,30,"Anjana","CS",90);
	s10.display();
	System.out.println("-----------------------------");
}
}
