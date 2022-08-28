package Patterns;

import java.util.Scanner;

public class NepalFlag {
    public static void main(String args[]) {
        Scanner cs = new Scanner(System.in);
        System.out.print("Enter number of n: ");
        int n = cs.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 4; i <= n+2; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == n+2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

