package Arrays;

// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.HashMap;

public class MaxPairSumWithEqualDigits_HashMap {

    public static void main(String[] args) {
        int[] nums = {18, 43, 36, 13, 7};

        System.out.println(maximumSum(nums));
    }

    static int maximumSum(int[] nums) {
        // Map to store the maximum and second maximum numbers with the same sum of digits
        HashMap<Integer, Integer> sumToMax = new HashMap<>();
        int maxSum = -1;

        for (int num : nums) {
            int sumDigits = sumOfDigits(num);

            // If we have seen this sum of digits before
            if (sumToMax.containsKey(sumDigits)) {
                // Calculate the potential maximum sum
                maxSum = Math.max(maxSum, num + sumToMax.get(sumDigits));
                // Update the maximum number for this sum of digits
                sumToMax.put(sumDigits, Math.max(sumToMax.get(sumDigits), num));
            } else {
                // Otherwise, store the current number as the largest for this sum of digits
                sumToMax.put(sumDigits, num);
            }
        }

        return maxSum;
    }

    // Helper function to calculate the sum of digits of a number
    static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
