package seven_kyu;

/*
* You are given an odd-length array of integers,
* in which all of them are the same, except for one single number.
* Complete the method which accepts such an array, and returns that single different number.
* The input array will always be valid! (odd-length >= 3)
*/

public class StrayNumber {

    static int stray(int[] numbers) {
        int result = 0;

        for (int number : numbers) {
            result ^= number;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(stray(new int[]{1, 2, 1, 1}));
    }
}