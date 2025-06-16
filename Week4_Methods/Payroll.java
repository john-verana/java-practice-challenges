import java.util.Scanner;

public class Payroll {

	public static void main(String[] args) {
		
		//get total rate per hour 
		//get total rate per day
		//get total monthly pay 
		//get tax 
		//get your net pay or final pay
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter your Basic Pay: ");
		double basicPay = userInput.nextDouble();
		
		System.out.println("Enter number of work days in a month: ");
		double workDays = userInput.nextDouble();
		
		System.out.println("Enter work hours per day: ");
		int workHours = userInput.nextInt();
		
		System.out.println("Enter your total allowance per month: ");
		int allowance = userInput.nextInt();
		
		System.out.println("Enter your total premium per month: ");
		int premium = userInput.nextInt();
		
		System.out.println("Enter your loan deduction per month: ");
		double loan = userInput.nextDouble();
	
		
		double hourRate = perHour(basicPay, workDays, workHours);
		System.out.printf("Your total per hour rate is: %.2f\n", hourRate);
		System.out.println();
		
		double dailyRate = perDay(basicPay, workDays);
		System.out.printf("Your daily rate total is: %.2f\n", dailyRate);
		System.out.println();
		
		double mRate = addMonthly(basicPay, allowance, premium);
		System.out.printf("Your total Monthly Pay is: %.2f\n", mRate);
		System.out.println();
		
		double taxRate = 12.0;
		double tax = calculateTax(basicPay, taxRate);
		System.out.println("Your Tax Deduction is: " + tax);
		System.out.println();
		
		double netPay = calculateNetPay(mRate, tax);
		System.out.printf("Your total net pay is: %.2f\n", netPay);
		System.out.println();
		
		double finalPay = totalPay(mRate, tax, loan); 
		System.out.printf("Your take home amount after deduction is: %.2f\n", finalPay);
		System.out.println();
		
		userInput.close();

	}
	
	private static double perHour(double basicPay, double workDays, double workHours) {
		return (basicPay / workDays) / workHours;
	}
	
	private static double perDay(double basicPay, double workDays) {
		return basicPay / workDays;
	}
	
	private static double addMonthly(double basicPay, int allowance, int premium) {
		return basicPay + allowance + premium;
	}
	
	private static double calculateTax(double basicPay, double taxRate) {
		return basicPay * (taxRate / 100); 
	}
	
	private static double calculateNetPay(double mRate, double tax) {
		return mRate - tax;
	}
	
	private static double totalPay(double mRate, double tax, double loan) {
		return mRate - tax - loan;
		
	}
	
}
  
