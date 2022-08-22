package patterns;

import java.util.Scanner;

public class HalfPyramid {
    public static void main (String[]args){
        Scanner cs = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = cs.nextInt();
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
