package eight_kyu;

/*
* In this simple exercise, you will build a program that
* takes a value, integer , and returns a list of its multiples
* up to another value, limit . If limit is a multiple of integer,
* it should be included as well. There will only ever be positive
* integers passed into the function, not consisting of 0.
* The limit will always be higher than the base.
*
* For example, if the parameters passed are (2, 6),
* the function should return [2, 4, 6]
* as 2, 4, and 6 are the multiples of 2 up to 6.
 * */

public class Multiples {
    public static int[] find(int base, int limit) {
        int length = 0;

        // Count the number of multiples
        for(int i = base; i <= limit; i++) {
            if (i % base == 0) {
                length++;
            }
        }

        // Create an array to store the multiples
        int[] nums = new int[length];

        int index = 0;
        for (int k = base; k <= limit; k++) {
            if (k % base == 0) {
                nums[index++] = k;
            }
        }

        return nums;
    }
}