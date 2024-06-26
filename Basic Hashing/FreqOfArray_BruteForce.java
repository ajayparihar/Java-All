public class FreqOfArray_BruteForce {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 2, 3, 5 };
        int n = 5;
        freqOfArray(arr, n); // calling function;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void freqOfArray(int[] arr, int n) {
        int[] freq = new int[n + 1]; // counting should start from 1, need one extra space for the last element
        int counter = 0;
        for (int i = 0; i < n + 1; i++) { // i will go from 0 to n + 1(last element)
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) { // compares the value of i in the array
                    counter++; // increasing counter by 1
                }
            }
            freq[i] = counter; // adding value of counter in freq(i)th place
            counter = 0; // reset the counter;
        }

        for (int i = 0; i < n; i++) { // replacing the element of arr with element of freq
            arr[i] = freq[i + 1];
        }
    }
}
