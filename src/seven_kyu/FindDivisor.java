package seven_kyu;

/*
* Count the number of divisors of a positive integer n.
*
* Note you should only return a number, the count of divisors.
* The numbers between parentheses are shown only for you
* to see which numbers are counted in each case.
*/

public class FindDivisor {

    public long numberOfDivisors(int n) {
        int count = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        FindDivisor findDivisor = new FindDivisor();
        System.out.println(findDivisor.numberOfDivisors(30));
    }
}
