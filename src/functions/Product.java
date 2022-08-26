package functions;

import java.util.Scanner;

public class Product {
    public static int product(int a, int b){
         int product = a*b;
         return product;
    }
    public static void main(String args[]){
        Scanner cs = new Scanner(System.in);
        System.out.print("First number: ");
        int a = cs.nextInt();
        System.out.print("Second number: ");
        int b = cs.nextInt();
        int product = product(a,b);
        System.out.print("Product of the given numbers is " + product +".");
    }
}
