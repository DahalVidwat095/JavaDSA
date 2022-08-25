package Functions;

import java.util.Scanner;

public class PrintMyName {
    public static void printMyName(String name){
        System.out.print(name);
        return;

    }
    public static void main(String ars[]){
        Scanner cs = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = cs.nextLine();
        printMyName(name);
    }
}
