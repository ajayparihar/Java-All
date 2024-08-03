package Arrays;

public class MakeTwoArraysEqualByReversingSubarrays {
    public static void main(String[] args) {
        int[] target = { 1, 2, 3, 4 };
        int[] arr = { 2, 4, 1, 3 };
        System.out.println(canBeEqual(target, arr));
    }

    static boolean canBeEqual(int[] target, int[] arr) {
        int[] frequency = new int[1001];

        for (int num : target) {
            frequency[num]++;
        }

        for (int num : arr) {
            frequency[num]--;
        }

        for (int count : frequency) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
