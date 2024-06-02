public class factorialOfN {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factOfN(n));
    }

    static int factOfN(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factOfN(n - 1);
        }
    }
}
