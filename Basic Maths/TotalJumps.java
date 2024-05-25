public class TotalJumps {
    public static void main(String[] args) {
        int arr[] = { 0, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
        // int arr[] = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
        // int arr[] = { 8, 3, 27, 13, 13, };
        // int arr[] = { 26, 7, 10, 28, 17, 7, 24, 22, 26, 28, 14, 15, 18, 5, 2, 4, 5,
        // 1, 28, 20, 12, 13, 12, 9, 21, 29,
        // 12, 8, 22, 21, 6, 20, 28, 24, 4, 6, };

        System.out.println(minJump(arr));
    }

    static int minJump(int arr[]) {

        if (arr.length == 0) {
            return -1;
        }
        if (arr.length == 1) {
            return 1;
        }
        int hops = 1;
        int currentPosition = 0;

        while (currentPosition < arr.length) {
            if (arr[currentPosition] == 0) {
                return -1;
            }
            int nextPosition = currentPosition + arr[currentPosition];
            if (nextPosition > arr.length) {
                break;
            }
            hops++;
            currentPosition = nextPosition;
        }
        return hops;

    }
}