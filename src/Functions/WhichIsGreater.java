package Functions;

import java.util.Scanner;

public class WhichIsGreater {
    public static void findGreaterOne(int a, int b){
        if(a>b){
            System.out.print(a+ " is Greater than " +b+ ".");
        }else{
            System.out.print(a+ " is Lesser than " +b+ ".");
        }
    }
    public static void main(String args[]){
        Scanner cs = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = cs.nextInt();
        System.out.print("Enter second number: ");
        int b = cs.nextInt();
        findGreaterOne(a,b);
    }
}
