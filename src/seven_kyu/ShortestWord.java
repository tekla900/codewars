package seven_kyu;

import java.util.Arrays;
import java.util.List;

public class ShortestWord {
    public static int findShort(String s) {
        String[] wordsList = s.split("\\s+");

        int minLength = Integer.MAX_VALUE;
        String shortest = "";

        for (String word : wordsList) {
            if (word.length() < minLength) {
                shortest = word;
                minLength = word.length();
            }
        }

        return shortest.length();
    }

    public static void main(String[] args) {
        System.out.println(findShort("turns out random test cases are easier than writing out basic ones"));
    }
}
