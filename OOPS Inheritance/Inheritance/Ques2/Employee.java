class Employee extends Person{
	private double annualSalary;
	private int yearOfJoining;
	private String nin;
	
	public Employee(String name, double annualSalary, int yoj, String nin){
		super(name);
		this.annualSalary = annualSalary;
		yearOfJoining = yoj;
		this.nin = nin;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setSalary(double salary){
		annualSalary = salary;
	}
	public void setYOJ(int yoj){
		yearOfJoining = yoj;
	}
	public void setNIN(String nin){
		this.nin = nin;
	}
	public String getName(){
		return name;
	}
	public double getSalary(){
		return annualSalary;
	}
	public int getYOJ(){
		return yearOfJoining;
	}
	public String getNIN(){
		return nin;
	}
	public void getDetails(){
		System.out.println("#> " + name + " joined this company in " + yearOfJoining + " with National Insurance Number \"" + nin + "\" and earns Rs. " + annualSalary + " per Annum.");
	}
}