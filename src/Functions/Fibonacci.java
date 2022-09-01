package Functions;

import java.util.Scanner;

public class Fibonacci {
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
