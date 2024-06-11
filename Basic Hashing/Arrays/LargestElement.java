package Arrays;

import java.util.*;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = { 1, 51, 89, 25, 8, 4 };

        System.out.println(largestElement(arr));
    }

    static int largestElement(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
}
