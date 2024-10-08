import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double firstNumber, secondNumber;
        String operation;

        System.out.print("Enter the first number: ");
        firstNumber = input.nextDouble();

        System.out.print("Enter the operation (+, -, *, /): ");
        operation = input.next();

        System.out.print("Enter the second number: ");
        secondNumber = input.nextDouble();

        double output = 0;

        switch (operation) {
            case "+":
                output = firstNumber + secondNumber;
                break;
            case "-":
                output = firstNumber - secondNumber;
                break;
            case "*":
                output = firstNumber * secondNumber;
                break;
            case "/":
                if (secondNumber != 0) {
                    output = firstNumber / secondNumber;
                } else {
                    System.out.println("Error! Cannot divide by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Error! Unsupported operation.");
                return;
        }

        System.out.println("The result is: " + output);
    }
}
