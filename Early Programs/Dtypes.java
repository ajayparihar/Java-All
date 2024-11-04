import java.util.Scanner;

public class Dtypes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int result = dataTypes(str.charAt(0));
        System.out.println(result);

        sc.close();
    }

    public static int dataTypes(char ch) {
        if (ch == 'I' || ch == 'i') {
            return 4;
        } else if (ch == 'L' || ch == 'l') {
            return 8;

        } else if (ch == 'F' || ch == 'f') {
            return 4;

        } else if (ch == 'D' || ch == 'd') {
            return 8;

        } else if (ch == 'C' || ch == 'C') {
            return 1;
        } else {
            return -1;
        }
    }
}