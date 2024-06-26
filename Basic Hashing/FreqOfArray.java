import java.util.HashMap;

public class FreqOfArray {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 2, 3, 5 };
        int n = 5;
        int p = 5;
        freqOfArray(arr, n, p);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void freqOfArray(int[] arr, int n, int p) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 1 && arr[i] <= p) {
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }
        }

        for (int i = 0; i < n; i++) {
            if (map.containsKey(i + 1)) {
                arr[i] = map.get(i + 1);
            } else {
                arr[i] = 0;
            }
        }
    }
}
