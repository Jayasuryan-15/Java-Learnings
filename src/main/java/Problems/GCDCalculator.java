package Problems;

import java.util.Scanner;

public class GCDCalculator {
    public static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGCD(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        int gcd = calculateGCD(Math.abs(num1), Math.abs(num2));

        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);

        scanner.close();
    }
}

