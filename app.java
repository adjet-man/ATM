import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int balance = 10000;
            int withdrawAmount, depositAmount;
            String pin, name, dob, location, status;

            System.out.print("Enter your PIN: ");
            pin = input.nextLine();

            if (!pin.equals("1234")) {
                System.out.println("Invalid PIN!");
                System.exit(0);
            }

            name = "James Osei";
            dob = "12/05/1980";
            location = "Accra";
            status = "Active";

            while (true) {
                System.out.println("\nWelcome to the ATM!");
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw Money");
                System.out.println("3. Deposit Money");
                System.out.println("4. Account Details");
                System.out.println("5. Exit");

                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("\nYour balance is: $" + balance);
                        break;
                    case 2:
                        System.out.print("\nEnter amount to withdraw: $");
                        withdrawAmount = input.nextInt();
                        if (withdrawAmount > balance) {
                            System.out.println("\nInsufficient funds!");
                            break;
                        }
                        balance -= withdrawAmount;
                        System.out.println("₵" + withdrawAmount + " withdrawn successfully!");
                        break;
                    case 3:
                        System.out.print("\nEnter amount to deposit: $");
                        depositAmount = input.nextInt();
                        balance += depositAmount;
                        System.out.println("₵" + depositAmount + " deposited successfully!");
                        break;
                    case 4:
                        System.out.println("\nName: " + name);
                        System.out.println("Date of Birth: " + dob);
                        System.out.println("Location: " + location);
                        System.out.println("Account Status: " + status);
                        break;
                    case 5:
                        System.exit(0);
                    default:
                        System.out.println("\nInvalid choice!");
                }
            }
        }
    }
}