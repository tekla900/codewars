package eight_kyu;

/*
* Write a function which calculates the average of the numbers in a given list.
* Note: Empty arrays should return 0.
*/

public class CalculateAverage {
    public static double find_average(int[] array){
        double sum = 0;
        for (int each: array) {
            sum += each;
        }

        return array.length == 0 ? 0 : sum / array.length;
    }
}
