package Problems;

import java.util.Arrays;

public class AnagramChecker {
    public static boolean areAnagrams(String str1, String str2) {

        str1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        str2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();


        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);


        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";


        boolean result = areAnagrams(str1, str2);


        if (result)
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are anagrams.");
        else
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are not anagrams.");
    }
}
