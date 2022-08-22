package patterns;

import java.util.Scanner;

public class AnotherPalindrome {
    public static void main (String args[]){
        Scanner cs = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = cs.nextInt();
        int number = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
                number++;
            }
            for(int j=i-1; j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
