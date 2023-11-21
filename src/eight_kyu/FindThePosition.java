package eight_kyu;

/*
* When provided with a letter, return its position in the alphabet.
* Input :: "a"
* Ouput :: "Position of alphabet: 1"
*/

public class FindThePosition {
    public static String position(char alphabet)
    {
        return "Position of alphabet: " + (alphabet - 96);
    }

    public static void main(String[] args) {
        System.out.println(FindThePosition.position('a'));
        System.out.println(FindThePosition.position('b'));
        System.out.println(FindThePosition.position('c'));
        System.out.println(FindThePosition.position('z'));
    }
}
