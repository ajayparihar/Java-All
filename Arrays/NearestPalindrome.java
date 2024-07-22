package Arrays;

public class NearestPalindrome {
    public static void main(String[] args) {
        String n = "55926598";

        System.out.println(nearestPalindromic(n));
    }

    static String nearestPalindromic(String n) {
        int num = Integer.parseInt(n);

        if (num < 10) {
            return Integer.toString(num - 1);
        }
        int smallerPalindrome = num - 1;
        int biggerPalindrome = num + 1;

        while (!isPalindrome(smallerPalindrome)) {
            smallerPalindrome--;
        }

        while (!isPalindrome(biggerPalindrome)) {
            biggerPalindrome++;
        }

        int smallDiff = num - smallerPalindrome;
        int bigDiff = biggerPalindrome - num;
        if (smallDiff == bigDiff) {
            return Integer.toString(Math.min(biggerPalindrome, smallerPalindrome));
        } else if (smallDiff < bigDiff) {
            return Integer.toString(smallerPalindrome);
        } else {
            return Integer.toString(biggerPalindrome);
        }

    }

    static boolean isPalindrome(int num) {
        int temp = num;
        int rev = 0;

        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return rev == temp;
    }
}
