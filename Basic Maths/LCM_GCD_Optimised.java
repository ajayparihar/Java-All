public class LCM_GCD_Optimised {
    public static void main(String[] args) {
        // Define two Long numbers A and B
        Long A = 5L;
        Long B = 10L;

        // Call the lcmAndGcd method to calculate LCM and GCD
        Long[] result = lcmAndGcd(A, B);

        // Print the results
        System.out.println(String.format("%d %d", result[0], result[1]));
    }

    /**
     * Calculates both LCM and GCD of two numbers
     * @param A First number
     * @param B Second number
     * @return Array containing LCM at index 0 and GCD at index 1
     * Time Complexity: O(log(min(A,B))) due to Euclidean algorithm
     * Space Complexity: O(1) as we only use constant extra space
     */
    static Long[] lcmAndGcd(Long A, Long B) {
        // If either A or B is zero, return LCM as 0 and GCD as the non-zero number
        if (A == 0 || B == 0) {
            return new Long[] { 0L, A == 0 ? B : A };
        }

        // Calculate GCD using the gcd method
        Long gcd = gcd(A, B);

        // Calculate LCM using the relationship LCM(A, B) = (A * B) / GCD(A, B)
        Long lcm = (A * B) / gcd;

        // Return both LCM and GCD as an array
        return new Long[] { lcm, gcd };
    }

    /**
     * Calculates the GCD using the Euclidean algorithm
     * @param A First number
     * @param B Second number
     * @return GCD of A and B
     * Time Complexity: O(log(min(A,B))) for Euclidean algorithm
     * Space Complexity: O(1) as we only use constant extra space
     */
    static Long gcd(Long A, Long B) {
        // Iterate until B becomes 0
        while (B != 0) {
            // Temporarily store B
            Long temp = B;
            // Set B to the remainder of A divided by B
            B = A % B;
            // Set A to the value of temp (previous B)
            A = temp;
        }
        // When B is 0, A contains the GCD
        return A;
    }
}
