import eight_kyu.CalculateAverage;
import eight_kyu.DoubleChar;
import eight_kyu.GrassHopper;
import eight_kyu.SumMixedArray;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        System.out.println(GrassHopper.summation(2));

        System.out.println(DoubleChar.doubleChar("as"));

        System.out.println(CalculateAverage.find_average(new int[]{}));

        SumMixedArray sumArray = new SumMixedArray();
        System.out.println(sumArray.sum(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
    }
}