package eight_kyu;

/*
* Complete the function that takes two integers (a, b, where a < b)
* and return an array of all integers between the input parameters, including them.
*/

public class Between {
    public static int[] between(int a, int b) {
        int[] intArray = new int[b-a+1];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = a++;
        }
        return intArray;
    }
}
