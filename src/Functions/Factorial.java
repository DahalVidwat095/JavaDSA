package Functions;

import java.util.Scanner;

public class Factorial {
    public static void printFactorial(int n) {
        if(n<0){
            System.out.print("Invalid number.");
            return;
        }
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
