package Arrays;

import java.util.*;

public class UnionOfArrays {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 1, 2, 3, 6, 7 };

        ArrayList<Integer> union = unionOfArrays(arr1, arr2);

        for (int i : union) {
            System.out.print(i + " ");
        }
    }

    static ArrayList<Integer> unionOfArrays(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();

        for (int i : arr1) {
            set.add(i);
        }

        for (int i : arr2) {
            set.add(i);
        }

        List<Integer> resultList = new ArrayList<>(set);
        Collections.sort(resultList);

        return new ArrayList<>(resultList);
    }
}
