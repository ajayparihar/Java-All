class ReverseDigits {

    public static void main(String[] args) {
        // Call the reverse method with an integer value that causes overflow
        int result = reverse(1534236469);

        // Print the result
        System.out.println(result);
    }

    /**
     * Reverses the digits of an integer, handling negative numbers
     * @param x The number to reverse
     * @return The reversed number, or 0 if overflow occurs
     * Time Complexity: O(log |x|) where |x| is the absolute value of input number
     * Space Complexity: O(1) as we only use constant extra space
     */
    public static int reverse(int x) {
        int rev = 0;

        // Check if the number is negative
        if (x < 0) {
            // Reverse the digits and return the negative result
            rev = reverseDigits(Math.abs(x));
            return -rev;
        } else {
            // Reverse the digits and return the positive result
            rev = reverseDigits(x);
            return rev;
        }
    }

    /**
     * Helper method to reverse the digits of a positive integer with overflow check
     * @param x The positive number to reverse
     * @return The reversed number, or 0 if overflow occurs
     * Time Complexity: O(log x) where x is the input number
     * Space Complexity: O(1) as we only use constant extra space
     */
    static int reverseDigits(int x) {
        // Use a double to store the reversed value to detect overflow
        double rev = 0;

        // Loop to reverse the digits of x
        while (x > 0) {
            // Extract the last digit of x
            int temp = x % 10;

            // Update rev by shifting existing digits left and adding the new digit
            rev = (rev * 10) + temp;

            // Check for overflow by comparing rev to Integer.MAX_VALUE
            if (rev > Integer.MAX_VALUE) {
                return 0;
            }

            // Remove the last digit from x
            x = x / 10;
        }

        // Convert rev back to int from double and return it
        return (int) rev;
    }
}
