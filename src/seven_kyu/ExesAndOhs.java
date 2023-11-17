package seven_kyu;

/*
* Check to see if a string has the same amount of 'x's and 'o's.
* The method must return a boolean and be case-insensitive.
* The string can contain any char.
* */

public class ExesAndOhs {
    public static boolean getXO (String str) {

        long countX = str.chars().filter(ch -> ch == 'x' || ch == 'X').count();
        long countO = str.chars().filter(ch -> ch == 'o' || ch == 'O').count();

        return countX == countO;

    }
}
