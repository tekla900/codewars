package eight_kyu;

/*
* Given a string of digits, you should replace any digit below 5
* with '0' and any digit 5 and above with '1'.
* Return the resulting string.
*
* Note: input will never be an empty string
* */

public class FakeBinary {
    public static String fakeBin(String numberString) {
        StringBuilder res = new StringBuilder();

        for (char digit:
             numberString.toCharArray()) {
            if (digit >= '5') {
                System.out.println(digit + " digit is >5");
                res.append('1');
            } else {
                res.append('0');
            }
        }

        return res.toString();
    }
}