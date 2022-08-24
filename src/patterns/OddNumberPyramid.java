package patterns;

import java.util.Scanner;

public class OddNumberPyramid {
    public static void main(String args[]){
        Scanner cs = new Scanner(System.in);
        System.out.print(" Enter number of n: ");
        int n = cs.nextInt();
        int number = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=number; j++){
                System.out.print(number+" ");
            }
            number = number + 2;
            System.out.println();
        }
    }
}
