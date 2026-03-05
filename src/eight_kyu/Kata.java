package eight_kyu;
/*
* Your goal is to return multiplication table for number that is always an integer from 1 to 10.
 */

class Kata {
    public static String multiTable(int num) {
        String result = "";
        for (int i = 1; i < 10; i++) {
            result += i + " * " + num + " = " + (i * num) + "\n";
        }
        result += 10 + " * " + num + " = " + (10 * num);
        return result;
    }

}