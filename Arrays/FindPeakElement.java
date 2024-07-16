package Arrays;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 1, 3, 5, 6, 4 };
        System.out.println(findPeakElement(nums));
    }

    static int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[mid + 1])
                left = mid + 1;
            else
                right = mid;
        }
        return right; // || left

        // TC = O(n)
        // int peak = Integer.MIN_VALUE;
        // int index = 0;
        // for(int i = 0; i < nums.length; i++){
        // if(nums[i] > peak){
        // peak = nums[i];
        // index = i;
        // }
        // }
        // return index;
    }
}
