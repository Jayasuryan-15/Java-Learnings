package Problems1.java;

public class PalindromeChecker {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        int original = x;

        while (x > reversed) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return x == reversed || x == reversed / 10;
    }

    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker();


        int[] inputs = {121, -121, 10};
        for (int input : inputs) {
            boolean result = checker.isPalindrome(input);
            System.out.println("Input: " + input + ", Output: " + result);
        }
    }
}

