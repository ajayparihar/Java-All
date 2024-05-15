/**
 * ReverseDigits
 */
public class ReverseDigits {

    public static void main(String[] args) {

        int num = 12300;

        int result = revDigit(num);
        System.out.println(result);

    }

    static int revDigit(int num) {

        int revNum = 0;

        while (num > 0) {
            // System.out.println(num + " num1");

            int temp = num % 10;
            // System.out.println(temp + " temp");
            revNum = (revNum * 10) + temp;
            // System.out.println(revNum + " revNum");
            num = num / 10;
            // System.out.println(num + " num2");
        }

        return revNum;
    }
}