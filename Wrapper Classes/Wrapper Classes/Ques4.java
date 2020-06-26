/*
Create an employee object and initialize its properties. 
Create a clone of this object and store it in a different object. 
Now change the properties of the first employee object. 
Print both the objects and observe the change.
*/

class Employee implements Cloneable {
	private String name;	
	
	public Employee(String name) {
		this.name = name;
	}
	
/*	public Employee(Employee emp) {
		this.name = emp.name;
	}
*/

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public Employee clone() {
		try {
			return (Employee) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Cloning Not Allowed");
			return this;
		}
	}
}

public class Ques4 {
	public static void main(String[] args) {
		Employee emp = new Employee("James Bond");
		Employee empClone = emp.clone();
		empClone.setName("Depp");
		System.out.println(empClone.getName());
		System.out.println(emp.getName());
	}
}