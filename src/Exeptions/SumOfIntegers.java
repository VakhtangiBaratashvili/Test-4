package Exeptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter the first integer: ");
                int num1 = scanner.nextInt();
                System.out.print("Enter the second integer: ");
                int num2 = scanner.nextInt();
                validInput = true;
                int sum = num1 + num2;
                System.out.println("Sum: " + sum);
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter integers.");
                scanner.nextLine();
            }
        }
    }
}
