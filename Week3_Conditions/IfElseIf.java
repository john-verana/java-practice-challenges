import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your age:");
		int age = input.nextInt();
		System.out.println("Your age is: " + age);
		
		if (age < 18) {
			System.out.println("You are not old enough to smoke broski!");
		} else if (age < 21) {
			System.out.println("You're old enough to smoke, but not drink");
		} else if (age < 60) { 
			System.out.println("You are old enough to drink and smoke");
		} else {
			System.out.println("You are too old don't even try both");
		}

	}

}
