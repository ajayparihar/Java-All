package Patterns;

import java.util.Scanner;

/**
 * pattern2
 */
public class pattern2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) { // Rows
            for (int j = 1; j <= i; j++) { // Collumns
                System.out.print("* ");
            }
            System.out.println("");
        }
        scan.close();

    }
}

// *
// * *
// * * *
// * * * *
// * * * * *
