package Problems;

import java.util.Scanner;

public class BattingStrikeRateCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of runs scored: ");
        int runsScored = scanner.nextInt();

        System.out.print("Enter the number of balls faced: ");
        int ballsFaced = scanner.nextInt();

        double strikeRate = calculateStrikeRate(runsScored, ballsFaced);

        System.out.println("Batting Strike Rate: " + strikeRate);

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
