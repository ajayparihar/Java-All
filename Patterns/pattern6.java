package Patterns;

import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = n; i >= 1; i--) { // Row

            for (int j = 1; j <= i; j++) { // Collumn

                System.out.print(j + " "); // increment
            }
            System.out.println("");
        }

        scan.close();
    }

}

// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1