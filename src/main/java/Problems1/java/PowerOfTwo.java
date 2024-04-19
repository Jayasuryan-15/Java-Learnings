package Problems1.java;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Output for n = " + n + ": " + isPowerOfTwo(n));
    }
}

