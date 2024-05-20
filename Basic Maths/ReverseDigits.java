class ReverseDigits {

    public static void main(String[] args) {

        int result = reverse(1534236469); // Int overflow value
        System.out.println(result);
    }

    public static int reverse(int x) {

        int rev = 0;

        if (x <= 0) { // When x is Negative
            rev = revClass(x);
            return -rev;
        } else { // When x is Positive
            rev = revClass(x);
            return rev;
        }
    }

    static int revClass(int x) {

        x = Math.abs(x); // Absolute value of x (ie, Positive)
        double rev = 0;
        /**
         * rev is doubled because, to measure the overflow we need the bigger container.
         * Can't measure it inside int.
         */

        while (x > 0) {
            int temp = x % 10;
            rev = (rev * 10) + temp;
            boolean overflow = rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE;
            /**
             * checking when rev is overflowing.
             * will stop the iteration once it overflows.
             * Thats why it is placed here instead of at the place of return.
             */

            if (overflow) { // when overflow is == true, return 0.
                return 0;
            }
            x = x / 10;
        }
        return (int) rev; // need to convert back to int from double.
    }
}
