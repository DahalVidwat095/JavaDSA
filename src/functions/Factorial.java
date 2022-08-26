package functions;

import java.util.Scanner;

public class Factorial {
    public static void printFactorial(int n) {
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("The factorial of " + n + " is " +  factorial +".");
    }
    public static void main(String args[]){
        Scanner cs = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = cs.nextInt();
        printFactorial(n);
    }
}
