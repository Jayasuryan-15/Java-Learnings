package Problems;

import java.util.Scanner;

public class BattingAverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of runs scored: ");
        int runsScored = scanner.nextInt();

        System.out.print("Enter the number of times got out: ");
        int timesOut = scanner.nextInt();

        double battingAverage = calculateBattingAverage(runsScored, timesOut);

        System.out.println("Batting Average: " + battingAverage);

        scanner.close();
    }

    public static double calculateBattingAverage(int runsScored, int timesOut) {
        if (timesOut == 0) {
            return -1;
        } else {
            return (double) runsScored / timesOut;
        }
    }
}

