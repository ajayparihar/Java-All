public class CountDigitsAndProd {
    public static void main(String[] args) {
        // Define an integer N to count digits that evenly divide N
        int N = 22074;

        // Call the evenlyDivides method and store the result
        int result = isEvenlyDivides(N);

        // Print the result
        System.out.println(result);
    }

    // Method to count the number of digits in N that evenly divide N
    static int isEvenlyDivides(int N) {
        // Store the original number in a temporary variable
        int temp = N;

        // Initialize a counter to count the digits that evenly divide N
        int flag = 0;

        // Loop to process each digit of N
        while (N > 0) {
            // Get the last digit of N
            int rem = N % 10;

            // Check if the digit is not zero and if it evenly divides the original number
            if ((rem != 0) && (temp % rem) == 0) {
                // Increment the counter if the condition is met
                flag++;
            }

            // Remove the last digit from N
            N = N / 10;
        }

        // Return the count of digits that evenly divide the original number
        return flag;
    }
}
