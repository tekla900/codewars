package seven_kyu;
// copilot:ignore

public class Kata {
    public static int sumOfMinimums(int[][] arr){


        int sum = 0;

        for (int[] ints : arr) {
            int min = arr[0][0];
            for (int anInt : ints) {
                if (anInt < min) {
                    min = anInt;
                }
            }
            sum += min;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] array = {{7, 9, 8, 6, 2}, {6, 3, 5, 4, 3}, {5, 8, 7, 4, 5}};
        System.out.println(sumOfMinimums(array)); // Output: 9 = 2 + 3 + 4
    }
}
