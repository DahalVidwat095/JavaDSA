package Functions;

import java.util.Scanner;

public class SumOfAllOdd {
    //Write a function to print the sum of all odd numbers from 1 to n.
    public static void sumOfOdd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i = i + 2) {
            sum = sum + i;
        }
        System.out.print("The sum of odd numbers from 1 to "+n+ " is "+sum);
    }
    public static void main(String args[]){
        Scanner cs = new Scanner(System.in);
        System.out.print("Enter number of n: ");
        int n = cs.nextInt();
        sumOfOdd(n);
    }
}
