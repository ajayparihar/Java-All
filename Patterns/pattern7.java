package Patterns;

import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {

            // for (int k = 1; k < (i * 2) - 1; k++) {
            // System.out.print(".");

            for (int j = n; j >= 1; j--) { // Collumns

                if (i >= j) { // when i<j it will print "."
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }

            }

            for (int j = 1; j < i; j++) { // 2nd half Collumns
                System.out.print("*");
            }

            System.out.println("");
        }
        scan.close();
    }

}

// ....*
// ...***
// ..*****
// .*******
// *********