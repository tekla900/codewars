package eight_kyu;

/*
* Given a string, you have to return a string in which each character (case-sensitive) is repeated once.
*/

public class DoubleChar {
    public static String doubleChar(String s){
        String newString = "";

        for (String i:
                s.split("")) {
            newString = newString.concat(i).concat(i);
        }

        return newString;
    }
}
