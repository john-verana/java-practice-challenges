
public class Employee {
	String name;
	String position;
	static String companyName = "KAMP Fc";
	
	public Employee(String name, String position) {
		this.name = name; 
		this.position = position; 
	}
	void displayInfo() {
		System.out.println("Name: " + name); 
		System.out.println("Position: " + position); 
		System.out.println("Company Name: " + companyName); 
		System.out.println();
	}

}
