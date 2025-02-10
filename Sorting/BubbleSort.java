package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 3, 9, 7 };
        bubbleSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void bubbleSort(int[] arr) {
        int lastElem = arr.length - 1;
        for (int i = 0; i < lastElem; i++) {

            boolean swapped = false;

            for (int j = 0; j < lastElem - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j);
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

    static void swap(int[] arr, int i) {
        int firstElement = i;
        int secondElement = i + 1;

        int temp = arr[firstElement];
        arr[firstElement] = arr[secondElement];
        arr[secondElement] = temp;
    }
}
