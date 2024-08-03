package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeaders {
    public static void main(String[] args) {
        int[] arr = { 16, 17, 4, 3, 5, 2 };
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        result = findLeaders(arr, n);
        System.out.println(result);
    }

    static ArrayList<Integer> findLeaders(int[] arr, int n) {
        ArrayList<Integer> leadersList = new ArrayList<>();

        if (n == 0) {
            return leadersList;
        }

        int leader = arr[n - 1];
        leadersList.add(leader);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= leader) {
                leader = arr[i];
                leadersList.add(leader);
            }
        }
        Collections.reverse(leadersList);
        return leadersList;
    }
}
