package eight_kyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Palindrome {
    public static Boolean isPalindrome(String x) {
        List<String> list = new ArrayList<>(Arrays.asList(x.split(" ")));
        Collections.reverse(list);
        System.out.println(x);
        String backwards = String.join(" ", list);
        System.out.println(backwards);
        return x.equalsIgnoreCase(backwards);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("hello"));
    }
}
