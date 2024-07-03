package Arrays;

import java.util.*;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int start = 0;
        int end = 2;
        revArrayCollection(arr);
        reverseArray(arr, start, end);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void reverseArray(int[] arr, int start, int end) {

        for (int i = start; i < end - 1; i++) {
            int temp = arr[end - i];
            arr[end - i] = arr[i];
            arr[i] = temp;
        }
    }

    static void revArrayCollection(int[] arr) {

        List<Integer> arrList = new ArrayList<>();

        for (int i : arr) {
            arrList.add(i);
        }
        Collections.reverse(arrList);
        System.out.println(" Collections.Reverse");
        for (int i : arrList) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}
