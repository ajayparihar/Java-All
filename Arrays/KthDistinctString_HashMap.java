package Arrays;

import java.util.*;

public class KthDistinctString_HashMap {
    public static void main(String[] args) {
        String[] arr = { "d", "b", "c", "b", "c", "a" };
        int k = 2;

        System.out.println(kthDistinct(arr, k));
    }

    static String kthDistinct(String[] arr, int k) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        List<String> distinctStrings = new ArrayList<>();

        for (String str : arr) {
            frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);
            if (frequencyMap.get(str) == 1) {
                distinctStrings.add(str);
            } else if (frequencyMap.get(str) == 2) {
                distinctStrings.remove(str);
            }
        }

        if (k > distinctStrings.size()) {
            return "";
        }

        return distinctStrings.get(k - 1);
    }
}
