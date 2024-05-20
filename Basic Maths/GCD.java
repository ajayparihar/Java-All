public class GCD {
    public static void main(String args[]) {

        int num1, num2;

        num1 = 15;
        num2 = 10;

        int result = gcdOf2Numbers(num1, num2);
        System.out.println(result);
    }

    static int gcdOf2Numbers(int num1, int num2) {

        while (num1 > 0 && num2 > 0) {
            if (num1 > num2) {

                num1 = num1 % num2;
            }

            else {
                num2 = num2 % num1;

            }
        }
        if (num1 == 0) {
            return num2;
        }
        return num1;

    }
}
