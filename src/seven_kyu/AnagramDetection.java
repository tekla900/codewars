package seven_kyu;

import java.util.Arrays;

public class AnagramDetection {
    public static boolean isAnagram(String test, String original) {

        char[] testCharArray = test.toLowerCase().toCharArray();
        char[] originalCharArray = original.toLowerCase().toCharArray();

        Arrays.sort(testCharArray);
        Arrays.sort(originalCharArray);

        return new String(testCharArray).equals(new String(originalCharArray));
    }

    public static void main(String[] args) {

        System.out.println(isAnagram("helLo", "Ehllo"));

    }
}
