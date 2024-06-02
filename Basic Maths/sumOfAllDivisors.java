public class sumOfAllDivisors {
    public static void main(String[] args) {
        // Define the number N for which we want to find the sum of all divisors
        int N = 66600;

        // Call the sumOfDivisors method and directly print the result
        System.out.println(sumOfDivisors(N));
    }

    // Method to calculate the sum of all divisors of N
    static long sumOfDivisors(int N) {
        // Initialize the sum to 0
        long sum = 0;

        // Loop from 1 to N to find all divisors
        for (int i = 1; i <= N; i++) {
            // For each i, add i multiplied by the quotient of N divided by i to the sum
            sum += (long) i * (N / i);
        }
        // Return the total sum of all divisors
        return sum;
    }
}
