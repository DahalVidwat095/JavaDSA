package Functions;

import java.util.Scanner;

public class Fibonacci {
    //Write a program to print Fibonacci series of n terms where n is input by user :
    //0 1 1 2 3 5 8 13 21 .....
    //In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
    //(BONUS)
    public static void fibonacciSequence(int n){
        int number = 0;
        int number2 = 1;
        for(int i=1; i<=n; i++){
            System.out.print(number+" ");
            number2 = number + number2;
            number = number2 - number;
        }
    }

    public static void main(String args[]){
        Scanner cs = new Scanner(System.in);
        System.out.print("Enter number of n: ");
        int n = cs.nextInt();
        fibonacciSequence(n);
    }
}
