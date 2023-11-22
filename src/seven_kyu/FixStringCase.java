package seven_kyu;

/*
* In this Kata, you will be given a string that may have mixed uppercase and lowercase letters
* and your task is to convert that string to either lowercase only or uppercase only based on:
*
* make as few changes as possible.
*
* if the string contains equal number of uppercase and lowercase letters, convert the string to lowercase.
*/

public class FixStringCase {
    public static String solve(final String str) {
        int upperCase = 0, lowerCase = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) upperCase++;
            if (Character.isLowerCase(str.charAt(i))) lowerCase++;
        }

       if (upperCase <= lowerCase) return str.toLowerCase();

       return str.toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(FixStringCase.solve("coDE"));
        System.out.println(FixStringCase.solve("coDe"));
        System.out.println(FixStringCase.solve("cODE"));
    }
}
