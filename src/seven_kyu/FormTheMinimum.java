package seven_kyu;

/*
* Given a list of digits, return the smallest number that could be formed from these digits,
* using the digits only once (ignore duplicates).
*
* Notes:
* Only positive integers will be passed to the function (> 0 ), no negatives or zeros.
*/

import java.util.*;

public class FormTheMinimum {
    public static int minValue(int[] values){

        Set<Integer> uniqueSet = new LinkedHashSet<>();

        for (int element : values) {
            uniqueSet.add(element);
        }

        int[] result = new int[uniqueSet.size()];
        int index = 0;
        for (int element : uniqueSet) {
            result[index++] = element;
        }

        Arrays.sort(result);

        StringBuilder concatenatedNumber = new StringBuilder();

        for (int num : result) {
            concatenatedNumber.append(num);
        }

        return Integer.parseInt(concatenatedNumber.toString());

    }

    public static void main(String[] args) {
        System.out.println(FormTheMinimum.minValue(new int[] {1,5, 9, 3,1,8,8,9}));
    }
}
