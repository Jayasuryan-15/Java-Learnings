package Problems;

import java.util.Scanner;

public class DivisibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        if (num2 == 0) {
            System.out.println("Cannot divide by zero.");
        } else if (num1 % num2 == 0) {
            System.out.println(num1 + " is divisible by " + num2 + ".");
        } else {
            System.out.println(num1 + " is not divisible by " + num2 + ".");
        }

        scanner.close();
    }
}
