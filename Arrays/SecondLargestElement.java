package Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = { 1, 51, 89, 25, 8, 4 };
        int n = arr.length;

        System.out.println(secLargestElement(arr, n));
    }

    static int secLargestElement(int[] arr, int n) {
        int maxNum = Integer.MIN_VALUE;
        int secMaxNum = Integer.MIN_VALUE;

        if (arr.length < 2)
            return -1;

        for (int num : arr) {
            if (num > maxNum) {
                secMaxNum = maxNum;
                maxNum = num;
            } else if (num > secMaxNum && num != maxNum) {
                secMaxNum = num;
            }
        }
        return secMaxNum;
    }
}
