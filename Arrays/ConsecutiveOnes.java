package Arrays;

public class ConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 1, 1 };
        System.out.println(printConsecutiveOnes(arr));
    }

    static int printConsecutiveOnes(int[] arr) {
        int counter = 0;
        int maxCounter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                counter++;
            } else {
                if (counter > maxCounter) {
                    maxCounter = counter;
                }
                counter = 0;
            }
        }
        if (counter > maxCounter) {
            maxCounter = counter;
        }

        return maxCounter;
    }
}
