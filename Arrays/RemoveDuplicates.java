package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int uniqueCount = removeDuplicates(arr);
        System.out.print("Output: " + uniqueCount + ", nums = ");
        System.out.println(Arrays.toString(arr));
    }

    static int removeDuplicates(int[] arr) {
        ArrayList<Object> finalList = new ArrayList<>();
        int counter = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                finalList.add(arr[i]);

            } else if (arr[i] == arr[i + 1]) {
                counter++;
            }
        }

        // Add the last element to the finalList
        finalList.add(arr[arr.length - 1]);

        // Copy elements back to the original array and fill remaining with underscores
        for (int i = 0; i < finalList.size(); i++) {
            arr[i] = (int) finalList.get(i);
        }
        for (int i = finalList.size(); i < arr.length; i++) {
            arr[i] = '_'; // Using underscore as a placeholder
        }

        // Return the number of unique elements
        return arr.length - counter;
    }
}