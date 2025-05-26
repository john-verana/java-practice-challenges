import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter item price: $");
		double price = input.nextDouble();
		
		double totalInserted = 0.0;
		
		while(totalInserted < price) {
			System.out.print("Insert coin: $");
			double coinValue = input.nextDouble();
			
			totalInserted += coinValue;
			
			System.out.println("Amount due: $" + (price - totalInserted));
		}
		
		System.out.println("Dispensing item...");
		System.out.println("Price change: $" + (totalInserted - price));
		
		input.close();
		
	}

}
