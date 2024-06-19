package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 3, 9, 7 };
        selectionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void selectionSort(int[] arr) {

        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

    }
}
