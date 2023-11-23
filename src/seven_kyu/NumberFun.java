package seven_kyu;

import java.lang.Math;

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