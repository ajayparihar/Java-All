package Patterns;

import java.util.Scanner;

/**
 * pattern1
 */
public class pattern1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int j = 0; j < n; j++) {

            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        scan.close();

    }
}

// *****
// *****
// *****
// *****
// *****