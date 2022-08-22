package patterns;

import java.util.Scanner;

public class Rectangle {
    public static void main(String args[]) {
        Scanner cs = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = cs.nextInt();
        System.out.print("Enter number of columns: ");
        int m = cs.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
