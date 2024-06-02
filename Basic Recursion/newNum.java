public class newNum {
    public static void main(String[] args) {
        int N = 5;
        int result = sumOfN(N);

        System.out.println(result);
    }

    static int sumOfN(int N) {

        if (N == 0) {
            return 0;
        } else {
            return N + sumOfN(N - 1);
        }
    }
}
