package Functions;

import java.util.Scanner;

public class InfiniteDoWhileLoop{
/Make a function to check if a given number n is even or not.
    public static boolean isEven(int number){
        if(number%2==0){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner cs = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = cs.nextInt();
        if(isEven(number)){
            System.out.print
}
