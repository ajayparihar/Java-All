package Arrays;

import java.util.*;

public class RangeSumOfSortedSubarraySums {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int n = 4;
        int left = 1;
        int right = 5;
        System.out.println(rangeSum(nums, n, left, right));
    }

    static int rangeSum(int[] nums, int n, int left, int right) {
        final int MOD = 1000000007;
        List<Integer> subarraySums = new ArrayList<>();

        for (int start = 0; start < n; start++) {
            int currentSum = 0;
            for (int end = start; end < n; end++) {
                currentSum += nums[end];
                subarraySums.add(currentSum);
            }
        }

        Collections.sort(subarraySums);

        int totalSum = 0;
        for (int i = left - 1; i < right; i++) {
            totalSum = (totalSum + subarraySums.get(i)) % MOD;
        }
        return (int) totalSum;
    }
}
