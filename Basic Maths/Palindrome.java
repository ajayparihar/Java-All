class Palindrome {
    public static void main(String[] args) {
        int x = 3;
        System.out.println(isPalindrome(x));
    }

    /**
     * Checks if a number is palindrome by comparing it with its reverse
     * @param x The number to check
     * @return true if the number is palindrome, false otherwise
     * Time Complexity: O(log x) where x is the input number, as we process each digit
     * Space Complexity: O(1) as we only use constant extra space
     */
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

    /**
     * Reverses the digits of a number with overflow check
     * @param x The number to reverse
     * @return The reversed number, or 0 if overflow occurs
     * Time Complexity: O(log x) where x is the input number, as we process each digit
     * Space Complexity: O(1) as we only use constant extra space
     */
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