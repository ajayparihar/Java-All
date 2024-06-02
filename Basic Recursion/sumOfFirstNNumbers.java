public class sumOfFirstNNumbers {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumOfN(n));
    }

    static int sumOfN(int n) {
        if (n == 0) { // base case (when n becomes 0)
            return 0;
        } else {
            return powerOfthree(n) + sumOfN(n - 1);
            // power of 3 on n will be added to each n - 1
        }
    }

    static int powerOfthree(int n) { // power of three
        return n * n * n;
    }

}
