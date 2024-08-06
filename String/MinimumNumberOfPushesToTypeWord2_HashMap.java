package String;

import java.util.*;

public class MinimumNumberOfPushesToTypeWord2_HashMap {
    public static void main(String[] args) {
        String word = "aabbccddeeffgghhiiiiii";
        System.out.println(minimumPushes(word));
    }

    static int minimumPushes(String word) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : word.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        List<Integer> sortedFreq = new ArrayList<>(frequencyMap.values());
        Collections.sort(sortedFreq, Collections.reverseOrder());

        int totalPresses = 0;
        for (int i = 0; i < sortedFreq.size(); i++) {
            totalPresses += (i / 8 + 1) * sortedFreq.get(i);
        }
        return totalPresses;
    }
}