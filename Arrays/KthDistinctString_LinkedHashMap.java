package Arrays;

import java.util.*;

public class KthDistinctString_LinkedHashMap {
    public static void main(String[] args) {
        String[] arr = { "d", "b", "c", "b", "c", "a" };
        int k = 2;

        System.out.println(kthDistinct(arr, k));
    }

    static String kthDistinct(String[] arr, int k) {
        Map<String, Integer> frequencyMap = new LinkedHashMap<>();
        for (String str : arr) {
            frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);
        }

        List<String> distinctStrings = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                distinctStrings.add(entry.getKey());
            }
        }

        if (k > distinctStrings.size()) {
            return "";
        }

        return distinctStrings.get(k - 1);
    }
}
