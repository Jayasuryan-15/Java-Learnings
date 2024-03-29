package Problems;

import java.util.Scanner;

public class BattingStrikeRateCalculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of batsmen: ");
        int numberOfBatsmen = scanner.nextInt();

        for (int i = 1; i <= numberOfBatsmen; i++) {
            System.out.println("\nBatsman " + i + ":");
            System.out.print("Enter the name of the batsman: ");
            String batsmanName = scanner.next();

            System.out.print("Enter the number of runs scored by " + batsmanName + ": ");
            int runsScored = scanner.nextInt();

            System.out.print("Enter the number of balls faced by " + batsmanName + ": ");
            int ballsFaced = scanner.nextInt();

            double strikeRate = calculateStrikeRate(runsScored, ballsFaced);

            System.out.println("Batting Strike Rate of " + batsmanName + ": " + strikeRate);
        }

        scanner.close();
    }

    public static double calculateStrikeRate(int runsScored, int ballsFaced) {
        if (ballsFaced == 0) {
            System.out.println("Strike rate cannot be calculated as no balls faced.");
            return 0.0;
        } else {
            double strikeRate = (double) runsScored / ballsFaced * 100;
            return strikeRate;
        }
    }
}

