package Functions;

import java.util.Scanner;

public class AverageOf3 {
    //Enter 3 numbers from the user & make a function to print their average.
    public static int averageOf3(int a, int b , int c){
        int average = (a+b+c)/3;
        return average;
    }
    public static void main(String args[]){
        Scanner cs = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = cs.nextInt();
        System.out.print("Enter second number: ");
        int b = cs.nextInt();
        System.out.print("Enter third number: ");
        int c = cs.nextInt();
        System.out.print("The average of given numbers is " + averageOf3(a,b,c) + ".");
    }
}
