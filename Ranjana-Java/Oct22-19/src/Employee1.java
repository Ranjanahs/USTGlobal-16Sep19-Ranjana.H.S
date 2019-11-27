
public class Employee1 {
		String name;
		int eid;
		
		public Employee1(String name,int eid) {
			this.name=name;
			this.eid=eid;
		}
		void printDetails() {
			System.out.println("emp name is="+name);
			System.out.println("emp id is="+eid);
			this.sayHello();
		}
		void sayHello() {
			System.out.println("Hello "+name+" Welcome to UST Global");
		}
		public static void main(String[] args) {
			Employee1 e1 = new Employee1("Teju",180);
			e1.printDetails();		
			Employee1 e2 = new Employee1("Varsha",120);
			e2.printDetails();		
			Employee1 e3 = new Employee1("Ranjana",110);
			e3.printDetails();
			
		}

	}



