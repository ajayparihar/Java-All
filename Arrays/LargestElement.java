package Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = { 1, 51, 89, 25, 8, 4 };

        System.out.println(largestElement(arr));
    }

    static int largestElement(int[] arr) {
        int max = 0;
        for (int num : arr) {
            max = Math.max(max, num);
        }
        return max;
    }
}
