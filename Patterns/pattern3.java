package Patterns;

import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) { // Row

            for (int j = 1; j <= i; j++) { // Collumn
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        scan.close();
    }
}

// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5