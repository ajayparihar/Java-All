import java.util.Scanner;

/**
 * CountDigits
 */
public class CountDigits {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int resultConversion = digitCountByConversion(num);
        System.out.println("By Conversion " + resultConversion);

        int resultLog10 = digitCountByLog10(num);
        System.out.println("By Log " + resultLog10);

        scan.close();

    }

    /**
     * Counts digits in a number by converting it to string
     * @param num The number to count digits of
     * @return The number of digits
     * Time Complexity: O(log num) for integer to string conversion
     * Space Complexity: O(log num) for storing the string representation
     */
    static int digitCountByConversion(int num) {

        String len = Integer.toString(num); // integer gets converted to string
        return len.length(); // length of the string is returned

    }

    /**
     * Counts digits in a number using logarithm
     * @param num The number to count digits of
     * @return The number of digits
     * Time Complexity: O(1) as Math.log10 is constant time
     * Space Complexity: O(1) as we only use constant extra space
     */
    static int digitCountByLog10(int num) {

        int count = (int) (Math.log10(num) + 1);

        return count;
    }

}