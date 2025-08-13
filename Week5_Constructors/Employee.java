//blueprint class 
public class Employee {
	
	// Fields (attributes)
	String name; 
	String position;
	double salary; 
	
	// Constructor to initialize Employee data
	public Employee(String name, String position, double salary) {
		this.name = name; 
		this.position = position; 
		this.salary = salary; 
	}
	// Method to print employee information
	void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Position: " + position); 
		System.out.println("Salary: " + salary); 
		System.out.println(); 
	}

}
