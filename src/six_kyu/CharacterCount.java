package six_kyu;

import java.util.Map;
import java.util.HashMap;

/*
* The main idea is to count all the occurring characters in a string.
* If you have a string like aba, then the result should be {'a': 2, 'b': 1}.
*
* What if the string is empty? Then the result should be empty object literal, {}.
*/

public class CharacterCount {
    public static Map<Character, Integer> count(String str) {
        if (str.length() == 0) return new HashMap<>();

        Map<Character, Integer> countMap = new HashMap<>();


        for (char c : str.toCharArray()) {
            if(!countMap.containsKey(c)) {
                countMap.put(c, 1);
            } else {
                countMap.put(c, countMap.get(c) + 1);
            }
        }

        return countMap;
    }

    public static void main(String[] args) {
        System.out.println(count("aba"));
    }
}