class Employee{
	int Emp_No;
	String Emp_Name;
	String Join_Date;
	char Designation_Code;
	String Department;
	int Basic;
	int HRA;
	int IT;
	
	public Employee(int Emp_No,	String Emp_Name, String Join_Date, char Designation_Code, String Department, int Basic, int HRA, int IT){
		this.Emp_No = Emp_No;
		this.Emp_Name = Emp_Name;
		this.Join_Date = Join_Date;
		this.Designation_Code = Designation_Code;
		this.Department = Department;
		this.Basic = Basic;
		this.HRA = HRA;
		this.IT = IT;
	}
}

class Designation{
	char Designation_Code;
	String Designation;
	int DA;
	
	public Designation(char Designation_Code, String Designation, int DA){
		this.Designation_Code = Designation_Code;
		this.Designation = Designation;
		this.DA = DA;
	}
}

public class Project1{
	private static void initializeEmployee(Employee[] emp){
		emp[0] = new Employee(1001,"Ashish","01/04/2009",'e',"R&D",20000,8000,3000);
		emp[1] = new Employee(1002,"Sushma","23/08/2012",'c',"PM",30000,12000,9000);
		emp[2] = new Employee(1003,"Rahul","12/11/2008",'k',"Acct",10000,8000,1000);
		emp[3] = new Employee(1004,"Chahat","29/01/2013",'r',"Front Desk",12000,6000,2000);
		emp[4] = new Employee(1005,"Ranjan","16/07/2005",'m',"Engg",50000,20000,20000);
		emp[5] = new Employee(1006,"Suman","1/1/2000",'e',"Manufacturing",23000,9000,4400);
		emp[6] = new Employee(1007,"Tanmay","12/06/2006",'c',"PM",29000,12000,10000);
	}
	
	private static void initializeDesignation(Designation[] desg){
		desg[0] = new Designation('e',"Engineer",20000);
		desg[1] = new Designation('c',"Consultant",32000);
		desg[2] = new Designation('k',"Clerk",12000);
		desg[3] = new Designation('r',"Receptionist",15000);
		desg[4] = new Designation('m',"Manager",40000);
	}
	
	private static int empExists(int id, Employee[] emp){
		for(int i=0;i<emp.length;i++)
			if(emp[i].Emp_No == id)
				return i;
		return -1;
	}
	
	private static int getDesignationIndex(char code){
		switch(code){
			case 'e': return 0;
			case 'c': return 1;
			case 'k': return 2;
			case 'r': return 3;
			case 'm': return 4;
		}
		return -1;
	}
	
	public static void main(String[] args){
		if(args.length == 1){
			//Declaring Employee and Designation Table and Initializing them with Demo Data
			Employee[] emp = new Employee[7];
			initializeEmployee(emp);
			Designation[] desg = new Designation[5];
			initializeDesignation(desg);
			
			int empId = Integer.parseInt(args[0]);
			int empIndex = empExists(empId,emp);
			if(empIndex != -1){
				int desgIndex = getDesignationIndex(emp[empIndex].Designation_Code);
				System.out.println("Emp No. Emp Name\tDepartment\tDesignation\tSalary");
				System.out.println(empId + "\t" + emp[empIndex].Emp_Name + "\t\t" + emp[empIndex].Department + "\t\t" + desg[desgIndex].Designation + "\t" + (emp[empIndex].Basic + emp[empIndex].HRA + desg[desgIndex].DA - emp[empIndex].IT));
			}else
				System.out.println("There is no employee with empId: " + empId);
		}else
			System.out.println("Enter Single Employee Id Eg.: 1001");
	}
}