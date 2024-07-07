package Arrays;

public class SingleNumber_XOR {
    public static void main(String[] args) {
        int[] nums = { 4, 1, 2, 1, 2 };
        System.out.println(singleNum(nums));
    }

    static int singleNum(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
