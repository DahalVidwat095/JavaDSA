package patterns;

import java.util.Scanner;

public class CrossSign {
    public static void main(String args[]){
        Scanner cs = new Scanner(System.in);
        System.out.print("Enter number of n: ");
        int n = cs.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j==i || j==n-i+1 ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
