package eight_kyu;

import java.util.Arrays;

public class SumArray {

    public static double sum(double[] numbers) {

        return Arrays.stream(numbers).sum();

    }

    public static void main(String[] args) {
        System.out.println(sum(new double[] {1, 5.2, 4, 0, -1}));
    }
}
