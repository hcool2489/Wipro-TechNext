/*
Create a class called Person with a member variable name. Save it in a file called Person.java

Create a class called Employee that will inherit the Person class.The other data members of the Employee class are annual salary (double), the year the employee started to work, and the national insurance number which is a String.Save this in a file called Employee.java

Your class should have the necessary constructors and getter/setter methods.

Write another class called TestEmployee, containing a main method to fully test your class definition.
*/

class TestEmployee{
	public static void main(String[] args){
		Employee e1 = new Employee("James", 670172.321, 2015, "A5TY812OQ7");
		System.out.println("Name: " + e1.getName() + "\nSalary: " + e1.getSalary() + "\nYear of Joining: " + e1.getYOJ() + "\nNational Insurance Number: " + e1.getNIN());
		System.out.println("\nModifying Record...\n");
		e1.setName("David");
		e1.setSalary(7291034.52);
		e1.setYOJ(e1.getYOJ() - 3);
		e1.setNIN("ALYPQR8182");
		
		System.out.println("Modified Data:");
		e1.getDetails();
	}
}