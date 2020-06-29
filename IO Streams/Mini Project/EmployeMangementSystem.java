import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class EmployeMangementSystem {
	public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		String filename = "EmployeeDB.dat";
		
		FileOutputStream fos = new FileOutputStream(filename);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		FileInputStream fis = new FileInputStream(filename);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		do {
			System.out.println("Main Menu\n1. Add an Employee\n2. Display All\n3. Exit");
			choice = sc.nextInt();
			
			switch (choice) {
				case 1:
					Employee emp = new Employee();
					System.out.print("Enter Employee ID: ");
					emp.setId(sc.nextInt());
					sc.nextLine();
					System.out.print("Enter Employee Name: ");
					emp.setName(sc.nextLine());
					System.out.print("Enter Employee Age: ");
					emp.setAge(sc.nextInt());
					System.out.print("Enter Employee Salary: ");
					emp.setSalary(sc.nextDouble());
					oos.writeObject(emp);
					break;
				case 2:
					System.out.println("----Report-----");
					emp = null;
					while (fis.available() > 0) {
						emp = (Employee) ois.readObject();
						System.out.println(emp);
					}
					System.out.println("----End of Report-----");
					break;
				case 3:
					System.out.println("Exiting the System");
					break;
				default:
					System.out.println("Wrong Choice Entered!");
			}
		} while (choice != 3);
		
		fos.close();
		oos.close();
		fis.close();
		ois.close();
		sc.close();	
	}
}