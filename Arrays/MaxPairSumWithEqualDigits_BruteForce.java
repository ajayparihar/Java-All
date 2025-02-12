package Arrays;

// Time Complexity: O(n^2)
// Space Complexity: O(n)
public class MaxPairSumWithEqualDigits_BruteForce {

    public static void main(String[] args) {
        int[] nums = {18, 43, 36, 13, 7};

        System.out.println(maximumSum(nums));
    }

    static int maximumSum(int[] nums) {
        int[] sumOfNum = new int[nums.length];
        int index = 0;
        // Calculate the sum of digits for each number in the array
        for (int i : nums) {
            sumOfNum[index] = sumOfDigits(i);
            index++;
        }
        int maxSum = 0;
        int counter = 0;
        // Compare each pair of numbers to find the maximum sum of pairs with equal digit sums
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (sumOfNum[i] == sumOfNum[j]) {
                    counter++;
                    maxSum = Math.max(maxSum, nums[i] + nums[j]);
                }
            }
        }
        // If no pairs found, return -1
        if (counter == 0) {
            return -1;
        }
        return maxSum;
    }

    // Helper method to calculate the sum of digits of a number
    static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
