package Patterns;

import java.util.Scanner;

public class pattern5 {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = n; i >= 1; i--) {

            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        scan.close();
    }
}

// * * * * *
// * * * *
// * * *
// * *
// *