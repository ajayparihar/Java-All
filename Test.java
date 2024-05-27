/**
 * ReverseDigits
 */
public class Test {

    public static void main(String[] args) {

        int num = 1534236469;
        int result = 0;

        if (num < (Math.pow(2, 31) - 1) || num > (Math.pow(-2, 31))) {

            result = returnZero(num);

        } else {

            result = revDigit(num);

        }

        System.out.println(result);

    }

    static int revDigit(int num) {

        class Solution {
    public int reverse(int x) {

        int rev = 0;

        if (x > (Math.pow(2, 31) - 1) || x < (Math.pow(-2, 31))) {

            if(x >= 0){
            while (x >= 1){
            int temp = x % 10;
            rev = (rev * 10) + temp;
            x = x / 10;
            }
        }

            else {
            int y = Math.abs(x);
            while (y >= 1){
            int temp = y % 10;
            rev = (rev * 10) + temp;
            y = y / 10;
        return -rev;
        }
        
        }
        return 0;
    }
}
    }

    static int returnZero(int num) {
        return 0;
    }
}
