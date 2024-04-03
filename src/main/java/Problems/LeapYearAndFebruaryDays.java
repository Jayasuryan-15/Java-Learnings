package Problems;

import java.util.Scanner;

public class LeapYearAndFebruaryDays {
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int daysInFebruary(int year) {
        return isLeapYear(year) ? 29 : 28;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        System.out.println("Number of days in February in " + year + ": " + daysInFebruary(year));

        scanner.close();
    }
}

