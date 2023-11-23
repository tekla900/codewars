package eight_kyu;

public class Between {
    public static int[] between(int a, int b) {
        int[] intArray = new int[b-a+1];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = a++;
        }
        return intArray;
    }
}
