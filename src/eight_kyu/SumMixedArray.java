package eight_kyu;

import java.util.List;

/*
* Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.
* Return your answer as a number.
*/

public class SumMixedArray {

    /*
     * Assume input will be only of Integer or String type
     */
    public int sum(List<?> mixed) {
        int sum = 0;

        for (Object element : mixed) {
            if (element instanceof String) {
                sum += Integer.parseInt((String) element);
            } else if (element instanceof Integer) {
                sum += (Integer) element;
            }
        }
        return sum;
    }
}