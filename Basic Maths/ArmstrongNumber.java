public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 371; // Define a number to check if it is an Armstrong number
        // int num = 111; // Another example number to test

        // Check if the number is an Armstrong number and print the result
        System.out.println(isArmstrongNumber(num));
    }

    // Method to check if a number is an Armstrong number
    static boolean isArmstrongNumber(int num) {
        // Convert the number to a string and get its length to determine the number of
        // digits
        int size = Integer.toString(num).length();

        // Initialize a variable to store the calculated Armstrong value
        int calculatedValue = 0;

        // Store the original number for comparison later
        int originalNum = num;

        // Loop to calculate the Armstrong value
        while (num > 0) {
            // Get the last digit of the number
            int rem = num % 10;

            // Add the power of the last digit (raised to the number of digits) to the
            // calculated value
            calculatedValue += (int) Math.pow(rem, size);

            // Remove the last digit from the number
            num = num / 10;
        }

        // Return true if the calculated Armstrong value is equal to the original
        // number, otherwise false
        return calculatedValue == originalNum;
    }
}
