package Problems;
import java.util.Scanner;

public class BattingAverageCalculator2 {


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

                System.out.print("Enter the number of times " + batsmanName + " got out: ");
                int timesOut = scanner.nextInt();

                double battingAverage = calculateBattingAverage(runsScored, timesOut);

                System.out.println("Batting Average of " + batsmanName + ": " + battingAverage);
            }

            scanner.close();
        }

        public static double calculateBattingAverage(int runsScored, int timesOut) {
            if (timesOut == 0) {
                System.out.println("Batting average cannot be calculated as the player has not been out.");
                return 0.0;
            } else {
                double battingAverage = (double) runsScored / timesOut;
                return battingAverage;
            }
        }
    }


