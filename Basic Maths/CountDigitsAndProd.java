public class CountDigitsAndProd {
    public static void main(String[] args) {

        int N = 22074;
        int result = evenlyDivides(N);
        System.out.println(result);
    }

    static int evenlyDivides(int N) {

        int temp = N;
        int flag = 0;

        while (N > 0) {
            int rem = N % 10; // Last digit of N
            // System.out.println("rem " + rem);
            if ((rem != 0) && (temp % rem) == 0) { // if rem of temp(N) is 0
                flag++; // add 1 to the flag
            }
            N = N / 10; // Divide N by 10 to remove the last no and so on...
        }
        return flag;
    }
}