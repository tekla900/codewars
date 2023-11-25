package eight_kyu;

public class Pipes {
    public static int[] pipeFix(int[] numbers) {

        int first = numbers[0];
        int last = numbers[numbers.length-1];

        int[] newNumbers = new int[last-first+1];
        for(int i = first; i <= last; i++) {
            newNumbers[i-first] = i;
        }

        return newNumbers;
    }
}