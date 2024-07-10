package Arrays;

import java.util.*;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6 };
        int start = 0;
        int end = 5;
        revnumsayCollection(nums);
        reversenumsay(nums, start, end);

        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    static void reversenumsay(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    static void revnumsayCollection(int[] nums) {

        List<Integer> revNum = new ArrayList<>();

        for (int num : nums) {
            revNum.add(num);
        }
        Collections.reverse(revNum);
        System.out.println(revNum);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = revNum.get(i);
        }
    }
}
