package seven_kyu;

import java.util.Arrays;

/*
* An anagram is the result of rearranging the letters of a word to produce a new word (see wikipedia).
*
* Note: anagrams are case insensitive
*
* Complete the function to return true if the two arguments given are anagrams of each other;
* return false otherwise.
*
* Examples
* "foefet" is an anagram of "toffee"
* "Buckethead" is an anagram of "DeathCubeK"
*/

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
