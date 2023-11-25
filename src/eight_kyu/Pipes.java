package eight_kyu;

/*
* Issue
* Looks like some hoodlum plumber and his brother has been running around and damaging your stages again.
* The pipes connecting your level's stages together need to be fixed before you receive any more complaints.
* The pipes are correct when each pipe after the first is 1 more than the previous one.

* Task
* Given a list of unique numbers sorted in ascending order,
* return a new list so that the values increment by 1 for each index
* from the minimum value up to the maximum value (both included).
*/

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