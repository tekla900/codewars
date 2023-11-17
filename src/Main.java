import eight_kyu.*;

import java.lang.reflect.Array;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        System.out.println(GrassHopper.summation(2));

        System.out.println(DoubleChar.doubleChar("as"));

        System.out.println(CalculateAverage.find_average(new int[]{}));

        SumMixedArray sumArray = new SumMixedArray();
        System.out.println(sumArray.sum(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));

        String[] sumStringArray = new String[] {"first", "second"};

        System.out.println(AreYouPlayingBanjo.areYouPlayingBanjo("Rikke"));

        System.out.println(HolidayDutyFree.dutyFree(17, 10, 500));

        Multiples multiples = new Multiples();
        int[] result = multiples.find(2, 8);

        System.out.println(Arrays.toString(result));

        System.out.println(VowelRemover.shortcut("abcde"));
    }
}