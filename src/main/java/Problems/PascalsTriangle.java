package Problems;

public class PascalsTriangle {
    public static void main(String[] args) {
        int rows = 10;
        printPascalsTriangle(rows);
    }

    public static void printPascalsTriangle(int numRows) {
        for (int i = 0; i < numRows; i++) {
            int number = 1;
            System.out.format("%" + (numRows - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.format("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}

