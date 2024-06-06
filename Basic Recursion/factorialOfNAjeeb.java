import java.util.ArrayList;

public class factorialOfNAjeeb {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(factorialNumbers(n));
    }

    static ArrayList<Long> factorialNumbers(long N) {
        ArrayList<Long> result = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (factorial(i) > N) {
                return result;
            }
            result.add(factorial(i));
        }
        return result;
    }

    static long factorial(int N) {
        if ((N == 0) || (N == 1)) {
            return 1;
        }
        return N * factorial(N - 1);
    }
}