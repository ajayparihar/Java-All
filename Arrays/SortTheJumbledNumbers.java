package Arrays;

import java.util.*;

public class SortTheJumbledNumbers {
    public static void main(String[] args) {
        int[] mapping = { 8, 9, 4, 0, 2, 1, 3, 5, 7, 6 };
        int[] nums = { 991, 338, 38 };

        int[] sortedNums = sortJumbled(mapping, nums);

        System.out.println(Arrays.toString(sortedNums));
    }

    private static int mapNumber(int num, int[] mapping) {
        StringBuilder mappedStr = new StringBuilder();
        String numStr = String.valueOf(num);

        for (char digit : numStr.toCharArray()) {
            int mappedDigit = mapping[digit - '0'];
            mappedStr.append(mappedDigit);
        }
        return Integer.parseInt(mappedStr.toString());
    }

    public static int[] sortJumbled(int[] mapping, int[] nums) {
        List<int[]> mappedList = new ArrayList<>();

        for (int num : nums) {
            mappedList.add(new int[] { num, mapNumber(num, mapping) });
        }

        Collections.sort(mappedList, Comparator.comparingInt(a -> a[1]));

        int[] sortedNums = new int[nums.length];
        for (int i = 0; i < mappedList.size(); i++) {
            sortedNums[i] = mappedList.get(i)[0];
        }
        return sortedNums;
    }
}
