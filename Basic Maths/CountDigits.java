import java.util.Scanner;

/**
 * CountDigits
 */
public class CountDigits {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int resultConversion = digitCountByConversion(num);
        System.out.println("By Conversion " + resultConversion);

        int resultLog10 = digitCountByLog10(num);
        System.out.println("By Log " + resultLog10);

        scan.close();

    }

    static int digitCountByConversion(int num) {

        String len = Integer.toString(num); // integer gets converted to string
        return len.length(); // length of the string is returned

    }

    static int digitCountByLog10(int num) {]
        
        int count = (int) (Math.log10(num) + 1);

        return count;
    }

}