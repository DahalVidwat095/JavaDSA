package Functions;

import java.util.Scanner;

public class SumOfTwo {
    public static int sumOfTwo(int a, int b){
        int c = a+b;
        System.out.print("The sum is " + c);
        return c;
    }
    public static void main(String args[]){
        Scanner cs =new Scanner(System.in);
        System.out.print("Enter Your First number: ");
        int a = cs.nextInt();
        System.out.print("Enter Your Second number: ");
        int b = cs.nextInt();
        sumOfTwo(a,b);
    }
}
