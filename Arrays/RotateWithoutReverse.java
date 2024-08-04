package Arrays;

public class RotateWithoutReverse {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        rotateArray(nums, k);

        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    static void rotateArray(int[] nums, int k) {
        int size = nums.length;
        k = k % size;
        int splitIndex = size - k;

        if (k == 0)
            return;

        int[] tempArray = new int[splitIndex];

        for (int i = 0; i < splitIndex; i++) {
            tempArray[i] = nums[i];
        }

        for (int i = 0; i < k; i++) {
            nums[i] = nums[splitIndex + i];
        }

        for (int i = 0; i < splitIndex; i++) {
            nums[k + i] = tempArray[i];
        }
    }
}
