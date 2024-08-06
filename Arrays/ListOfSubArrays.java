package Arrays;

public class ListOfSubArrays {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        printSubArrays(nums);

    }

    static void printSubArrays(int[] nums) {
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                for (int k = 0; k < j; k++) {
                    System.out.print(nums[k]);
                }
                System.out.println("");
            }
        }
    }
}
