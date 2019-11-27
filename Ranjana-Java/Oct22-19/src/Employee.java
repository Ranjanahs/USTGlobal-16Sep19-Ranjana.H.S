
public class Employee {
	String name;
	int eid;
	
	public Employee(String empname,int empid) {
		name=empname;
		eid=empid;
	}
	void printDetails() {
		System.out.println("emp name is="+name);
		System.out.println("emp id is="+eid);
	}
	public static void main(String[] args) {
		Employee e1 = new Employee("Radhika",180);
		e1.printDetails();		
		Employee e2 = new Employee("Yash",120);
		e2.printDetails();		
		Employee e3 = new Employee("Sharath",110);
		e3.printDetails();
		
	}

}
