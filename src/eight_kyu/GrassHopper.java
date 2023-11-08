package eight_kyu;

/*
* Write a program that finds the summation of every number from 1 to num.
* The number will always be a positive integer greater than 0.
*/

public class GrassHopper {

    public static int summation(int n) {
        return n > 0 ? n + summation(n-1) : 0;
    }
}
