class Palindrome {
    public static void main(String[] args) {
        int x = 3;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {

        int temp = x;

        if (x < 0) { // False when x is negative.
            return false;
        }

        if (temp == reverse(x)) { // if initial value of x is equal to the reverse(x)- True.
            return true;
        }
        return false; // class is boolean, output is either True or False.

    }

    static int reverse(int x) { // Same reverse logic is explained in "ReverseDigit.java" File.

        double rev = 0;
        while (x > 0) {
            int rem = x % 10;
            rev = (rev * 10) + rem;
            boolean overflow = rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE;
            if (overflow) {
                return 0;
            }
            x = x / 10;
        }
        return (int) rev;
    }
}