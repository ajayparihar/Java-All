package Arrays;

import java.util.*;

public class SortArrayByIncreasingFrequency {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 2, 2, 3 };
        int[] result = frequencySort(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    static int[] frequencySort(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> uniqueNumbers = new ArrayList<>(frequencyMap.keySet());
        uniqueNumbers.sort((a, b) -> {
            int freqComparison = Integer.compare(frequencyMap.get(a), frequencyMap.get(b));
            return freqComparison != 0 ? freqComparison : Integer.compare(b, a);
        });

        int[] result = new int[nums.length];
        int index = 0;
        for (int num : uniqueNumbers) {
            int frequency = frequencyMap.get(num);
            Arrays.fill(result, index, index + frequency, num);
            index += frequency;
        }

        return result;
    }
}
