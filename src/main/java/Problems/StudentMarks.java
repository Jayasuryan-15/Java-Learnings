package Problems;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int NUM_SUBJECTS = 5;
        final int PASS_MARK = 35;
        final int MAX_MARKS = 100;
        final int TOTAL_MARKS = NUM_SUBJECTS * MAX_MARKS;

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[][] marks = new int[numStudents][NUM_SUBJECTS];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < NUM_SUBJECTS; j++) {
                switch(j) {
                    case 0:
                        System.out.print("Enter marks for Tamil (out of 100): ");
                        break;
                    case 1:
                        System.out.print("Enter marks for English (out of 100): ");
                        break;
                    case 2:
                        System.out.print("Enter marks for Maths (out of 100): ");
                        break;
                    case 3:
                        System.out.print("Enter marks for Science (out of 100): ");
                        break;
                    case 4:
                        System.out.print("Enter marks for Social (out of 100): ");
                        break;
                }
                marks[i][j] = scanner.nextInt();
            }

            int totalMarks = 0;
            boolean pass = true;
            for (int j = 0; j < NUM_SUBJECTS; j++) {
                totalMarks += marks[i][j];
                if (marks[i][j] < PASS_MARK) {
                    pass = false;
                }
            }

            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println("Total Marks - " + totalMarks + ", Result - " + (pass ? "Pass" : "Fail"));
            if (!pass) {
                System.out.println("Better luck next time!");
            } else {
                System.out.println("Congratulations!");
            }
        }

        scanner.close();
    }
}
