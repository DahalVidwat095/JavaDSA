package Patterns;

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String args[]) {
        //input
        Scanner cs = new Scanner(System.in);
        //input rows
        System.out.print("Enter number of rows: ");
        int n = cs.nextInt();
        System.out.print("Enter number of columns: ");
        int m = cs.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == m || j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}

