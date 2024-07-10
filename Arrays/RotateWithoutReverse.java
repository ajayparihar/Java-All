package Arrays;

public class RotateWithoutReverse {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6 };
        int k = 3;
        rotateArray(nums, k);

        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    static void rotateArray(int[] nums, int k) {
        int size = nums.length;
        k = k % size;

        if (k == 0)
            return;

        // Save temp

        int[] temp = new int[k];

        for (int i = 0; i < k; i++) {
            temp[i] = nums[size - k + i];
        }

        // Scoot

        for (int i = size - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }

        // add temp

        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
}
