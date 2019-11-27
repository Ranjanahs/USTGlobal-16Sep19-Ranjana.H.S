package com.ustglobal.sorting.list;

public class Employee implements Comparable {
  int id;
  String name;
  double Salary;
public Employee(int id, String name, double salary) {
	super();
	this.id = id;
	this.name = name;
	Salary = salary;
	
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	long temp;
	temp = Double.doubleToLongBits(Salary);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (Double.doubleToLongBits(Salary) != Double.doubleToLongBits(other.Salary))
		return false;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}


  public int compareTo(Employee o) {
	    Integer i=this.id;
	    Integer j=o.id;
	    return i.compareTo(j);
	
	}
//@Override
//public int compareTo(Object o) {
//	// TODO Auto-generated method stub
//	return 0;
//}
@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	return 0;
}
}
