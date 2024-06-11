package Arrays;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = { 1, 51, 89, 25, 8, 4 };
        int n = arr.length;

        System.out.println(secLargestElement(arr, n));
    }

    static int secLargestElement(int[] arr, int n) {
        if (n > 1) {
            int first = Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                if (arr[i] > first) {
                    second = first;
                    first = arr[i];
                }

                else if (arr[i] > second && arr[i] != first) {
                    second = arr[i];
                }
            }
            return second;
            // Arrays.sort(arr);
            // return arr[arr.length - 2];
        }
        return -1;
    }
}
