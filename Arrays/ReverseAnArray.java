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
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;

            start++;
            end--;
        }
    }

    static void revnumsayCollection(int[] nums) {

        List<Integer> numsList = new ArrayList<>();

        for (int i : nums) {
            numsList.add(i);
        }
        Collections.reverse(numsList);
        System.out.println(" Collections.Reverse");
        for (int i : numsList) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}
