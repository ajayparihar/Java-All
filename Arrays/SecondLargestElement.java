package Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = { 1, 51, 89, 25, 8, 4 };
        int n = arr.length;

        System.out.println(secLargestElement(arr, n));
    }

    static int secLargestElement(int[] arr, int n) {
        if (n > 1) {
            int big = 0;
            int secBig = -1;
            for (int i = 0; i < n; i++) { // biggest in array
                if (arr[i] > big) {
                    big = arr[i];
                }
            }
            for (int i = 0; i < n; i++) {
                if (arr[i] > secBig && arr[i] != big) { // Biggest in array accept "big"
                    secBig = arr[i];
                }
            }
            return secBig;
            // Arrays.sort(arr);
            // return arr[arr.length - 2];
        }
        return -1;
    }
}
