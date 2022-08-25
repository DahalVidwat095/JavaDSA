package Functions;

import java.util.Scanner;

public class SumOfTwo {
    public static int sumOfTwo(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String args[]){
        Scanner cs =new Scanner(System.in);
        System.out.print("Enter Your First number: ");
        int a = cs.nextInt();
        System.out.print("Enter Your Second number: ");
        int b = cs.nextInt();
        int sum = sumOfTwo(a,b);
        System.out.print("The sum is " + sum + ".");
    }
}
