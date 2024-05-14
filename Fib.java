import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {

        // Input
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        // Calculate
        int result = 0;

        while (num >= 1) {
            result = (result - 1) + (result - 2);
            num = num - num;
            System.out.println(result);
        }
        // Output
        System.out.print(result);
    }
}