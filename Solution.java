import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int result = dataTypes(str.toLowerCase());
        System.out.println(result);
        sc.close();
    }

    public static int dataTypes(String type) {

        if (type.equals("integer")) {
            return 4;
        } else if (type.equals("long")) {
            return 8;
        } else if (type.equals("float")) {
            return 4;
        } else if (type.equals("double")) {
            return 8;
        } else if (type.equals("character")) {
            return 1;
        } else {
            return -1;
        }
    }
}

// public class Dtypes {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String str = sc.nextLine();

// int result = dataTypes(str.charAt(0));
// System.out.println(result);
// }

// public static int dataTypes(char ch) {
// if (ch == 'I' || ch == 'i') {
// return 4;
// } else if (ch == 'L' || ch == 'l') {
// return 8;

// } else if (ch == 'F' || ch == 'f') {
// return 4;

// } else if (ch == 'D' || ch == 'd') {
// return 8;

// } else if (ch == 'C' || ch == 'C') {
// return 1;
// } else {
// return -1;
// }
// }

// import java.util.Scanner;

// public class Solution {
// public static int main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String str = sc.nextLine();

// int ch = str.charAt(0);

// if (ch == 'I' || ch == 'i')

// {
// System.out.println("4");
// } else if (ch == 'L' || ch == 'l') {
// System.out.println("8");

// } else if (ch == 'F' || ch == 'f') {
// System.out.println("8");

// } else if (ch == 'D' || ch == 'd') {
// System.out.println("8");

// } else if (ch == 'C' || ch == 'C') {
// System.out.println("1");
// } else {
// System.out.println("-1");
// }
// return ch;
// }
// }
