package Arrays;

public class RotateWithoutReverse {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int k = 3;
        rotateArray(arr, k);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        if (k == 0)
            return;

        int[] temp = new int[k];

        for (int i = 0; i < k; i++) { // add last k elements to temp
            temp[i] = arr[n - k + i];
        }

        for (int i = n - 1; i >= k; i--) {
            arr[i] = arr[i - k];
        }

        for (int i = 0; i < k; i++) { // add last temp elements to starting of arr
            arr[i] = temp[i];
        }
    }
}
