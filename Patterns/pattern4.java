package Patterns;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) { // row
            for (int j = 1; j <= i; j++) { // collumn
                System.out.print(i + " "); // repition of row(i)
            }

            System.out.println("");
        }

        scan.close();
    }
}

// 1
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5