package Arrays;

import java.util.*;

public class SortThePeople {
    public static void main(String[] args) {
        String[] names = { "Mary", "John", "Emma" };
        int[] heights = { 180, 165, 170 };

        String[] sortedNames = sortPeople(names, heights);
        System.out.println(Arrays.toString(sortedNames));
    }

    static String[] sortPeople(String[] names, int[] heights) {
        int size = heights.length;

        Map<Integer, String> heightsAndNamesMap = new HashMap<>();

        for (int i = 0; i < size; i++) {
            heightsAndNamesMap.put(heights[i], names[i]);
        }

        Arrays.sort(heights);

        String[] sortedNames = new String[size];

        for (int i = 0; i < size; i++) {
            sortedNames[i] = heightsAndNamesMap.get(heights[size - 1 - i]);
        }
        return sortedNames;
    }
}
