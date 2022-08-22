package patterns;

import java.util.Scanner;

public class RotatedHalfPyramid {
    public static void main (String args[]){
        Scanner cs = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = cs.nextInt();
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
