import java.util.Scanner;

public class LoginPrompt {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String correctUsername = "admin";
		String correctPassword = "sample";
	
	
			System.out.print("Enter username: ");
			String enteredUsername = input.nextLine();
			
			System.out.print("Enter password: ");
			String enteredPassword = input.nextLine();
			
			if (enteredUsername.equals(correctUsername) && enteredPassword.equals(correctPassword)) {
				System.out.println("Login successful!"); 
			} else { 
				System.out.println("Invalid login. Try again.");
			}	
		input.close();
	}
	
}
