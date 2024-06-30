package Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        System.out.println(missingNumber(nums));
    }

    static int missingNumber(int[] nums) {
        int numsLength = nums.length;
        int expectedSum = numsLength * (numsLength + 1) / 2;
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        int missingNum = expectedSum - sum;
        return missingNum;
    }
}
