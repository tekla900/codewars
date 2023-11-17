package eight_kyu;

/*
* Create a function called shortcut to remove the lowercase
* vowels (a, e, i, o, u ) in a given string.
*
* don't worry about uppercase vowels
*
* y is not considered a vowel for this kata
* */

public class VowelRemover {
    public static String shortcut(String input) {
        return input.replaceAll("[aeiou]", "");
    }
}
