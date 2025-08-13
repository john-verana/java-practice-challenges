import java.util.Scanner;

public class ConstructorEmployee {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		// Create Employee objects using the constructor
		System.out.print("Enter your name: ");
		String name1 = userInput.nextLine(); 
		
		System.out.print("Enter your position: ");
		String position1 = userInput.nextLine();
		
		System.out.print("Enter your salary: "); 
		double salary1 = userInput.nextDouble();
		userInput.nextLine();
		Employee emp1 = new Employee(name1, position1, salary1);
		
		System.out.print("\nEnter your name: "); 
		String name2 = userInput.nextLine();
		
		System.out.print("Enter your position: ");
		String position2 = userInput.nextLine();
		
		System.out.print("Enter your salary: ");
		double salary2 = userInput.nextDouble();
		Employee emp2 = new Employee(name2, position2, salary2);
		
		// Display employee details
		emp1.displayInfo();
		emp2.displayInfo(); 
		
		userInput.close();

	}

}
