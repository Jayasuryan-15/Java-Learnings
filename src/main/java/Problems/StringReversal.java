package Problems;

public class StringReversal {
    public static void main(String[] args) {
        String input = "Hello, World!";
        String reversed = reverseString(input);
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {

            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;


            left++;
            right--;
        }

        return new String(chars);
    }
}

