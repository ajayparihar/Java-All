package String;

import java.util.*;

public class MinimumNumberOfPushesToTypeWord2_FrequencyArray {
    public static void main(String[] args) {
        String word = "aabbccddeeffgghhiiiiii";
        System.out.println(minimumPushes(word));
    }

    static int minimumPushes(String word) {
        int[] frequencyArray = new int[26];

        for (char ch : word.toCharArray()) {
            frequencyArray[ch - 'a']++;
        }
        Integer[] sortedFrequency = new Integer[26];

        for (int i = 0; i < 26; i++) {
            sortedFrequency[i] = frequencyArray[i];
        }

        Arrays.sort(sortedFrequency, Collections.reverseOrder());

        int totalPresses = 0;
        for (int i = 0; i < 26; i++) {
            if (sortedFrequency[i] == 0) {
                break;
            }
            totalPresses += (i / 8 + 1) * sortedFrequency[i];
        }

        return totalPresses;
    }
}
