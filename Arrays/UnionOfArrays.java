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
        Set<Integer> unionSet = new HashSet<>();

        for (int elementOfArr1 : arr1) {
            unionSet.add(elementOfArr1);
        }

        for (int elementOfArr2 : arr2) {
            unionSet.add(elementOfArr2);
        }

        List<Integer> resultList = new ArrayList<>(unionSet);
        Collections.sort(resultList);

        return new ArrayList<>(resultList);
    }
}
