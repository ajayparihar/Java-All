import java.util.Arrays;

public class LCM_GCD {
    public static void main(String[] args) {
        Long A = (long) 5;
        Long B = (long) 10;
        Long[] result = lcmAndGcd(A, B);
        System.out.println(String.format("%d %d", result[0], result[1]));

    }

    static Long[] lcmAndGcd(Long A, Long B) {
        Long plus = A + B;
        Long Min = A - B;
        return new Long[] { plus, Min };
    }
}
