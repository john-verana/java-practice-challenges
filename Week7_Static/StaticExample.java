
public class StaticExample {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("John Verana", "Front-End Developer");
		Employee emp2 = new Employee("Faye Cabrera", "Back End Developer"); 
		
		emp1.displayInfo();
		emp2.displayInfo();
		
		Employee.companyName = "DEVS Fc";
		
		System.out.println("Afrer company name change:");
		emp1.displayInfo();
		emp2.displayInfo();
		
	}

}
