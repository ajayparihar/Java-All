package Arrays;

import java.util.*;

public class ReverseAnArrayUsingCollections {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6 };
        reverseArrayUsingCollections(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    static void reverseArrayUsingCollections(int[] nums) {
        ArrayList<Integer> numsList = new ArrayList<>();
        for (int num : nums) {
            numsList.add(num);
        }
        Collections.reverse(numsList);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = numsList.get(i);
        }
    }
}
