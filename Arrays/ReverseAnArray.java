package Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6 };
        int start = 0;
        int end = 5;
        reverseArray(nums, start, end);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    static void reverseArray(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}
