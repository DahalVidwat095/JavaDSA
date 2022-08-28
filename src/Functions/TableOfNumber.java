package Functions;

import java.util.Scanner;

public class TableOfNumber {
   // Make a function to print the table of a given number n.
    public static void multiplicationTable(int number){
        for(int i=1; i<=10; i++){
            int product= number*i;
            System.out.println(number+ " * " + i + " = " + product);
        }
    }
    public static void main(String args[]){
        Scanner cs = new Scanner(System.in);
        System.out.print("Enter number for product table: ");
        int number = cs.nextInt();
        multiplicationTable(number);
    }
}
