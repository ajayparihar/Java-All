package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12 };
        moveZeroes(arr);
        System.out.println("Output: " + Arrays.toString(arr));
    }

    public static void moveZeroes(int[] nums) {
        ArrayList<Integer> finalArr = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                finalArr.add(nums[i]);
            }
        }

        // Add zeroes at the end
        for (int i = finalArr.size(); i < nums.length; i++) {
            finalArr.add(0);
        }

        // Copy elements back to the original array
        for (int i = 0; i < finalArr.size(); i++) {
            nums[i] = finalArr.get(i);
        }
    }
}
