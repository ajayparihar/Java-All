public class LCM_GCD {
    public static void main(String[] args) {
        // Define two Long numbers A and B
        Long A = (long) 20;
        Long B = (long) 30;

        // Call the lcmAndGcd method to calculate LCM and GCD
        Long[] result = lcmAndGcd(A, B);

        // Print the results
        System.out.println(String.format("%d %d", result[0], result[1]));
    }

    // Method to calculate both LCM and GCD of two numbers
    static Long[] lcmAndGcd(Long A, Long B) {
        // Find the maximum and minimum of the two numbers
        Long max = maxNumberFinder(A, B);
        Long min = (A + B) - max;

        // Initialize LCM and GCD
        Long lcm = (long) 0;
        Long gcd = (long) 0;

        // If either A or B is zero, return LCM as 0 and GCD as 0
        if (A == 0 || B == 0 || (A == 0 && B == 0)) {
            return new Long[] { (long) 0, (long) 0 };
        }
        // If both numbers are the same, LCM is the number itself
        else if (A == B) {
            lcm = (long) A;
        }

        // Loop to find the GCD
        for (Long j = min; j >= 1; j--) {
            Long minJ = min % j;
            Long maxJ = max % j;
            if ((minJ == 0) && (maxJ == 0)) {
                gcd = (long) j;
                break;
            }
        }

        // Calculate LCM using the formula: LCM = (A * B) / GCD
        lcm = (A * B) / gcd;

        // Return both LCM and GCD as an array
        return new Long[] { lcm, gcd };
    }

    // Helper method to find the maximum of two numbers
    static Long maxNumberFinder(Long A, Long B) {
        return A > B ? A : B;
    }
}
