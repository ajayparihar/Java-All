package Sorting;

import java.util.*;

public class SortCharacters {
    public static void main(String[] args) {
        String str = "ddccaabb";
        sortString(str);
        System.out.println(str);
    }

    static void sortString(String str) {
        char[] sortedChar = str.toCharArray();
        Arrays.sort(sortedChar);

        str = new String(sortedChar);
        System.out.println(str);
    }
}
