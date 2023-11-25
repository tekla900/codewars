package seven_kyu;

import java.lang.Math;

/*
* You might know some pretty large perfect squares. But what about the NEXT one?
* Complete the findNextSquare method that finds the next integral perfect square
* after the one passed as a parameter. Recall that an integral perfect square is an integer n
* such that sqrt(n) is also an integer.
*
* If the parameter is itself not a perfect square then -1 should be returned.
* You may assume the parameter is non-negative.
*/

public class NumberFun {
    public static long findNextSquare(long sq) {
        double sqrt = Math.sqrt(sq);
        int roundedSqrt = (int) Math.round(sqrt);

        if(sqrt == roundedSqrt) return (long) ((sqrt + 1) * (sqrt + 1));

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findNextSquare(121));
        System.out.println(findNextSquare(123));
    }
}