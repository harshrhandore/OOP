import java.util.Scanner;

public class ATM {
    static double balance = 10000.0;

    public static void checkBalance() {
        System.out.println("Current Account Balance: " + balance);
    }

    public static void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new ArithmeticException("Insufficient funds.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful.");
    }

    public static void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
        System.out.println("Deposit successful.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Balance Inquiry");
            System.out.println("2. Withdrawal");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = scanner.nextInt();

                try {
                    if (choice == 1) {
                        checkBalance();
                    } else if (choice == 2) {
                        System.out.print("Enter amount to withdraw: ");
                        double amount = scanner.nextDouble();
                        withdraw(amount);
                    } else if (choice == 3) {
                        System.out.print("Enter amount to deposit: ");
                        double amount = scanner.nextDouble();
                        deposit(amount);
                    } else if (choice == 4) {
                        System.out.println("Thank you for using the ATM.");
                    } else {
                        throw new IllegalArgumentException("Invalid menu option selected.");
                    }
                } catch (ArithmeticException e) {
                    System.out.println("Exception handled: " + e.getMessage());
                } catch (IllegalArgumentException e) {
                    System.out.println("Exception handled: " + e.getMessage());
                } finally {
                    System.out.println("Transaction completion status: Processed.");
                }

            } catch (Exception e) {
                System.out.println("Invalid input type. Please enter numbers only.");
                scanner.next();
            }
        }
        scanner.close();
    }
}
