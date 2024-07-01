package Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        System.out.println(missingNumber(nums));
    }

    static int missingNumber(int[] nums) {
        int size = nums.length;
        int expectedSum = size * (size + 1) / 2;
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        int missingNumber = expectedSum - sum;

        return missingNumber;
    }
}