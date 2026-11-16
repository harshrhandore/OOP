import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueChoice;

        do {
            System.out.println("\n--- Java Calculator Menu ---");
            System.out.println("Supported Operators: +, -, *, /");
            System.out.println("Enter 'x' as the operator to Exit.");

            try {
                System.out.print("Enter operand 1: ");
                double operand1 = scanner.nextDouble();

                System.out.print("Enter operator (+, -, *, /): ");
                char operator = scanner.next().charAt(0);

                if (operator == 'x' || operator == 'X') {
                    System.out.println("Exiting the program...");
                    break;
                }

                System.out.print("Enter operand 2: ");
                double operand2 = scanner.nextDouble();

                double result = 0;
                boolean isValidOperation = true;

                switch (operator) {
                    case '+':
                        result = operand1 + operand2;
                        break;
                    case '-':
                        result = operand1 - operand2;
                        break;
                    case '*':
                        result = operand1 * operand2;
                        break;
                    case '/':
                        if (operand2 == 0) {
                            System.out.println("Error: Cannot divide by zero.");
                            isValidOperation = false;
                        } else {
                            result = operand1 / operand2;
                        }
                        break;
                    default:
                        System.out.println("Error: Invalid operator entered.");
                        isValidOperation = false;
                }

                if (isValidOperation) {
                    System.out.println("Result: " + result);
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input format. Please enter numbers.");
                scanner.next();
            }

            System.out.print("\nDo you want to perform another calculation? (y/n): ");
            continueChoice = scanner.next().charAt(0);

        } while (continueChoice == 'y' || continueChoice == 'Y');

        scanner.close();
        System.out.println("Program stopped successfully.");
    }
}
