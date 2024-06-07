import java.util.Arrays;

public class reverseAnArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int[] result = reversedArray(arr); // Call the method to reverse the array
        System.out.println(Arrays.toString(result)); // Print the reversed array
    }

    // Method to initiate the recursive reversal of the array
    static int[] reversedArray(int[] arr) {
        return reverseArrayRecursive(arr, arr.length - 1); // Call the recursive method
    }

    // Recursive method to reverse the array
    static int[] reverseArrayRecursive(int[] arr, int index) {
        if (index < 0) { // Base case: when all elements are processed
            return new int[arr.length]; // Return a new array of the same length
        }

        int[] revArray = reverseArrayRecursive(arr, index - 1); // Recursive call
        // Assign the current element from the original array to the reversed position
        int position = arr.length - 1 - index;
        revArray[position] = arr[index];
        System.out.println(position);
        System.out.println("Index- " + index);
        return revArray; // Return the reversed array
    }
}
