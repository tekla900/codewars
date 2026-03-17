package eight_kyu;

/*
*   Define String.prototype.toAlternatingCase such that each lowercase letter becomes uppercase
 *  and each uppercase letter becomes lowercase.
 */

public class AlternatingCase {
    public static String toAlternativeString(String string) {
        char[] charsArray = string.toCharArray();
        StringBuilder dynamicChars = new StringBuilder();

        for (char c : charsArray) {
            if(Character.isUpperCase(c)) {
                dynamicChars.append(Character.toLowerCase(c));
            } else {
                dynamicChars.append(Character.toUpperCase(c));
            }
        }
        return dynamicChars.toString();
    }

    public static void main(String[] args) {
        System.out.println(toAlternativeString("hello"));
    }
}
