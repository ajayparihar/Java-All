import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int temp = num;

        if (revOfNumber(num) == temp) { // comparison B/W reverse of "num" and "num"

            System.out.println(temp + " is Palindrome");
        }

        else {

            System.out.println(temp + " is NOT Palindrome");
        }

        scan.close();
    }

    static int revOfNumber(int num) { // reverse of a number

        int rev = 0;

        while (num > 0) {
            int mod = num % 10;
            rev = (rev * 10) + mod;
            num = num / 10;
        }

        return rev;
    }

}
