package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 6, 7, 8, 0 };
        int key = 3;
        System.out.println(searchKey(arr, key));
    }

    static int searchKey(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("index- " + i);
                return 1;

            }
        }
        return -1;
    }
}
