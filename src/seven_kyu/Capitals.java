package seven_kyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Write a function that takes a single non-empty string of only lowercase
and uppercase ascii letters (word) as its argument,
and returns an ordered list containing the indices of all capital
(uppercase) letters in the string.
 */

public class Capitals{
    public static int[] capitals(String s){
        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                nums.add(i);
            }
        }

        int[] result = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            result[i] = nums.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(capitals("CodeWaRs")));
    }
}