import java.util.Scanner;

public class Golden_ratio {
    public static void main(String[] args) {

        System.out.println("Enter With");
        Scanner scan = new Scanner(System.in);
        double width = scan.nextDouble();

        System.out.println("Enter height");
        Scanner scan2 = new Scanner(System.in);
        double height = scan.nextDouble();

        double result = calRatio(width, height);
        System.out.println(result);

        scan.close();
        scan2.close();
    }

    public static double calRatio(double width, double height) {

        double ratio = 1.61803398875 / ((width / height) + 1);

        return ratio * 100;
    }
}
