package Arrays;

import java.util.Arrays;

public class SumOfSubArrays {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int[] resultArray = sumOfSubArrays(nums);
        // Arrays.sort(resultArray);

        System.out.print(Arrays.toString(resultArray));
    }

    static int[] sumOfSubArrays(int[] nums) {
        int n = nums.length;
        int totalSubarrays = (n * (n + 1)) / 2;
        int[] subarraySums = new int[totalSubarrays];
        int index = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                subarraySums[index++] = sum;
            }
        }
        return subarraySums;
    }
}
