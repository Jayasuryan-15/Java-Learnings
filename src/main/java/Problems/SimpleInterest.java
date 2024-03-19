package Problems;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the principal amount: $");
        double principal = scanner.nextDouble();


        System.out.print("Enter the annual interest rate (in percentage): ");
        double rate = scanner.nextDouble();


        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();


        double simpleInterest = (principal * rate * time) / 100;


        double totalAmount = principal + simpleInterest;


        System.out.println("\nPrincipal amount: $" + principal);
        System.out.println("Annual interest rate: " + rate + "%");
        System.out.println("Time period: " + time + " years");
        System.out.println("Simple interest: $" + simpleInterest);
        System.out.println("Total amount: $" + totalAmount);


        scanner.close();
    }
}

