import java.util.Scanner;

public class ATMDispenser {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter withdrawal amount (multiple of 20): $");
		int amount = input.nextInt();
		
		int billsDispensed = 0;
		
		while(amount >= 20) {
			amount = amount - 20;
			billsDispensed++; 
			System.out.println("Dispensed $20 bill; remaining amount: $" + amount);
		}
		
		System.out.print("Done! Total $20 bills dispensed: " + billsDispensed);
		input.close();

	}

}
