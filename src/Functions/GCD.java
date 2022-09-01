package Functions;

import java.util.Scanner;

public class GCD {
    //Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
    public static int greatestCommonDivisor(int x, int y){
        int gcd = 0;
        for(int i=1; i<=x && i<=y; i++){
            if(x%i==0 && y%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
    public static void main(String args[]){
        Scanner cs =new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = cs.nextInt();
        System.out.print("Enter second number: ");
        int y = cs.nextInt();
        System.out.printf("The gcd of %d and %d is : %d .", x,y, greatestCommonDivisor(x,y));
    }
}
