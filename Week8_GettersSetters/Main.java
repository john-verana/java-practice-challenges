import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BankAccount acc1 = new BankAccount();

        System.out.print("Enter account holder name: ");
        String name = input.nextLine();
        acc1.setAccountHolder(name);

        System.out.print("Enter initial balance: ");
        double balance = input.nextDouble();
        acc1.setBalance(balance);

        System.out.println("\nAccount Created!");
        System.out.println("Account holder: " + acc1.getAccountHolder());
        System.out.println("Balance: " + acc1.getBalance());

        input.close();
    }
}
