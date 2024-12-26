package tasks.medium.strings;

import java.util.*;

import static java.util.Collections.reverseOrder;

public class SortCharsByFrequency {

    /**
     * Runtime: 16 ms;
     * Memory: 45.71 MB;
     * @param s Enter string
     * @return Sorted by frequency string
     */
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char i: s.toCharArray()) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(reverseOrder(Map.Entry.comparingByValue()));

        StringBuilder str = new StringBuilder();

        for (Map.Entry<Character, Integer> characterIntegerEntry : list) {
            char k = characterIntegerEntry.getKey();
            char[] arr = new char[characterIntegerEntry.getValue()];
            Arrays.fill(arr, k);
            str.append(String.valueOf(arr));
        }

        return str.toString();
    }
}
