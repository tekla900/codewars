import eight_kyu.*;
import seven_kyu.ExesAndOhs;

import java.lang.reflect.Array;
import java.util.Arrays;

import static eight_kyu.YouOnlyNeedOneB.check;


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

        Object[] array = {1, "apple", 3.14, "banana"};
        Object valueToCheck = "apple";
        boolean res = check(array, valueToCheck);
        System.out.println(res);

        String input = "23542";
        String output = FakeBinary.fakeBin(input);
        System.out.println(output);

        System.out.println(ExesAndOhs.getXO("xasOOo"));
    }
}