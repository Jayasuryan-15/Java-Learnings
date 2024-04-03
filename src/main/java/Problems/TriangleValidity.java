package Problems;

import java.util.Scanner;

public class TriangleValidity {
    public static boolean isTriangleValid(int side1, int side2, int side3) {

        return (side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lengths of three sides of a triangle:");
        System.out.print("Side 1: ");
        int side1 = scanner.nextInt();
        System.out.print("Side 2: ");
        int side2 = scanner.nextInt();
        System.out.print("Side 3: ");
        int side3 = scanner.nextInt();

        if (isTriangleValid(side1, side2, side3)) {
            System.out.println("The triangle with sides " + side1 + ", " + side2 + ", " + side3 + " is valid.");
        } else {
            System.out.println("The triangle with sides " + side1 + ", " + side2 + ", " + side3 + " is not valid.");
        }

        scanner.close();
    }
}

