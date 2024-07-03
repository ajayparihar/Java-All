package Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        reverseArray(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void reverseArray(int[] arr) {
        int size = arr.length;

        for (int i = 0; i < size / 2; i++) { // we need half of the size (sec half is replaced by first half)
            int temp = arr[size - 1 - i]; // size - 1 is last item
            arr[size - 1 - i] = arr[i];
            arr[i] = temp;
        }
    }

}
