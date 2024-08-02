public class SquareRoot {
    public static void main(String[] args) {
        int x = 2147395599;
        System.out.println(squareRoot(x));
    }

    static int squareRoot(int x) {
        if (x == 0 || x == 1)
            return x;

        int left = 0;
        int right = x / 2;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;

            if (square == x)
                return mid;

            if (square < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
}
